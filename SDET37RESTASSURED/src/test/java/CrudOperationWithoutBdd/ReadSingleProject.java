package CrudOperationWithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ReadSingleProject {
	@Test
	public void SngleProject()
	{
		Response rsp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_1220");
		ValidatableResponse val = rsp.then();
		val.assertThat().contentType(ContentType.JSON);
		val.assertThat().statusCode(200);
		val.log().all();
	}

}
