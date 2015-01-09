/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mass.mailing.system.contact;

/**
 * Класс с данными для отправки сообщения (email)
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class EmailContact extends AbstractContact {
    private String resourseTo;

    public EmailContact(){}
    public EmailContact( String resourceTo, Long id ){
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
