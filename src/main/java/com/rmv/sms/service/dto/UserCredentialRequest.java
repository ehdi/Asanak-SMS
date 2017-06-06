package com.rmv.sms.service.dto;

import com.peykasa.sdp.services.compositesmsgateway.webservice.UserCredential;

/**
 * Created by ehdi on 9/17/16.
 */
public class UserCredentialRequest {

    protected UserCredential userCredential;

    public UserCredential getUserCredential() {
        return userCredential;
    }

    public void setUserCredential(UserCredential userCredential) {
        this.userCredential = userCredential;
    }
}
