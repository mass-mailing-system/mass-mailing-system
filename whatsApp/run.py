__author__ = 'Illya'

from stack import YowsupSendStack
import sys

if __name__==  "__main__":
  file_name = sys.argv[1]
  text_message = sys.argv[2]
  sender_tel = sys.argv[3]
  sender_password = sys.argv[4]

#checking for null values
  if file_name is None or text_message is None or sender_tel is None or sender_password is None:
    print 'run.py <tel_numbers_file> <text_message> <sender_tel> <sender_password (base64)>'
    system.exit(2)

# reading phone numbers from file
  text_file = open(file_name, 'r')
  numbers_str = text_file.read().rstrip()
  text_file.close()
  
  list_numbers = numbers_str.split(' ')

  message_tuples = []
# creating tuples like <phone_number, text_message>
  for tel_number in list_numbers:
    tel_tuple = (tel_number, text_message)
    message_tuples.append(tel_tuple)
  
  print message_tuples

#setting credentials
  credentials = (sender_tel, sender_password)  
  
  print credentials

# sending messages
  x = YowsupSendStack(credentials, messages, False)
  x.start()
