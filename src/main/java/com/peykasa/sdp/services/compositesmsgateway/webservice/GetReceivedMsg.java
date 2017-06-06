
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReceivedMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReceivedMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userCredential" type="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}userCredential" minOccurs="0"/&gt;
 *         &lt;element name="destAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fromTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="maxReturnedMsg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReceivedMsg", propOrder = {
    "userCredential",
    "destAddresses",
    "fromTime",
    "maxReturnedMsg"
})
public class GetReceivedMsg {

    protected UserCredential userCredential;
    protected List<String> destAddresses;
    protected long fromTime;
    protected int maxReturnedMsg;

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
     * Gets the value of the fromTime property.
     * 
     */
    public long getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     */
    public void setFromTime(long value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the maxReturnedMsg property.
     * 
     */
    public int getMaxReturnedMsg() {
        return maxReturnedMsg;
    }

    /**
     * Sets the value of the maxReturnedMsg property.
     * 
     */
    public void setMaxReturnedMsg(int value) {
        this.maxReturnedMsg = value;
    }

}
