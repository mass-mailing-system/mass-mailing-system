package com.mass.mailing.system.user;


/**
 * @author Illia Rudenko
 */
public class User {

    private Email email;

    private UserName userName;

    private Password password;

    public User(final Email email,
                final UserName userName,
                final Password password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public Email getEmail() {
        return email;
    }

    public UserName getUserName() {
        return userName;
    }

    public Password getPassword() {
        return password;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
