package CrudOperationWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	@Test
	public void Update()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","lipu");
		jobj.put("projectName", "purimandira");
		jobj.put("status", "created");
		jobj.put("teamSize", 8);
	//preconditions(body and content type)	
		RequestSpecification respecf = RestAssured.given();
		respecf.body(jobj);
		respecf.contentType(ContentType.JSON);
	//action	
		Response resp = respecf.put("http://localhost:8084/projects/TY_PROJ_406");
		ValidatableResponse val = resp.then();
		val.contentType(ContentType.JSON);
		val.statusCode(200);
		val.log().all();
	}

}
