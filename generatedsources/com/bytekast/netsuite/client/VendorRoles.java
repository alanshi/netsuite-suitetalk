
package com.bytekast.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorRoles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorRoles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selectedRole" type="{urn:core_2017_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorRoles", namespace = "urn:relationships_2017_1.lists.webservices.netsuite.com", propOrder = {
    "selectedRole"
})
public class VendorRoles
    implements Serializable
{

    protected RecordRef selectedRole;

    /**
     * Gets the value of the selectedRole property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSelectedRole() {
        return selectedRole;
    }

    /**
     * Sets the value of the selectedRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSelectedRole(RecordRef value) {
        this.selectedRole = value;
    }

}