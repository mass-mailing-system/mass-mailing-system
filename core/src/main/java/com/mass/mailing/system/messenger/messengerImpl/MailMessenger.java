package com.mass.mailing.system.messenger.messengerImpl;

import com.mass.mailing.system.message.AbstractMessage;
import com.mass.mailing.system.messenger.Messenger;
import com.mass.mailing.system.user.User;

/**
 * @author Illia Rudenko
 */
public class MailMessenger implements Messenger {

    private User user;

    public MailMessenger(final User user) {
        this.user = user;
    }

    @Override
    public void send(AbstractMessage abstractMsg) {
        //TODO: consider how to implement
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
