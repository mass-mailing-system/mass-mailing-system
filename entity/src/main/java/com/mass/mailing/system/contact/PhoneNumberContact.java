/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mass.mailing.system.contact;

/**
 * Класс с данными для отправки сообщения (phone number)
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class PhoneNumberContact extends AbstractContact {
    private String resourseTo;
  
    public PhoneNumberContact(){}
    public PhoneNumberContact( String resourceTo, Long id ){
        this.resourseTo = resourceTo;
        this.id = id;
    }
    
    /**
     * @return the resourseTo
     */
    public String getResourseTo() {
        return resourseTo;
    }

    /**
     * @param resourseTo the resourseTo to set
     */
    public void setResourseTo(String resourseTo) {
        this.resourseTo = resourseTo;
    }
}
