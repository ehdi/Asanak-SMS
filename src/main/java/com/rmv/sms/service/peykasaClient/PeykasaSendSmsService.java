package com.rmv.sms.service.peykasaClient;

import com.peykasa.sdp.services.compositesmsgateway.webservice.GetReceivedMsgResult;
import com.peykasa.sdp.services.compositesmsgateway.webservice.SendSmsResult;
import com.rmv.sms.service.dto.*;
import com.rmv.sms.service.soap.AsanakSmsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.ParseException;

/**
 * Created by ehdi on 9/16/16.
 */

@Service
public class PeykasaSendSmsService implements AsanakSmsService {

    @Value("${sms.asanak.sourceAddress}")
    private String sourceAddress;
    @Value("${sms.asanak.username}")
    private String username;
    @Value("${sms.asanak.password}")
    private String password;

    @Override
    public SendSmsResult sendSms(SmsSendRequestDTO requestDTO) {
        SmsUser smsUser =  new SmsUser();
        smsUser.setSourceAddress(sourceAddress);
        smsUser.setUsername(username);
        smsUser.setPassword(password);

        SmsUserRequest smsUserRequest =  AsanakSmsService.convertSendSmsUserDTOtoBean(smsUser, requestDTO);

        return getSoapClient().sendSms(
            smsUserRequest.getUserCredential(),
            smsUserRequest.getSrcAddresses(),
            smsUserRequest.getDestAddresses(),
            smsUserRequest.getMsgBody(),
            smsUserRequest.getMsgEncoding()
        );

    }

    @Override
    public GetReceivedMsgResult getReceivedMsg(SmsReceivedMsgRequestDTO requestDTO) throws ParseException {
        SmsUser smsUser =  new SmsUser();
        smsUser.setSourceAddress(sourceAddress);
        smsUser.setUsername(username);
        smsUser.setPassword(password);

        SmsReceivedMsgRequest smsReceivedMsgRequest =  AsanakSmsService.convertGetReceivedMsgDTOtoBean(smsUser, requestDTO);

        return getSoapClient().getReceivedMsg(
            smsReceivedMsgRequest.getUserCredential(),
            smsReceivedMsgRequest.getDestAddresses(),
            smsReceivedMsgRequest.getFromTime(),
            smsReceivedMsgRequest.getMaxReturnedMsg()
        );
    }



}
