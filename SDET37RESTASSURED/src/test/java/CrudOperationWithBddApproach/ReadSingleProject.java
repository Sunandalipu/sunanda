package CrudOperationWithBddApproach;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ReadSingleProject {
	@Test
	public void Singleproject()
	{
		when()
		.get("http://localhost:8084/projects/TY_PROJ_814")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.log().all();
	}
	

}
