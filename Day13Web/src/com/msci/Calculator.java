package com.msci;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(targetNamespace = "http://msci.com/", portName = "CalculatorPort", serviceName = "CalculatorService")
public class Calculator {
	@WebMethod(operationName = "add", action = "urn:Add")
	@WebResult(name = "return")
	public int add(@WebParam(name = "arg0") int num1, @WebParam(name = "arg1") int num2){
		return num1+num2;
	}
	@WebMethod(operationName = "subtract", action = "urn:Subtract")
	@WebResult(name = "return")
	public int subtract(@WebParam(name = "arg0") int num1, @WebParam(name = "arg1") int num2){
		return num1-num2;
	}

}
