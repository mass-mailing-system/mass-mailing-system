package com.mass.mailing.system.user;

import com.mass.mailing.system.user.exception.InvalidParameterException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Illia Rudenko
 */
public class Email {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private String emailStr;

    public Email(final String emailStr) throws InvalidParameterException {
        if(isValid(emailStr)) {
            this.emailStr = emailStr;
        } else
            throw new InvalidParameterException("Wrong Email");
    }

    private boolean isValid(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }

    public String getEmailStr() {
        return emailStr;
    }
}
