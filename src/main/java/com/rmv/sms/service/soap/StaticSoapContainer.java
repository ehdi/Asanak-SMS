package com.rmv.sms.service.soap;

import com.peykasa.sdp.services.compositesmsgateway.webservice.CompositeSmsGateway;
import com.peykasa.sdp.services.compositesmsgateway.webservice.CompositeSmsGatewayService;

import javax.xml.ws.BindingProvider;

/**
 * Created by ehdi on 9/16/16.
 */
public class StaticSoapContainer {

    private final static CompositeSmsGateway soapClient = new CompositeSmsGatewayService().getCompositeSmsGateway();

    //JAX-WS time out config
    static {
        ((BindingProvider) soapClient).getRequestContext().put("com.sun.xml.internal.ws.request.timeout", 60000);
        ((BindingProvider) soapClient).getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", 60000);
    }

    public static CompositeSmsGateway getSoapClient() {
        return soapClient;
    }

}
