package com.rmv.sms.service.dto;

import java.util.List;

/**
 * Created by ehdi on 9/17/16.
 */
public class SmsReceivedMsgRequest extends UserCredentialRequest {


    protected List<String> destAddresses;
    protected long fromTime;
    protected int maxReturnedMsg;

    public List<String> getDestAddresses() {
        return destAddresses;
    }

    public void setDestAddresses(List<String> destAddresses) {
        this.destAddresses = destAddresses;
    }

    public long getFromTime() {
        return fromTime;
    }

    public void setFromTime(long fromTime) {
        this.fromTime = fromTime;
    }

    public int getMaxReturnedMsg() {
        return maxReturnedMsg;
    }

    public void setMaxReturnedMsg(int maxReturnedMsg) {
        this.maxReturnedMsg = maxReturnedMsg;
    }
}
