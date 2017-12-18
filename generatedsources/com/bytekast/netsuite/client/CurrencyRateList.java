
package com.bytekast.netsuite.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyRateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyRateList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currencyRate" type="{urn:core_2017_1.platform.webservices.netsuite.com}CurrencyRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyRateList", namespace = "urn:core_2017_1.platform.webservices.netsuite.com", propOrder = {
    "currencyRate"
})
public class CurrencyRateList
    implements Serializable
{

    protected List<CurrencyRate2> currencyRate;

    /**
     * Gets the value of the currencyRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyRate2 }
     * 
     * 
     */
    public List<CurrencyRate2> getCurrencyRate() {
        if (currencyRate == null) {
            currencyRate = new ArrayList<CurrencyRate2>();
        }
        return this.currencyRate;
    }

}
