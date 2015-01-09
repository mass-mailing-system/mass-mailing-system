package com.mass.mailing.system.message;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class MessageTemplate {

    private List<MessageLayer> msgLayers = new ArrayList<>();

    public MessageTemplate(){}

    public MessageTemplate(MessageLayer msgLayer) {
        msgLayers.add(msgLayer);
    }

    public MessageTemplate(List<MessageLayer> msgLayers){
        this.msgLayers.addAll(msgLayers);
    }


    public List<MessageLayer> getMsgLayers() {
        return msgLayers;
    }

    public void setMsgLayers(List<MessageLayer> msgLayers) {
        this.msgLayers = msgLayers;
    }

    public void setMsgLayer(MessageLayer msgLayer) {
        this.msgLayers.add(msgLayer);
    }
}
