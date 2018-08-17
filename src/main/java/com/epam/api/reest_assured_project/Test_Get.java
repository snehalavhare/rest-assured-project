package com.epam.api.reest_assured_project;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Test_Get{
	
	public static void main(String[] args) {
		
		System.out.println("Rest Assured Test");
		String serverEndPoint = "http://restapi.demoqa.com/";
		String apiEndPoint = "utilities/weather/city/Hyderabad";
		
		RestAssured.baseURI = serverEndPoint; // same thing can be achieved by request object
		
		
		RequestSpecification httpRequest = RestAssured.given();
		
		//httpRequest.baseUri(serverEndPoint);
		
		Map<String, String> requestHeaders = new LinkedHashMap<String, String>();
    	requestHeaders.put("Content-Type", "application/json");
    		
    	httpRequest.headers(requestHeaders);
    	
    	//httpRequest.body("");
    	
		Response apiResponsne = httpRequest.request(Method.GET, apiEndPoint);
		System.out.println("Expires in " + apiResponsne.header("expires"));
		
		
		System.out.println("Status code is " + apiResponsne.getStatusCode());
		
		
		System.out.println("Humidity is " + apiResponsne.jsonPath().get("Humidity"));
		
		
		WeatherResponseDto responseData = apiResponsne.as(WeatherResponseDto.class);
		
		
		System.out.println("City is " + responseData.getCity());

		
	}
}
