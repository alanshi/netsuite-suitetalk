
package com.bytekast.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2017_1.platform.webservices.netsuite.com}writeResponseList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddListResponse", namespace = "urn:messages_2017_1.platform.webservices.netsuite.com", propOrder = {
    "writeResponseList"
})
public class AddListResponse
    implements Serializable
{

    @XmlElement(required = true)
    protected WriteResponseList writeResponseList;

    /**
     * Gets the value of the writeResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link WriteResponseList }
     *     
     */
    public WriteResponseList getWriteResponseList() {
        return writeResponseList;
    }

    /**
     * Sets the value of the writeResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteResponseList }
     *     
     */
    public void setWriteResponseList(WriteResponseList value) {
        this.writeResponseList = value;
    }

}
