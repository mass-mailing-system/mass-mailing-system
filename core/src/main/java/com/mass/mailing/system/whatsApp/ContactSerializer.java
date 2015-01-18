package com.mass.mailing.system.whatsApp;

import com.mass.mailing.system.contact.Contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Illia Rudenko
 */

public class ContactSerializer {

    public static final String FILE_NAME = "contacts.txt";

    public static void serialize(List<Contact> contacts) {

        try(PrintWriter printWriter = new PrintWriter(FILE_NAME)) {

            printWriter.write(contactsToString(contacts));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile() {
        File file = new File(FILE_NAME);
        if(file.exists()) {
            file.delete();
        }
    }


    private static String contactsToString(List<Contact> contacts) {
        StringBuilder sb = new StringBuilder();

        for(Contact contact: contacts) {
            sb.append(contact.getPhoneNumber());
            sb.append(" ");
        }
        return sb.toString();
    }
}
