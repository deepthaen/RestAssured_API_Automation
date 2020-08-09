package rest.RestAssured_Api_Automation.implementation;

import java.util.HashMap;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rest.RestAssured_Api_Automation.controller.RestController;
import static io.restassured.RestAssured.given;

public class RestImplementation implements RestController {

	public HashMap<String, String> queryParams(HashMap<String, String> params) {
		
		return null;
	}

	public HashMap<String, String> headers(HashMap<String, String> header) {
		return null;
	}

	public String reqBody(String body) {
		return null;
	}

	public Object reqPayload(Object body) {
		return null;
	}

	public Response get(String url) {
		return null;
	}

	public Response put(String url) {
		return null;
	}

	public Response post(String url) {
		return null;
	}

	public Response delete(String url) {
		return null;
	}

	public Response patch(String url) {
		return null;
	}

	public RequestSpecification construct() {
		// TODO Auto-generated method stub
		return null;
	}

	public RequestSpecification when() {
		// TODO Auto-generated method stub
		return null;
	}

	public RequestSpecification basicAuth() {
		// TODO Auto-generated method stub
		return null;
	}

}
