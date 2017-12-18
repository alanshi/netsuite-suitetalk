
package com.bytekast.netsuite.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T08:45:21.283-07:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "invalidCredentialsFault", targetNamespace = "urn:faults_2017_1.platform.webservices.netsuite.com")
public class InvalidCredentialsFault_Exception extends Exception {
    
    private com.bytekast.netsuite.client.InvalidCredentialsFault invalidCredentialsFault;

    public InvalidCredentialsFault_Exception() {
        super();
    }
    
    public InvalidCredentialsFault_Exception(String message) {
        super(message);
    }
    
    public InvalidCredentialsFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCredentialsFault_Exception(String message, com.bytekast.netsuite.client.InvalidCredentialsFault invalidCredentialsFault) {
        super(message);
        this.invalidCredentialsFault = invalidCredentialsFault;
    }

    public InvalidCredentialsFault_Exception(String message, com.bytekast.netsuite.client.InvalidCredentialsFault invalidCredentialsFault, Throwable cause) {
        super(message, cause);
        this.invalidCredentialsFault = invalidCredentialsFault;
    }

    public com.bytekast.netsuite.client.InvalidCredentialsFault getFaultInfo() {
        return this.invalidCredentialsFault;
    }
}