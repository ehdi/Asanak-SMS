
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReceivedMsgResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReceivedMsgResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}baseResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receivedMegs" type="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}receivedMsg" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReceivedMsgResult", propOrder = {
    "receivedMegs"
})
public class GetReceivedMsgResult
    extends BaseResult
{

    @XmlElement(nillable = true)
    protected List<ReceivedMsg> receivedMegs;

    /**
     * Gets the value of the receivedMegs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivedMegs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivedMegs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivedMsg }
     * 
     * 
     */
    public List<ReceivedMsg> getReceivedMegs() {
        if (receivedMegs == null) {
            receivedMegs = new ArrayList<ReceivedMsg>();
        }
        return this.receivedMegs;
    }

}
