package CommonFunctionsPackage;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class API_Common_Function {
	
	public static int response_statuscode(String baseURI ,String resource,String requestBody) {
		
		RestAssured.baseURI=baseURI;
		
		int statuscode=given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().statusCode();
		
	    return statuscode;
	}
	
 public static String response_Body(String baseURI ,String resource,String requestBody) {
		
		RestAssured.baseURI=baseURI;
		
	    String responseBody=given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().response().asString();
		
		return responseBody;
	}

}
