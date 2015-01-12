package com.mass.mailing.system.message.messageImpl;


import com.mass.mailing.system.message.AbstractMessage;

/**
 *
 * @author Illia Rudenko
 */
public class MailMessage extends AbstractMessage {

    //Невозможно прописать dependency двух пакетов так, чтобы они ссылались друг на друга
    //Тоесть в pom.xml entity нельзя прописать core dependency и одновременно с этим
    // в pom.xml core нельзя прописать  entity dependency, поэтому здесь невозможно сделать поле MailMessenger

    @Override
    public void send() {

        //TODO: consider how to implement
    }
}
