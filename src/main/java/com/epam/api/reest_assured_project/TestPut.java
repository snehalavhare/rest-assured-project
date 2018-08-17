package com.epam.api.reest_assured_project;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;


import org.json.simple.JSONObject;
import org.testng.Assert;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TestPut {
	
	public static void main(String[] args) throws InterruptedException {
		
		String serverendpoint = "https://reqres.in";
		String apiendpoint = "/api/users";
		int statuscode;
		
		RestAssured.baseURI = serverendpoint;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		//for Post Request
		
		httpRequest.headers("Content-Type", "application/json");
		
		JSONObject object = new JSONObject();
		object.put("name", "Sneha"); 
		object.put("job", "Test Engineer");
		
		httpRequest.body(object.toJSONString());
		
		Response response = httpRequest.post(apiendpoint);
		
		statuscode = response.getStatusCode();
		
		//System.out.println("Status Code: " + response.getStatusCode())
		
		Assert.assertEquals(statuscode, 201);
		
		//System.out.println(body.asString())

		ResponseBody responsebody = response.getBody();
		
		Employee employee = responsebody.as(Employee.class);
	
		System.out.println(employee);
		
		
		Thread.sleep(4000);
		
		//for Put Request
		
		object.put("id", employee.getId() ); 
		object.put("name", "Sneha"); 
		object.put("job", "Automation Engineer");
		
		httpRequest.headers("Content-Type", "application/json");
		httpRequest.body(object.toJSONString());
		
		response = httpRequest.put(apiendpoint);
		
		statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		//System.out.println(statuscode)

		responsebody = response.getBody();
		
		employee = responsebody.as(Employee.class);
		
		System.out.println("\n" + "Details updated after Put request:" + "\n");
	
		System.out.println(employee);
		
	}

}
