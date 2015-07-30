package com.msci.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-30T15:21:08.973+05:30
 * Generated source version: 3.1.1
 * 
 */
@WebService(targetNamespace = "http://msci.com/", name = "Calculator")
@XmlSeeAlso({ObjectFactory.class})
public interface Calculator {

    @WebMethod(action = "urn:Add")
    @RequestWrapper(localName = "add", targetNamespace = "http://msci.com/", className = "com.msci.client.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://msci.com/", className = "com.msci.client.AddResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int add(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b
    );

    @WebMethod(action = "urn:Subtract")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://msci.com/", className = "com.msci.client.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://msci.com/", className = "com.msci.client.SubtractResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int subtract(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b
    );
}