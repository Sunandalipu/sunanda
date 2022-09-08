package CrudOperationWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	@Test
	public void Create()
	{
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy","god");
		jobj.put("projectName","amazon12");
		jobj.put("status", "created");
		jobj.put("teamSize", 1);
		//precondition(body and content type)
		RequestSpecification reqse = RestAssured.given();
		reqse.body(jobj);
		reqse.contentType(ContentType.JSON);
		//actions
		Response resp = reqse.post("http://localhost:8084/addProject");
		ValidatableResponse val = resp.then();
		val.assertThat().contentType(ContentType.JSON);
		val.assertThat().statusCode(201);
		val.log().all();
	}

}
