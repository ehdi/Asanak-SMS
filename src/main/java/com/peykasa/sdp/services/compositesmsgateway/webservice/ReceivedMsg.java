
package com.peykasa.sdp.services.compositesmsgateway.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivedMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="partCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="receivedTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivedMsg", propOrder = {
    "body",
    "destination",
    "encoding",
    "id",
    "partCount",
    "receivedTime",
    "source"
})
public class ReceivedMsg {

    protected String body;
    protected String destination;
    protected int encoding;
    protected long id;
    protected int partCount;
    protected long receivedTime;
    protected String source;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     */
    public int getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     */
    public void setEncoding(int value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the partCount property.
     * 
     */
    public int getPartCount() {
        return partCount;
    }

    /**
     * Sets the value of the partCount property.
     * 
     */
    public void setPartCount(int value) {
        this.partCount = value;
    }

    /**
     * Gets the value of the receivedTime property.
     * 
     */
    public long getReceivedTime() {
        return receivedTime;
    }

    /**
     * Sets the value of the receivedTime property.
     * 
     */
    public void setReceivedTime(long value) {
        this.receivedTime = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
