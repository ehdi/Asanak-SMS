
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReportByMsgIdResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReportByMsgIdResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}baseResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reportItems" type="{http://webService.compositeSmsGateway.services.sdp.peykasa.com/}reportItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReportByMsgIdResult", propOrder = {
    "reportItems"
})
public class GetReportByMsgIdResult
    extends BaseResult
{

    @XmlElement(nillable = true)
    protected List<ReportItem> reportItems;

    /**
     * Gets the value of the reportItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportItem }
     * 
     * 
     */
    public List<ReportItem> getReportItems() {
        if (reportItems == null) {
            reportItems = new ArrayList<ReportItem>();
        }
        return this.reportItems;
    }

}
