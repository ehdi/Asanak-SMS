package com.rmv.sms.service.dto;


/**
 * Created by ehdi on 9/14/16.
 */

public class SmsUser {

    private String sourceAddress;
    private String username;
    private String password;

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
