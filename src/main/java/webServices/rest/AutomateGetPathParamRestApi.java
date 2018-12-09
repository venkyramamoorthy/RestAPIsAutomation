package webServices.rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AutomateGetPathParamRestApi{
	@Test
	public void get()
	{   
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		Response response = httpRequest.request(Method.GET, "/posts/1/comments");
		System.out.println("Response is =>  " + response.asString());
		int statusCode = response.getStatusCode();
		System.out.println("statusCode is =>  " + statusCode);
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		Assert.assertEquals(statusCode, 200 , "Correct status code returned");
		 }

}