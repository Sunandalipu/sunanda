package CrudOperationWithBddApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectTest {
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
