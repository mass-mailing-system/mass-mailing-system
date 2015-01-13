/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mass.mailing.system;

import com.mass.mailing.system.mail.MailSender;
import org.junit.Test;

/**
 *
 * @author Artur
 */
public class MailSenderTest {
    @Test
    public void testSimpleTextMessageSending() {
        MailSender simpleTextSender = new MailSender();
        simpleTextSender.send("psyhoge@gmail.com" , "Mail Test", "EHLO");
    }
    
    @Test
    public void testFileMessageSending() {        
        MailSender fileSender = new MailSender();
        fileSender.send("psyhoge@gmail.com", "Mail Test", "EHLO", "Rising.jpeg");
    }
}
