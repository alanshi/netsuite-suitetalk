
package com.bytekast.netsuite.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingPeriodFiscalCalendarsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingPeriodFiscalCalendarsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountingPeriodFiscalCalendars" type="{urn:accounting_2017_1.lists.webservices.netsuite.com}AccountingPeriodFiscalCalendars" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="replaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingPeriodFiscalCalendarsList", propOrder = {
    "accountingPeriodFiscalCalendars"
})
public class AccountingPeriodFiscalCalendarsList
    implements Serializable
{

    protected List<AccountingPeriodFiscalCalendars> accountingPeriodFiscalCalendars;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the accountingPeriodFiscalCalendars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingPeriodFiscalCalendars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingPeriodFiscalCalendars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingPeriodFiscalCalendars }
     * 
     * 
     */
    public List<AccountingPeriodFiscalCalendars> getAccountingPeriodFiscalCalendars() {
        if (accountingPeriodFiscalCalendars == null) {
            accountingPeriodFiscalCalendars = new ArrayList<AccountingPeriodFiscalCalendars>();
        }
        return this.accountingPeriodFiscalCalendars;
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplaceAll() {
        if (replaceAll == null) {
            return true;
        } else {
            return replaceAll;
        }
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
