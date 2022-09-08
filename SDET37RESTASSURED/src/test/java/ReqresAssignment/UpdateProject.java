package ReqresAssignment;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject {
	@Test
	public void Update()
	{
		JSONObject jobj= new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "zion resident");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("https://reqres.in/api/users/2")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201)
		.log().all();
	}

}
