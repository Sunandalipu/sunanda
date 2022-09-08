package ReqresAssignment;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ReadProjectTest {
	@Test
	public void Read()
	{
		when()
		.get("https://reqres.in/api/users/2")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.log().all();
	}
	

}
