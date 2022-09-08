package CrudOperationWithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteTest {
	@Test
	public void Delete()
	{
		Response rsp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1209");
		ValidatableResponse val = rsp.then();
		val.assertThat().contentType(ContentType.JSON);
		val.assertThat().statusCode(204);
		val.log().all();
	}

}
