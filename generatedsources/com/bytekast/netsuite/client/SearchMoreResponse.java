
package com.bytekast.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchMoreResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchMoreResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2017_1.platform.webservices.netsuite.com}searchResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMoreResponse", namespace = "urn:messages_2017_1.platform.webservices.netsuite.com", propOrder = {
    "searchResult"
})
public class SearchMoreResponse
    implements Serializable
{

    @XmlElement(namespace = "urn:core_2017_1.platform.webservices.netsuite.com", required = true)
    protected SearchResult searchResult;

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchResult(SearchResult value) {
        this.searchResult = value;
    }

}
