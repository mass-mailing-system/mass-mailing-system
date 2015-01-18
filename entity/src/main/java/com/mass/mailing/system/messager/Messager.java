/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mass.mailing.system.messager;

import com.mass.mailing.system.message.MessageService;

/**
 * Абстрактный Класс для создания нового месседжера
 * Для того что бы создать новый месседжер, нужно наследоватся от этого класса
 * и переопределить метод execute()
 * (в этом методе реализуется отправка сообщения на конкретный месседжер)
 * @author Kozak Oleg
 */
public abstract class Messager implements Runnable {
    private MessageService m;

    public Messager( MessageService m ){
        this.m = m;
    }
    
    // В этом методе идет отправка сообщения на конкретный месседжер
    public abstract void execute();
    
    @Override
    public void run() {
        //execute();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public MessageService getMessageService() {
        return m;
    }
    
}
