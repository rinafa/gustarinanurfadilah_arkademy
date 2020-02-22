package com.mkyong.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator{
  
    private Pattern pattern;
    private Matcher matcher;
 
    private static final String USERNAME_PATTERN = "^[a-z-_]{5,8}";
    
    public UsernameValidator(){
      pattern = Pattern.compile(USERNAME_PATTERN);
    }
    
    /**
     * Validate username with regular expression
     * @param username username for validation
     * @return true valid username, false invalid username
     */
    public boolean validate(final String username){
      
      matcher = pattern.matcher(username);
      return matcher.matches();
            
    }
}


package com.javacodegeeks.java.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

  private Pattern pattern;
  private Matcher matcher;

  private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z]) (?=.*[0-9])(?=[!]).{9}$";

  public PasswordValidator() {
    pattern = Pattern.compile(PASSWORD_PATTERN);
  }

  public boolean validate(final String password) {

    matcher = pattern.matcher(password);
    return matcher.matches();