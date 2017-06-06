
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserCredit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userCredential" type="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}userCredential" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserCredit", propOrder = {
    "userCredential"
})
public class GetUserCredit {

    protected UserCredential userCredential;

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

}
