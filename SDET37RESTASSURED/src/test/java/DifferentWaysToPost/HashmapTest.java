package DifferentWaysToPost;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class HashmapTest {
	@Test
	public void Hashmap()
	{
		HashMap map = new HashMap();
		map.put("createdBy", "sanu");
		map.put("projectName", "beauty");
		map.put("status", "created");
		map.put("teamSize", 6);
		
		given()
		.body(map).contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201)
		.log().all();
	}
	
	
}
