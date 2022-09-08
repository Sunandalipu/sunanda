package ReqresAssignment;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ReadAllProjectsTest {
	@Test
	public void Readall()
	{
		when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.log().all();
	}

}
