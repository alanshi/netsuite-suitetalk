
package com.bytekast.netsuite.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T14:58:00.501-07:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "asyncFault", targetNamespace = "urn:faults_2017_1.platform.webservices.netsuite.com")
public class AsyncFault_Exception extends Exception {
    
    private com.bytekast.netsuite.client.AsyncFault asyncFault;

    public AsyncFault_Exception() {
        super();
    }
    
    public AsyncFault_Exception(String message) {
        super(message);
    }
    
    public AsyncFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AsyncFault_Exception(String message, com.bytekast.netsuite.client.AsyncFault asyncFault) {
        super(message);
        this.asyncFault = asyncFault;
    }

    public AsyncFault_Exception(String message, com.bytekast.netsuite.client.AsyncFault asyncFault, Throwable cause) {
        super(message, cause);
        this.asyncFault = asyncFault;
    }

    public com.bytekast.netsuite.client.AsyncFault getFaultInfo() {
        return this.asyncFault;
    }
}
