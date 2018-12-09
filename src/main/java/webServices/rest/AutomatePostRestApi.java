package webServices.rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AutomatePostRestApi{
	
	@Test
	public void post()
	{   
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		Response response = httpRequest.request(Method.POST, "/posts");
		int statusCode = response.getStatusCode();
		String responseBody = response.getBody().asString();
		System.out.println("Response StatusCode is =>  " + response.getStatusCode());
		System.out.println("Response Body is =>  " + responseBody);	
		Assert.assertEquals(statusCode, 201 , "Correct status code returned");
		
	}
	
}