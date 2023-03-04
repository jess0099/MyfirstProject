package Restassured;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import org.json.simple.*;

public class putpostndelete {
	
	//putmehtodbyrestassured
	
	@DataProvider(name="testput")
	
	public Object[][] putmethod(){
		
	return new Object[][]{{"subh","test"},{"virat","crickt"}
	};
}
	
	@Test(dataProvider="testput")
	
	public void dataputm(String name,String job) {
		
		baseURI="https://reqres.in";
		JSONObject rp=new JSONObject();
		rp.put("name",name);
		rp.put("job",job);
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(rp.toJSONString()).when().put("/api/users/2")
	.then().statusCode(200).log().all();
	}
	//deletemethod
	@Test
	
	public void deletem() {
		baseURI="https://reqres.in";
		given().when().delete("api/users/2").then().statusCode(204).log().all();
	}

}
