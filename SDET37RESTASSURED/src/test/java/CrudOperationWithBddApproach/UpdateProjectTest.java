package CrudOperationWithBddApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {
	@Test
	public void Updateproject()
	{
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "ganesh babu");
		jobj.put("projectName", "puja ho");
		jobj.put("status", "created");
		jobj.put("teamSize", 5);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_406")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.log().all();
	}
	

}
