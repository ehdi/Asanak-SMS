
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReportByMsgId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReportByMsgId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userCredential" type="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}userCredential" minOccurs="0"/&gt;
 *         &lt;element name="msgIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReportByMsgId", propOrder = {
    "userCredential",
    "msgIds"
})
public class GetReportByMsgId {

    protected UserCredential userCredential;
    @XmlElement(type = Long.class)
    protected List<Long> msgIds;

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
     * Gets the value of the msgIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getMsgIds() {
        if (msgIds == null) {
            msgIds = new ArrayList<Long>();
        }
        return this.msgIds;
    }

}
