package com.rmv.sms.service.dto;

import javax.validation.constraints.NotNull;

/**
 * Created by ehdi on 9/17/16.
 */
public class SmsReceivedMsgRequestDTO {


    private String destAddresses;
    private String maxReturnedMsg;
    @NotNull
    private String fromTime;


    public String getDestAddresses() {
        return destAddresses;
    }

    public void setDestAddresses(String destAddresses) {
        this.destAddresses = destAddresses;
    }

    public String getMaxReturnedMsg() {
        return maxReturnedMsg;
    }

    public void setMaxReturnedMsg(String maxReturnedMsg) {
        this.maxReturnedMsg = maxReturnedMsg;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }
}
