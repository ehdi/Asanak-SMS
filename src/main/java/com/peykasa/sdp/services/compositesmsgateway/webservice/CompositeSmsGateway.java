package com.peykasa.sdp.services.compositesmsgateway.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-02T23:15:28.260Z
 * Generated source version: 3.1.7
 *
 */
@WebService(targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "CompositeSmsGateway")
@XmlSeeAlso({ObjectFactory.class})
public interface CompositeSmsGateway {

    @WebMethod
    @RequestWrapper(localName = "getReportByMsgId", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.GetReportByMsgId")
    @ResponseWrapper(localName = "getReportByMsgIdResponse", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.GetReportByMsgIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.peykasa.sdp.services.compositesmsgateway.webservice.GetReportByMsgIdResult getReportByMsgId(
        @WebParam(name = "userCredential", targetNamespace = "")
        com.peykasa.sdp.services.compositesmsgateway.webservice.UserCredential userCredential,
        @WebParam(name = "msgIds", targetNamespace = "")
        java.util.List<java.lang.Long> msgIds
    );

    @WebMethod
    @RequestWrapper(localName = "getUserCredit", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.GetUserCredit")
    @ResponseWrapper(localName = "getUserCreditResponse", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.GetUserCreditResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.peykasa.sdp.services.compositesmsgateway.webservice.UserCreditResult getUserCredit(
        @WebParam(name = "userCredential", targetNamespace = "")
        com.peykasa.sdp.services.compositesmsgateway.webservice.UserCredential userCredential
    );

    @WebMethod
    @RequestWrapper(localName = "getReceivedMsg", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.GetReceivedMsg")
    @ResponseWrapper(localName = "getReceivedMsgResponse", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.GetReceivedMsgResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.peykasa.sdp.services.compositesmsgateway.webservice.GetReceivedMsgResult getReceivedMsg(
        @WebParam(name = "userCredential", targetNamespace = "")
        com.peykasa.sdp.services.compositesmsgateway.webservice.UserCredential userCredential,
        @WebParam(name = "destAddresses", targetNamespace = "")
        java.util.List<java.lang.String> destAddresses,
        @WebParam(name = "fromTime", targetNamespace = "")
        long fromTime,
        @WebParam(name = "maxReturnedMsg", targetNamespace = "")
        int maxReturnedMsg
    );

    @WebMethod
    @RequestWrapper(localName = "sendSmsToPort", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.SendSmsToPort")
    @ResponseWrapper(localName = "sendSmsToPortResponse", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.SendSmsToPortResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.peykasa.sdp.services.compositesmsgateway.webservice.SendSmsResult sendSmsToPort(
        @WebParam(name = "userCredential", targetNamespace = "")
        com.peykasa.sdp.services.compositesmsgateway.webservice.UserCredential userCredential,
        @WebParam(name = "srcAddresses", targetNamespace = "")
        java.util.List<java.lang.String> srcAddresses,
        @WebParam(name = "destAddresses", targetNamespace = "")
        java.util.List<java.lang.String> destAddresses,
        @WebParam(name = "msgBody", targetNamespace = "")
        java.util.List<java.lang.String> msgBody,
        @WebParam(name = "msgEncoding", targetNamespace = "")
        java.util.List<java.lang.Integer> msgEncoding,
        @WebParam(name = "sourcePorts", targetNamespace = "")
        java.util.List<java.lang.Integer> sourcePorts,
        @WebParam(name = "destinationPorts", targetNamespace = "")
        java.util.List<java.lang.Integer> destinationPorts
    );

    @WebMethod
    @RequestWrapper(localName = "sendSms", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.SendSms")
    @ResponseWrapper(localName = "sendSmsResponse", targetNamespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", className = "com.peykasa.sdp.services.compositesmsgateway.webservice.SendSmsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.peykasa.sdp.services.compositesmsgateway.webservice.SendSmsResult sendSms(
        @WebParam(name = "userCredential", targetNamespace = "")
        com.peykasa.sdp.services.compositesmsgateway.webservice.UserCredential userCredential,
        @WebParam(name = "srcAddresses", targetNamespace = "")
        java.util.List<java.lang.String> srcAddresses,
        @WebParam(name = "destAddresses", targetNamespace = "")
        java.util.List<java.lang.String> destAddresses,
        @WebParam(name = "msgBody", targetNamespace = "")
        java.util.List<java.lang.String> msgBody,
        @WebParam(name = "msgEncoding", targetNamespace = "")
        java.util.List<java.lang.Integer> msgEncoding
    );
}