package Restassured;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;




import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
public class getnpostmethod {
	
	
	
	@Test
	
	public void postmehtod() {
	 baseURI="https://reqres.in";
	JSONObject rq=new JSONObject();
      rq.put("name", "AMIT");
      rq.put("job","SQA");
      
      given().contentType(ContentType.JSON).accept(ContentType.JSON).body(rq.toJSONString()).when()
      .post("/api/users").then().statusCode(201).log().all();
	}
	
	@Test
	
	public void getmethod() {
		 baseURI="https://reqres.in";
		 
		 given().contentType(ContentType.JSON).accept(ContentType.JSON).when()
		 .get("/api/users?page=2").then().statusCode(200).log()
		 .all();
	}

}
