package webServices.rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AutomatePatchRestApi{
	
	@Test
	public void patch()
	{   
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		Response response = httpRequest.request(Method.PATCH, "/posts/1");
		System.out.println("Response Body is =>  " + response.asString());
		System.out.println("Response StatusCode is =>  " + response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200 , "Correct status code returned");
	}
	
}