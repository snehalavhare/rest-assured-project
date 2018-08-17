package com.test.FXservice;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	public static void main(String[] args) 
	{
		
	String serverendpoint= "http://localhost:18081";
	String apiendpoint = "/countries";
	
	RestAssured.baseURI = serverendpoint;
	
	RequestSpecification httpRequest = RestAssured.given();
	
	
	httpRequest.header("Content-Type", "application/json");
	
	//Response response = httpRequest.request(Method.GET, apiendpoint);
	
	Response response = httpRequest.get(apiendpoint);
	
	System.out.println(response.jsonPath().get());
	
//	ResponseBody responsebody = response.getBody();
//	
//	Countries countries = responsebody.as(Countries.class);
//
//	countries.display();
	
	


	}
	
}
