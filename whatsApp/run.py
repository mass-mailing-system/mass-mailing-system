__author__ = 'Illya'

from stack import YowsupSendStack
import sys

if __name__==  "__main__":
  contacts_and_message_file = sys.argv[1]
  sender_tel = sys.argv[2]
  sender_password = sys.argv[3]

#checking for null values
  if contacts_and_message_file is None or sender_tel is None or sender_password is None:
    print 'run.py <tel_numbers_file> <text_message> <sender_tel> <sender_password (base64)>'
    sys.exit(2)

# reading phone numbers from file
  text_file = open(contacts_and_message_file, 'r')
  contacts_and_message_str = text_file.read().rstrip()
  text_file.close()

  contacts_and_message_list = contacts_and_message_str.split(':')

# getting contacts_list
  contacts_list = contacts_and_message_list[0].split(' ')

# getting text_message to send
  text_message = contacts_and_message_list[1]

  message_tuples = []
# creating tuples like <phone_number, text_message>
  for tel_number in contacts_list:
    tel_tuple = (tel_number, text_message)
    message_tuples.append(tel_tuple)
  
  print message_tuples

#setting credentials
  credentials = (sender_tel, sender_password)  
  
  print credentials

# sending messages
  x = YowsupSendStack(credentials, message_tuples, False)
  x.start()
