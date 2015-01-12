/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mass.mailing.system.message;

import com.mass.mailing.system.contact.Contact;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Сервис отправки сообщений
 * В этом классе устанавливаем необходимые параметры (сообщение, контакты, 
 * необходимые месседжеры) и вызываем метод send()
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class MessageService {

    //private ExecutorService service;
    private MessageTemplate messageTemplate = null;
    private List<Messager> messagers;

    /**
     *
     * contacts to send message
     */
    private List<Contact> contacts;

    public MessageService() {
        // заменить иньекцией со спринга
        //service = Executors.newFixedThreadPool(4);
        contacts = new ArrayList<>();
        messagers = new ArrayList<>();

    }

    /**
     * @param messageTemplate the messageTemplate to set
     */
    public void setMessageTemplate(MessageTemplate messageTemplate) {
        this.messageTemplate = messageTemplate;
    }

    public boolean isSetMessageTemplate() {
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
        this.contacts.add(contact);
    }

    /**
     * @return the messageTemplate
     */
    public MessageTemplate getMessageTemplate() {
        return messageTemplate;
    }

    /**
     * @return the contacts
     */
    public List<Contact> getContacts() {
        return contacts;
    }

    /**
     * @param m the messeger to set
     */
    public void setMesseger(Messager m) {
        messagers.add(m);
    }

    /**
     * @return the messagers
     */
    public List<Messager> getMessagers() {
        return messagers;
    }

    /**
     * @param messagers the messagers to set
     */
    public void setMessagers(List<Messager> messagers) {
        this.messagers = messagers;
    }

    public void send() {
        for (Messager mgr : messagers) {
            // В многопоточной версии здесь mgr передается в ExecutorService
            // service.submit(mgr);
            mgr.execute();
        }
    }

}
