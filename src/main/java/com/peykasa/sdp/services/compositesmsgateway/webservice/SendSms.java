
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendSms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendSms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userCredential" type="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}userCredential" minOccurs="0"/&gt;
 *         &lt;element name="srcAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="destAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="msgBody" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="msgEncoding" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSms", propOrder = {
    "userCredential",
    "srcAddresses",
    "destAddresses",
    "msgBody",
    "msgEncoding"
})
public class SendSms {

    protected UserCredential userCredential;
    protected List<String> srcAddresses;
    protected List<String> destAddresses;
    protected List<String> msgBody;
    @XmlElement(type = Integer.class)
    protected List<Integer> msgEncoding;

    /**
     * Gets the value of the userCredential property.
     * 
     * @return
     *     possible object is
     *     {@link UserCredential }
     *     
     */
    public UserCredential getUserCredential() {
        return userCredential;
    }

    /**
     * Sets the value of the userCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCredential }
     *     
     */
    public void setUserCredential(UserCredential value) {
        this.userCredential = value;
    }

    /**
     * Gets the value of the srcAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSrcAddresses() {
        if (srcAddresses == null) {
            srcAddresses = new ArrayList<String>();
        }
        return this.srcAddresses;
    }

    /**
     * Gets the value of the destAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDestAddresses() {
        if (destAddresses == null) {
            destAddresses = new ArrayList<String>();
        }
        return this.destAddresses;
    }

    /**
     * Gets the value of the msgBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMsgBody() {
        if (msgBody == null) {
            msgBody = new ArrayList<String>();
        }
        return this.msgBody;
    }

    /**
     * Gets the value of the msgEncoding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgEncoding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgEncoding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getMsgEncoding() {
        if (msgEncoding == null) {
            msgEncoding = new ArrayList<Integer>();
        }
        return this.msgEncoding;
    }

}
