package DifferentWaysToPost;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;



public class JsonObjectTest {
	@Test
	public void Create()
	{
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "ganesh");
		jobj.put("projectName", "puja");
		jobj.put("status", "created");
		jobj.put("teamSize", 5);

		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201)
		.log().all();
	}

}
