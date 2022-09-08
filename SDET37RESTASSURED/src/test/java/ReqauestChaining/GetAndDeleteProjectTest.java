package ReqauestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetAndDeleteProjectTest {
	@Test
	public void Getanddelete()
	{
		Response response = when().get("http://localhost:8084/projects");
		String projID = response.jsonPath().get("[0].projectId");
		
		given()
		.pathParam("pid", projID)
		.when()
		.delete("http://localhost:8084/projects/{pid}")
		.then()
		.assertThat().statusCode(204).log().all();
	}
	

}
