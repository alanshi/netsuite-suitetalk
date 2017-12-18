
package com.bytekast.netsuite.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T14:58:00.481-07:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "exceededUsageLimitFault", targetNamespace = "urn:faults_2017_1.platform.webservices.netsuite.com")
public class ExceededUsageLimitFault_Exception extends Exception {
    
    private com.bytekast.netsuite.client.ExceededUsageLimitFault exceededUsageLimitFault;

    public ExceededUsageLimitFault_Exception() {
        super();
    }
    
    public ExceededUsageLimitFault_Exception(String message) {
        super(message);
    }
    
    public ExceededUsageLimitFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceededUsageLimitFault_Exception(String message, com.bytekast.netsuite.client.ExceededUsageLimitFault exceededUsageLimitFault) {
        super(message);
        this.exceededUsageLimitFault = exceededUsageLimitFault;
    }

    public ExceededUsageLimitFault_Exception(String message, com.bytekast.netsuite.client.ExceededUsageLimitFault exceededUsageLimitFault, Throwable cause) {
        super(message, cause);
        this.exceededUsageLimitFault = exceededUsageLimitFault;
    }

    public com.bytekast.netsuite.client.ExceededUsageLimitFault getFaultInfo() {
        return this.exceededUsageLimitFault;
    }
}
