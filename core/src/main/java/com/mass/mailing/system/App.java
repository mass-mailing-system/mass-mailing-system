package com.mass.mailing.system;

import com.mass.mailing.system.contact.Contact;
import com.mass.mailing.system.message.MessageService;
import com.mass.mailing.system.message.MessageTemplate;
import com.mass.mailing.system.message.TextMessageLayer;
import com.mass.mailing.system.whatsApp.ContactSerializer;
import com.mass.mailing.system.whatsApp.WhatsAppSender;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MessageService msgService = new MessageService();

        MessageTemplate msgTemplate = new MessageTemplate(234L, new TextMessageLayer("Hello"));
        msgService.setMessageTemplate(msgTemplate);

        Contact contact = new Contact();
        contact.setPhoneNumber("<phone example>");
        msgService.setContact(contact);

        msgService.setMesseger(new WhatsAppSender(msgService));

        msgService.send();

//        Contact contact = new Contact();
//        contact.setPhoneNumber("");
//        ContactSerializer.serialize(new ArrayList<>(Arrays.asList(new Contact[] {contact})));
    }
}
