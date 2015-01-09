/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mass.mailing.system.message;

/**
 * Для добавления нового месседжера нужно 
 * наследоваться от этого класса и переопределить метод sendMsgs()
 * 
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public abstract class Message {

    private MessageTemplate messageTemplate = null;

    public Message() {
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
    
    public abstract void sendMsgs();
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
