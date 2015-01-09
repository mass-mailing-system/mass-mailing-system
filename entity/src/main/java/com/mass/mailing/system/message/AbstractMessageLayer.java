/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mass.mailing.system.message;

import com.mass.mailing.system.contact.Contact;
import java.util.List;

/**
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public abstract class AbstractMessageLayer implements MessageLayer {
    protected Long id;
    private List<Contact> contacts;
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the contacts
     */
    public List<Contact> getContacts() {
        return contacts;
    }

    /**
     * @param contacts the contacts to set
     */
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    /**
     * @param contact the contacts to set
     */
    public void setContact(Contact contact) {
        contacts.add(contact);
    }
}
