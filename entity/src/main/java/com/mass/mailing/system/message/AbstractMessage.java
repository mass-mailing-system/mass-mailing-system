/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mass.mailing.system.message;

import com.mass.mailing.system.contact.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Для добавления нового месседжера нужно 
 * наследоваться от этого класса и переопределить метод send()
 * 
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public abstract class AbstractMessage {

    private MessageTemplate messageTemplate = null;

    /**
     *
     * contacts to send message
     */
    private List<Contact> contacts = new ArrayList<>();

    public AbstractMessage() {
    }

    /**
     * @param messageTemplate the messageTemplate to set
     */
    public void setMessageTemplate(MessageTemplate messageTemplate) {
        this.messageTemplate = messageTemplate;
    }

    public boolean isSetMessageTemplate(){
        return messageTemplate != null;
    }

    /**
     * @param contacts the contacts to set
     */
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    /**
     * @param contacts the contacts to add
     */
    public void addContacts(List<Contact> contacts) {
        this.contacts.addAll(contacts);
    }
    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        contacts.add(contact);
    }
    
    public abstract void send();
//    {
//        if( !isSetMessageTemplate() )
//            return;
//        for (MessageLayer msgLayer : messageTemplate.getMsgLayers()) {
//            if (msgLayer instanceof TextMessageLayer) {
//                //((TextMessageLayer) (msgLayer));
//            } else if (msgLayer instanceof FileMessageLayer) {
//                //((FileMessageLayer) (msgLayer));
//            }
//        }
//    }
//    protected abstract void sendMsg( TextMessageLayer tml );
//    protected abstract void sendMsg( FileMessageLayer fml );

}
