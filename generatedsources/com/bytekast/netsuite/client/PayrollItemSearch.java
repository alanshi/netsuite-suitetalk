
package com.bytekast.netsuite.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayrollItemSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayrollItemSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2017_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2017_1.platform.webservices.netsuite.com}PayrollItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2017_1.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayrollItemSearch", namespace = "urn:employees_2017_1.lists.webservices.netsuite.com", propOrder = {
    "basic",
    "customSearchJoin"
})
public class PayrollItemSearch
    extends SearchRecord
    implements Serializable
{

    protected PayrollItemSearchBasic basic;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public PayrollItemSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public void setBasic(PayrollItemSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
