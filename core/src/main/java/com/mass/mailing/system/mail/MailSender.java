/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mass.mailing.system.mail;

import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Artur
 *
 * this class is temporary. It uses fake google mail address later I edit it, so
 * then it'll use local SMTP-Server (Apache James) when I finish, I attach or
 * write here manual on James
 *
 * but now here is this..
 * PS
 * user -> com.mass.mail.sender
 * pwd -> commassmailsender
 */
public class MailSender {
    private final String from = "com.mass.mail.sender@gmail.com";
    private final Session session;
    private Message message;

    public MailSender() {
        String host = "smtp.gmail.com";

        // Create properties
        Properties properties = new Properties();

        // Setup mail server
        //properties.put("mail.debug", "true"); // uncomment if you want to debug, but it writes to console
        // if no logger is installed
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");

        // Get the default Session object. As we use Gmail host, we must authorize
        session = Session.getDefaultInstance(properties,
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, "commassmailsender");
                    }
                });
    }
    /**
     * creates new message instance and adds to it sender, subject and recepients
     * 
     * @param to - recepients mail addresses
     * @param msgSubject - message subject
     * @throws MessagingException 
     */
    private void initializeMessage(String[] to, String msgSubject) throws MessagingException {
        // Sender's email ID needs to be mentioned

        // Create a default MimeMessage object.
        message = new MimeMessage(session);

        // Set From: header field of the header.
        message.setFrom(new InternetAddress(from));

        // Set To: header field of the header.
        InternetAddress[] addresses = new InternetAddress[to.length];
        for (int i = 0; i < to.length; i++) {
            addresses[i] = new InternetAddress(to[i]);
        }
        message.addRecipients(Message.RecipientType.TO, addresses);

        // Set Subject: header field
        message.setSubject(msgSubject);
    }

    /**
     * sends text message to single recepient
     *
     * @param to - recepients mail addresses
     * @param msgSubject - message subject
     * @param text - text content
     */
    public void send(String to, String msgSubject, String text) {
        send(new String[] { to }, msgSubject, text);
    }
    
    /**
     * sends message with file to single recepient
     *
     * @param to - recepients mail addresses
     * @param msgSubject - message subject
     * @param text - text content
     * @param attachmentPath - path to file attachment
     */
    public void send(String to, String msgSubject, String text, String attachmentPath) {
        send(new String[] { to }, msgSubject, text, attachmentPath);
    }
    
    /**
     * sends text messages only
     *
     * @param to - recepients mail addresses
     * @param msgSubject - message subject
     * @param text - text content
     */
    public void send(String[] to, String msgSubject, String text) {
        try {
            initializeMessage(to, msgSubject);
            // Now set the actual message
            message.setText(text);

            // Send message
            Transport.send(message);
            // here will be logger
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    /**
     * sends text messages with file attachment
     *
     * @param to - recepients mail addresses
     * @param msgSubject - message subject
     * @param text - text content
     * @param attachmentPath - path to file attachment
     */
    public void send(String[] to, String msgSubject, String text, String attachmentPath) {
        try {
            initializeMessage(to, msgSubject);
            BodyPart messageBodyPart = new MimeBodyPart();

            // Fill the message
            messageBodyPart.setText(text);

            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(attachmentPath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(attachmentPath);
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            // Send message
            Transport.send(message);
            // here will be logger
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
