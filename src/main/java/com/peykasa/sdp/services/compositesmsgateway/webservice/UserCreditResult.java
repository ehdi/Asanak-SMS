
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userCreditResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userCreditResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}baseResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userCreditResult", propOrder = {
    "credit"
})
public class UserCreditResult
    extends BaseResult
{

    protected int credit;

    /**
     * Gets the value of the credit property.
     * 
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     */
    public void setCredit(int value) {
        this.credit = value;
    }

}
