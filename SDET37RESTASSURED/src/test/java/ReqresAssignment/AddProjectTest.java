package ReqresAssignment;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectTest {
	@Test
	public void Addproject()
	{
		JSONObject jobj= new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "leader");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("https://reqres.in/api/users?page=2")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201)
		.log().all();
		
	
	}
}
