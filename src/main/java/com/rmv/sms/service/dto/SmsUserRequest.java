package com.rmv.sms.service.dto;

import java.util.List;

/**
 * Created by ehdi on 9/16/16.
 */
public class SmsUserRequest extends UserCredentialRequest {

    protected List<String> srcAddresses;
    protected List<String> destAddresses;
    protected List<String> msgBody;
    protected List<Integer> msgEncoding;

    public List<String> getSrcAddresses() {
        return srcAddresses;
    }

    public void setSrcAddresses(List<String> srcAddresses) {
        this.srcAddresses = srcAddresses;
    }

    public List<String> getDestAddresses() {
        return destAddresses;
    }

    public void setDestAddresses(List<String> destAddresses) {
        this.destAddresses = destAddresses;
    }

    public List<String> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<String> msgBody) {
        this.msgBody = msgBody;
    }

    public List<Integer> getMsgEncoding() {
        return msgEncoding;
    }

    public void setMsgEncoding(List<Integer> msgEncoding) {
        this.msgEncoding = msgEncoding;
    }
}
