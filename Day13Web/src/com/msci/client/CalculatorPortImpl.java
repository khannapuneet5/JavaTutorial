
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.msci.client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-30T15:21:08.957+05:30
 * Generated source version: 3.1.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "CalculatorService",
                      portName = "CalculatorPort",
                      targetNamespace = "http://msci.com/",
                      wsdlLocation = "file:/C:/Users/X_training/Documents/Training/Day13Web/WebContent/WEB-INF/wsdl/calculator.wsdl",
                      endpointInterface = "com.msci.client.Calculator")
                      
public class CalculatorPortImpl implements Calculator {

    private static final Logger LOG = Logger.getLogger(CalculatorPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.msci.client.Calculator#add(int  a ,)int  b )*
     */
    public int add(int a,int b) { 
        LOG.info("Executing operation add");
        System.out.println(a);
        System.out.println(b);
        try {
            int _return = -905078382;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.msci.client.Calculator#subtract(int  a ,)int  b )*
     */
    public int subtract(int a,int b) { 
        LOG.info("Executing operation subtract");
        System.out.println(a);
        System.out.println(b);
        try {
            int _return = 1543633769;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}