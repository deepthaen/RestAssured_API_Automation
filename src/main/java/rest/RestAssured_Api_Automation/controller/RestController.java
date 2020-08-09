package rest.RestAssured_Api_Automation.controller;

import java.util.HashMap;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public interface RestController {
	
	/**
	 * construct
	 * Build
	 * Send Request
	 */
	
	HashMap<String,String> queryParams(HashMap<String,String> param); //Query params
	HashMap<String,String> headers(HashMap<String,String> param); // Headers
	String reqBody(String body); // request body with String harcod
	Object reqPayload(Object obj);// req body using pojo
	
	Response get(String url);
	Response put(String url);
	Response post(String url);
	Response delete(String url);
	Response patch(String url);
	
	
	RequestSpecification construct(); // given().relaxedHttpvalidation();
	RequestSpecification when();
	RequestSpecification basicAuth();
	
	
}
