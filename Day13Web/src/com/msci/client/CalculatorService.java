package com.msci.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-30T15:21:08.979+05:30
 * Generated source version: 3.1.1
 * 
 */
@WebServiceClient(name = "CalculatorService", 
                  wsdlLocation = "file:/C:/Users/X_training/Documents/Training/Day13Web/WebContent/WEB-INF/wsdl/calculator.wsdl",
                  targetNamespace = "http://msci.com/") 
public class CalculatorService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://msci.com/", "CalculatorService");
    public final static QName CalculatorPort = new QName("http://msci.com/", "CalculatorPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/X_training/Documents/Training/Day13Web/WebContent/WEB-INF/wsdl/calculator.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalculatorService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/X_training/Documents/Training/Day13Web/WebContent/WEB-INF/wsdl/calculator.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalculatorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CalculatorService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CalculatorService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort() {
        return super.getPort(CalculatorPort, Calculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort(WebServiceFeature... features) {
        return super.getPort(CalculatorPort, Calculator.class, features);
    }

}