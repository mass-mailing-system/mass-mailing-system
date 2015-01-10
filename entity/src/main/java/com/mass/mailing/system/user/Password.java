package com.mass.mailing.system.user;

import com.mass.mailing.system.user.exception.InvalidParameterException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Password must meet the following requirements:
 *  - a digit must occur at least once
 *  - a lower case letter must occur at least once
 *  - no whitespace allowed in the entire string
 *  - at least 5 characters required
 *
 * @author Illia Rudenko
 */

public class Password {

    public static final Pattern VALID_PASSWORD_REGEX =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,}$", Pattern.CASE_INSENSITIVE);

    private String passwordStr;

    public Password(String passwordStr) throws InvalidParameterException {
        if(isValid(passwordStr)) {
            this.passwordStr = passwordStr;
        } else
            throw new InvalidParameterException("Wrong Password");
    }

    private boolean isValid(String passwordStr) {
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(passwordStr);
        return matcher.find();
    }

    public String getPasswordStr() {
        return passwordStr;
    }
}
