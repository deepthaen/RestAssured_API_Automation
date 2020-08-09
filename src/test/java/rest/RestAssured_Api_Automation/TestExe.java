package rest.RestAssured_Api_Automation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import com.google.gson.Gson;
import io.restassured.internal.mapping.GsonMapper;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import rest.RestAssured_Api_Automation.restCommon.Info;
import rest.RestAssured_Api_Automation.restCommon.InfoPojo;
import rest.RestAssured_Api_Automation.restCommon.RestMethods;

public class TestExe extends RestMethods {
	
	@Test
	public void testInitila() {
		Response response = post("https://postman-echo.com/post", header(), reqbody().toString());
		int code = getStatusCode(response);
		if(code==200) {
			String body = getResBody(response);
			JSONObject objres = toJsonObject(body);
			JSONObject data = objres.getJSONObject("data").getJSONObject("infopojo");
			String name = data.get("name").toString();
			String token = data.get("age").toString();
			System.out.println(name+"--> "+token);
			JSONArray array = data.getJSONArray("listarray");
			for (int i = 0; i < array.length(); i++) {
				System.out.println(array.get(i));
			}
			
			String head = objres.getJSONObject("headers").get("host").toString();
			System.out.println(head);
			Response response2 = post("https://postman-echo.com/posttoken", headerToken(token), reqbody().toString());
			
		}
	}
	
	public HashMap<String, String> header() {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("Content-Type", "application/json");
		return map;
	}
	public HashMap<String, String> headerToken(String token) {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("Content-Type", "application/json");
		map.put("token", "Bearer "+token);
		return map;
	}
	
	public String reqbody() {
		List<String> branch = new ArrayList<String>();
		branch.add("cse");
		branch.add("ece");
		InfoPojo ip = new InfoPojo();
		ip.setName("Deep");
		ip.setAge(3);
		ip.setListarray(branch);
		Info in = new Info();
		in.setInfopojo(ip);
		Gson gson = new Gson();
		String json = gson.toJson(in);
		return json;
	}

	//GSON
	//OBjectMappaer
	
	/**
	 * Http method-- POST
	 * URL -- http://wwww
	 * Headers
	 * Body
	 * 
	 * Given.relaxedHrrpvalidation().when().headers(hashmap).body(json).then().post(url);
	 * Headers --> HashMap hashmap = new HasMap();
	 * hashmap.put(content_type,"applicatio/json")
	 * 
	 * body -- >
	 * INFO  infio = new Info();
	 * 
	 * info.sename("dee")
	 *info.setage();
	 *Gson g = ne Gson();
	 *String json = g.tojson(g)
	 */
	
}
