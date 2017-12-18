
package com.bytekast.netsuite.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignCampaignEmailStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignCampaignEmailStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_execute"/&gt;
 *     &lt;enumeration value="_inProgress"/&gt;
 *     &lt;enumeration value="_notStarted"/&gt;
 *     &lt;enumeration value="_sent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CampaignCampaignEmailStatus", namespace = "urn:types.marketing_2017_1.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignCampaignEmailStatus {

    @XmlEnumValue("_execute")
    EXECUTE("_execute"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_notStarted")
    NOT_STARTED("_notStarted"),
    @XmlEnumValue("_sent")
    SENT("_sent");
    private final String value;

    CampaignCampaignEmailStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignCampaignEmailStatus fromValue(String v) {
        for (CampaignCampaignEmailStatus c: CampaignCampaignEmailStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
