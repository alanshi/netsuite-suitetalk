
package com.bytekast.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:faults_2017_1.platform.webservices.netsuite.com}SoapFault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncFault", namespace = "urn:faults_2017_1.platform.webservices.netsuite.com")
public class AsyncFault
    extends SoapFault
    implements Serializable
{


}
