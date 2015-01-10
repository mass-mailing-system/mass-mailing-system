package com.mass.mailing.system.messenger;

import com.mass.mailing.system.message.AbstractMessage;

/**
 * @author Illia Rudenko
 */
public interface Messenger {

    public void send(AbstractMessage abstractMsg);

}
