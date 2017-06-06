package com.rmv.sms.service.soap;

import com.peykasa.sdp.services.compositesmsgateway.webservice.CompositeSmsGateway;

/**
 * Created by ehdi on 9/15/16.
 */
public interface SoapClient {

    default CompositeSmsGateway getSoapClient(){
        return StaticSoapContainer.getSoapClient();
    }

}
