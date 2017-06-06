
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.peykasa.sdp.services.compositesmsgateway.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetReceivedMsg_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "getReceivedMsg");
    private final static QName _GetReceivedMsgResponse_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "getReceivedMsgResponse");
    private final static QName _GetReportByMsgId_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "getReportByMsgId");
    private final static QName _GetReportByMsgIdResponse_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "getReportByMsgIdResponse");
    private final static QName _GetUserCredit_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "getUserCredit");
    private final static QName _GetUserCreditResponse_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "getUserCreditResponse");
    private final static QName _SendSms_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "sendSms");
    private final static QName _SendSmsResponse_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "sendSmsResponse");
    private final static QName _SendSmsToPort_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "sendSmsToPort");
    private final static QName _SendSmsToPortResponse_QNAME = new QName("http://webService.compositeSmsGateway.services.sdp.peykasa.com/", "sendSmsToPortResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.peykasa.sdp.services.compositesmsgateway.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReceivedMsg }
     * 
     */
    public GetReceivedMsg createGetReceivedMsg() {
        return new GetReceivedMsg();
    }

    /**
     * Create an instance of {@link GetReceivedMsgResponse }
     * 
     */
    public GetReceivedMsgResponse createGetReceivedMsgResponse() {
        return new GetReceivedMsgResponse();
    }

    /**
     * Create an instance of {@link GetReportByMsgId }
     * 
     */
    public GetReportByMsgId createGetReportByMsgId() {
        return new GetReportByMsgId();
    }

    /**
     * Create an instance of {@link GetReportByMsgIdResponse }
     * 
     */
    public GetReportByMsgIdResponse createGetReportByMsgIdResponse() {
        return new GetReportByMsgIdResponse();
    }

    /**
     * Create an instance of {@link GetUserCredit }
     * 
     */
    public GetUserCredit createGetUserCredit() {
        return new GetUserCredit();
    }

    /**
     * Create an instance of {@link GetUserCreditResponse }
     * 
     */
    public GetUserCreditResponse createGetUserCreditResponse() {
        return new GetUserCreditResponse();
    }

    /**
     * Create an instance of {@link SendSms }
     * 
     */
    public SendSms createSendSms() {
        return new SendSms();
    }

    /**
     * Create an instance of {@link SendSmsResponse }
     * 
     */
    public SendSmsResponse createSendSmsResponse() {
        return new SendSmsResponse();
    }

    /**
     * Create an instance of {@link SendSmsToPort }
     * 
     */
    public SendSmsToPort createSendSmsToPort() {
        return new SendSmsToPort();
    }

    /**
     * Create an instance of {@link SendSmsToPortResponse }
     * 
     */
    public SendSmsToPortResponse createSendSmsToPortResponse() {
        return new SendSmsToPortResponse();
    }

    /**
     * Create an instance of {@link UserCredential }
     * 
     */
    public UserCredential createUserCredential() {
        return new UserCredential();
    }

    /**
     * Create an instance of {@link GetReportByMsgIdResult }
     * 
     */
    public GetReportByMsgIdResult createGetReportByMsgIdResult() {
        return new GetReportByMsgIdResult();
    }

    /**
     * Create an instance of {@link ReportItem }
     * 
     */
    public ReportItem createReportItem() {
        return new ReportItem();
    }

    /**
     * Create an instance of {@link GetReceivedMsgResult }
     * 
     */
    public GetReceivedMsgResult createGetReceivedMsgResult() {
        return new GetReceivedMsgResult();
    }

    /**
     * Create an instance of {@link ReceivedMsg }
     * 
     */
    public ReceivedMsg createReceivedMsg() {
        return new ReceivedMsg();
    }

    /**
     * Create an instance of {@link UserCreditResult }
     * 
     */
    public UserCreditResult createUserCreditResult() {
        return new UserCreditResult();
    }

    /**
     * Create an instance of {@link SendSmsResult }
     * 
     */
    public SendSmsResult createSendSmsResult() {
        return new SendSmsResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceivedMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "getReceivedMsg")
    public JAXBElement<GetReceivedMsg> createGetReceivedMsg(GetReceivedMsg value) {
        return new JAXBElement<GetReceivedMsg>(_GetReceivedMsg_QNAME, GetReceivedMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceivedMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "getReceivedMsgResponse")
    public JAXBElement<GetReceivedMsgResponse> createGetReceivedMsgResponse(GetReceivedMsgResponse value) {
        return new JAXBElement<GetReceivedMsgResponse>(_GetReceivedMsgResponse_QNAME, GetReceivedMsgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportByMsgId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "getReportByMsgId")
    public JAXBElement<GetReportByMsgId> createGetReportByMsgId(GetReportByMsgId value) {
        return new JAXBElement<GetReportByMsgId>(_GetReportByMsgId_QNAME, GetReportByMsgId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportByMsgIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "getReportByMsgIdResponse")
    public JAXBElement<GetReportByMsgIdResponse> createGetReportByMsgIdResponse(GetReportByMsgIdResponse value) {
        return new JAXBElement<GetReportByMsgIdResponse>(_GetReportByMsgIdResponse_QNAME, GetReportByMsgIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserCredit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "getUserCredit")
    public JAXBElement<GetUserCredit> createGetUserCredit(GetUserCredit value) {
        return new JAXBElement<GetUserCredit>(_GetUserCredit_QNAME, GetUserCredit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserCreditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "getUserCreditResponse")
    public JAXBElement<GetUserCreditResponse> createGetUserCreditResponse(GetUserCreditResponse value) {
        return new JAXBElement<GetUserCreditResponse>(_GetUserCreditResponse_QNAME, GetUserCreditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "sendSms")
    public JAXBElement<SendSms> createSendSms(SendSms value) {
        return new JAXBElement<SendSms>(_SendSms_QNAME, SendSms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "sendSmsResponse")
    public JAXBElement<SendSmsResponse> createSendSmsResponse(SendSmsResponse value) {
        return new JAXBElement<SendSmsResponse>(_SendSmsResponse_QNAME, SendSmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsToPort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "sendSmsToPort")
    public JAXBElement<SendSmsToPort> createSendSmsToPort(SendSmsToPort value) {
        return new JAXBElement<SendSmsToPort>(_SendSmsToPort_QNAME, SendSmsToPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsToPortResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.compositeSmsGateway.services.sdp.peykasa.com/", name = "sendSmsToPortResponse")
    public JAXBElement<SendSmsToPortResponse> createSendSmsToPortResponse(SendSmsToPortResponse value) {
        return new JAXBElement<SendSmsToPortResponse>(_SendSmsToPortResponse_QNAME, SendSmsToPortResponse.class, null, value);
    }

}
