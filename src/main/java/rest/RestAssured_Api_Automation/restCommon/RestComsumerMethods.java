package rest.RestAssured_Api_Automation.restCommon;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

public class RestComsumerMethods extends RestAssured{
	
	static RequestSpecification req;
	
	public RestComsumerMethods() {
		if(req ==null) {
			req = construct();
	}
	}

	
	public static RequestSpecification construct() {
		RequestSpecification req = given().relaxedHTTPSValidation().with();
		return req;
	}
	
	public static RequestSpecification  when() {
	 return req.when();
	}
	
	public static RequestSpecification getHeader(HashMap<String, String> header) {
		return req.headers(header);
		
	}
	
	public static RequestSpecification queryParams(HashMap<String, String> params) {
		return req.queryParams(params);
		
	}
	
	public static RequestSpecification basics(String username, String password) {
		return req.auth().basic(username, password);
		
	}
	public static RequestSpecification requestbody(String body) {
		return req.body(body);
	}
	
	public static RequestSpecification requestbody(Object body) {
		return req.body(body);
	}
	
	public static Response getMethod(String url, HashMap<String, String> header,HashMap<String, String> params)  {
		req = construct().when();
		req = queryParams(params);
		req = getHeader(header);
		Response res = req.get(url);
		return res;
	}
	
	public static Response getMethod(String url,HashMap<String,String> header) {
		req =construct().when();
		req = getHeader(header);
		Response response = req.get(url);
		return response;
	}
	public static Response getMethod(String url) {
		req =construct().when();
		Response response = req.get(url);
		return response;
	}
	
	public static Response postMethod(String url, HashMap<String, String> header,HashMap<String, String> params)  {
		req = construct().when();
		req = queryParams(params);
		req = getHeader(header);
		Response res = req.post(url);
		return res;
	}
	
	public static Response postMethod(String url,HashMap<String,String> header) {
		req =construct().when();
		req = getHeader(header);
		Response response = req.post(url);
		return response;
	}
	public static Response postMethod(String url) {
		req =construct().when();
		Response response = req.post(url);
		return response;
	}
	
	public static Response putMethod(String url, HashMap<String, String> header,HashMap<String, String> params)  {
		req = construct().when();
		req = queryParams(params);
		req = getHeader(header);
		Response res = req.put(url);
		return res;
	}
	
	public static Response putMethod(String url,HashMap<String,String> header) {
		req =construct().when();
		req = getHeader(header);
		Response response = req.put(url);
		return response;
	}
	public static Response putMethod(String url) {
		req =construct().when();
		Response response = req.put(url);
		return response;
	}
	
	public static int getCode(Response res) {
		int code = res.getStatusCode();
		System.out.println(code);
		return code;
	}
	
	public static String statusLine(Response res) {
		String statusline = res.getStatusLine();
		System.out.println(statusline);
		return statusline;
	}
	
	public static String getResponse(Response res) {
		String responsebody = res.asString();
		System.out.println(responsebody);
		return responsebody;
	}
	
	public static JSONObject toJsonObject(String res) {
		JSONObject json = new JSONObject(res);
		System.out.println(json);
		return json;
	}
	
 
	public static JSONArray  toJsonarray(String res) {
		JSONArray arr = new JSONArray(res);
		return arr;
	}
	

}
