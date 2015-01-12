/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mass.mailing.system.contact;

/**
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class Contact {
    protected Long id;
    
    private String email;
    private String phoneNumber;
    
    /**
     * @return the resourseTo
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the resourseTo to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
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
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
