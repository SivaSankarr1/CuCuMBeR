package org.base;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ApiStatusCheck {
@Test
	private void tc01() throws ParseException {	

Response response = RestAssured.get("https://reqres.in/api/users?page=2");
int statusCode = response.getStatusCode();
System.out.println(statusCode);
String string = response.getBody().asString();
//System.out.println(string);
JSONParser parser=new JSONParser();
Object parse = parser.parse(string);
JSONObject jb=(JSONObject) parse;
String string2 = jb.get("total").toString();
System.out.println(string2);
Assert.assertEquals("12", string2);
	}

}
