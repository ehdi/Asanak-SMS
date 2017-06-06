package com.rmv.sms.service.dto;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Created by ehdi on 9/14/16.
 */

@Component
public class SmsSendRequestDTO {

    @NotNull
    @Size(min = 11, max = 12)
    @Column(length = 12, nullable = false)
    private String destAddresses;
    @NotNull
    private String msgBody;

    public String getDestAddresses() {
        return destAddresses;
    }

    public void setDestAddresses(String destAddresses) {
        this.destAddresses = destAddresses;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }
}
