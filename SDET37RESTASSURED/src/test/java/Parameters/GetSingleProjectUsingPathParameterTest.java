package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetSingleProjectUsingPathParameterTest {
	@Test
	public void Getsingleproject()
	{
		given()
		.pathParam("pid", "TY_PROJ_001")
		.when()
		.get("http://localhost:8084/projects/{pid}")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200).log().all();
	}

}
