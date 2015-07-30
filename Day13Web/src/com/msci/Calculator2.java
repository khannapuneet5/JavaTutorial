package com.msci;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Calculator2 {
	@GET
	@Path("/add/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public int add(@PathParam("a") int a, @PathParam("b") int b){
		return a+b;
	}
	@GET
	@Path("/sub/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public int subtract(@PathParam("a") int a, @PathParam("b") int b){
		return a-b;
	}
//	public static void main(String[] args) {
//		System.out.println("Hello");
//	}
}