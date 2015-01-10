package com.mass.mailing.system.user;

import com.mass.mailing.system.user.exception.InvalidParameterException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Illia Rudenko
 */
public class UserName {

    public static final Pattern VALID_LOGIN_REGEX =
            Pattern.compile("^[a-zA-Z0-9._-]{3,}$", Pattern.CASE_INSENSITIVE);

    private String loginStr;

    public UserName(String loginStr) throws InvalidParameterException {
        if(isValid(loginStr)) {
            this.loginStr = loginStr;
        } else
            throw new InvalidParameterException("Wrong Login");
    }

    private boolean isValid(String loginStr) {
        Matcher matcher = VALID_LOGIN_REGEX.matcher(loginStr);
        return matcher.find();
    }

    public String getUserNameStr() {
        return loginStr;
    }

}
