/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanPlayer.bll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kyle
 */
public class UserAccount {
    private String userName;
    private String password;
    private String email;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    private String message = "";
    
    public UserAccount(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    
    public boolean ValidAccount() {
        boolean validAccount = false;
        int validEntries = 0;
        final int VALID_ENTRIES_REQUIRED = 3;
        
        // validate User Name
        if (!userName.equals("")) {
            validEntries++;
        }
        else {
            message += "User Name cannot be blank.\n";
        }

        // Validate Password
        if (password.matches("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*_-]).+$") && !password.equals("")) {
            validEntries++;
        }  
        else {
            message += "Password cannot be blank and must have at least one letter, one number, and one special character.\n";
        }

        // Validate Email
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
        if (matcher.find()) {
            validEntries++;
        }
        else {
            message += "Email must follow standard conventions.";
        }
        
        if (validEntries == VALID_ENTRIES_REQUIRED) {
            validAccount = true;
        }
        
        return validAccount;
    }
    
    public String InvalidMessage() {
        return message;
    }
    
}
