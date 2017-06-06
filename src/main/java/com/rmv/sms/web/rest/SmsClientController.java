package com.rmv.sms.web.rest;

import com.peykasa.sdp.services.compositesmsgateway.webservice.GetReceivedMsgResult;
import com.peykasa.sdp.services.compositesmsgateway.webservice.SendSmsResult;
import com.rmv.sms.security.AuthoritiesConstants;
import com.rmv.sms.service.dto.ResponseDTO;
import com.rmv.sms.service.dto.SmsSendRequestDTO;
import com.rmv.sms.service.dto.SmsReceivedMsgRequestDTO;
import com.rmv.sms.service.soap.AsanakSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;


@RestController
@RequestMapping("/api/sms")
public class SmsClientController {

    @Autowired
    AsanakSmsService asanakSmsService;

    @Secured(AuthoritiesConstants.USER)
    @RequestMapping(value = "/asank/send",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public SendSmsResult AsanakSendSms(@RequestBody @Validated SmsSendRequestDTO requestDTO) {
        return asanakSmsService.sendSms(requestDTO);
    }


    @Secured(AuthoritiesConstants.ADMIN)
    @RequestMapping(value = "/get-received",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public GetReceivedMsgResult getReceivedMsgResult(@RequestBody @Validated SmsReceivedMsgRequestDTO requestDTO) throws ParseException {
        return asanakSmsService.getReceivedMsg(requestDTO);
    }


}
