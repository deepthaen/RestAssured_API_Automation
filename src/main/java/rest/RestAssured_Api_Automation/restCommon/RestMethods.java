package rest.RestAssured_Api_Automation.restCommon;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class RestMethods {
	static RequestSpecification  req;
	public RestMethods() {
		if(req ==null) {
			req = construct();
		}

	}

	public static RequestSpecification construct() {
		RequestSpecification req = given().relaxedHTTPSValidation();
		return req;
	}

	public static RequestSpecification  when() {
		return req.when();
	}
	public static RequestSpecification  with() {
		return req.with();
	}

	public static RequestSpecification basic(String user,String pass) {
		return req.auth().basic(user, pass);
	}


	public static RequestSpecification queryParams(HashMap<String,String> param) {
		return req.queryParams( param);
	}

	public static RequestSpecification headers(HashMap<String,String> header) {
		return req.headers(header);
	}

	public static RequestSpecification requestBody(String body) {
		return req.body(body);
	}

	public static RequestSpecification requestBody(Object body) {
		return req.body(body);
	}

	public static Response get(String url,HashMap<String,String> param,HashMap<String,String> header) {
		req =construct().when();
		req =queryParams(param);
		req = headers(header);
		Response response = req.get(url);
		return response;
	}

	public static Response get(String url,HashMap<String,String> header) {
		req =construct().when();
		req = headers(header);
		Response response = req.get(url);
		return response;
	}
	public static Response get(String url) {
		req =construct().when();
		Response response = req.get(url);
		return response;
	}

	public static Response post(String url,HashMap<String,String> param,HashMap<String,String> header,String body) {
		req =construct().when();
		req =queryParams(param);
		req = headers(header);
		req = requestBody(body);
		Response response = req.post(url);
		return response;
	}

	public static Response post(String url,HashMap<String,String> param,HashMap<String,String> header,Object body) {
		req =construct().when();
		req =queryParams(param);
		req = headers(header);
		req = requestBody(body);
		Response response = req.post(url);
		return response;
	}
	public static Response post(String url,HashMap<String,String> header,String body) {
		req =construct().when();
		req = headers(header);
		req = requestBody(body);
		Response response = req.post(url);
		return response;
	}

	public static int getStatusCode(Response response) {
		int code = response.getStatusCode();
        System.out.println(code);
		return code;
	}
	public static String getResBody(Response response) {
		String res = response.asString();
		System.out.println(res);
		return res;
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
	
	public static Response put(String url,HashMap<String,String> param,HashMap<String,String> header,String body) {
		req =construct().when();
		req =queryParams(param);
		req = headers(header);
		req = requestBody(body);
		Response response = req.put(url);
		return response;
	}
	
	
	public static Response put(String url,HashMap<String,String> param,HashMap<String,String> header,Object body) {
		req =construct().when();
		req =queryParams(param);
		req = headers(header);
		req = requestBody(body);
		Response response = req.put(url);
		return response;
	}
	
	public static Response put(String url,HashMap<String,String> header,Object body) {
		req =construct().when();
		req = headers(header);
		req = requestBody(body);
		Response response = req.put(url);
		return response;
	}

}
