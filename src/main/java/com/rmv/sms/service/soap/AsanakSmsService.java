package com.rmv.sms.service.soap;


import com.peykasa.sdp.services.compositesmsgateway.webservice.GetReceivedMsgResult;
import com.peykasa.sdp.services.compositesmsgateway.webservice.SendSmsResult;
import com.peykasa.sdp.services.compositesmsgateway.webservice.UserCredential;
import com.rmv.sms.service.dto.*;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ehdi on 9/16/16.
 */

@Component
public interface AsanakSmsService extends SoapClient {

    SendSmsResult sendSms(SmsSendRequestDTO requestDTO);

    GetReceivedMsgResult getReceivedMsg(SmsReceivedMsgRequestDTO requestDTO) throws ParseException;


    static SmsUserRequest convertSendSmsUserDTOtoBean(SmsUser smsUser, SmsSendRequestDTO requestDTO){

        UserCredential userCredential = new UserCredential();
        userCredential.setUsername(smsUser.getUsername());
        userCredential.setPassword(smsUser.getPassword());

        ArrayList<String> sourceAddress = new ArrayList<>();
        sourceAddress.add(smsUser.getSourceAddress());

        ArrayList<String> destAddresses = new ArrayList<>();
        destAddresses.add(requestDTO.getDestAddresses());

        ArrayList<String> msgBody = new ArrayList<>();
        msgBody.add(requestDTO.getMsgBody());

        ArrayList<Integer> msgEncoding = new ArrayList<>();
        msgEncoding.add(8);

        SmsUserRequest smsUserRequest = new SmsUserRequest();
        smsUserRequest.setUserCredential(userCredential);
        smsUserRequest.setSrcAddresses(sourceAddress);
        smsUserRequest.setDestAddresses(destAddresses);
        smsUserRequest.setMsgBody(msgBody);
        smsUserRequest.setMsgEncoding(msgEncoding);

        return smsUserRequest;
    }

    static SmsReceivedMsgRequest convertGetReceivedMsgDTOtoBean(SmsUser smsUser, SmsReceivedMsgRequestDTO requestDTO)
        throws ParseException {

        UserCredential userCredential = new UserCredential();
        userCredential.setUsername(smsUser.getUsername());
        userCredential.setPassword(smsUser.getPassword());

        SmsReceivedMsgRequest smsReceivedMsgRequest = new SmsReceivedMsgRequest();
        smsReceivedMsgRequest.setUserCredential(userCredential);

        if(requestDTO.getFromTime() != null) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            String dateInString = requestDTO.getFromTime(); //"22-01-2016 10:20:56"
            Date date = null;
            date = sdf.parse(dateInString);

            if (date != null) {
                smsReceivedMsgRequest.setFromTime(date.getTime());
            }
        }

        if(requestDTO.getMaxReturnedMsg() != null) {
            Integer maxReturnMsg = Integer.parseInt(requestDTO.getMaxReturnedMsg());
            smsReceivedMsgRequest.setMaxReturnedMsg(maxReturnMsg);
        }

        if(requestDTO.getDestAddresses() != null) {
            ArrayList<String> destAddresses = new ArrayList<>();
            destAddresses.add(requestDTO.getDestAddresses());
            smsReceivedMsgRequest.setDestAddresses(destAddresses);
        }

        return smsReceivedMsgRequest;
    }

}
