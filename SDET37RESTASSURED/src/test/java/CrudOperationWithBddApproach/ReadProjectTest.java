package CrudOperationWithBddApproach;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ReadProjectTest {
	@Test
	public void Readproject()
	{
		
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.log().all();
		
	}
	

}
