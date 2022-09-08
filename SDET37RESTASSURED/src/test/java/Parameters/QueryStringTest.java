package Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class QueryStringTest {
	@Test
	public void Querysting()
	{
		
		String uri = "https://reqres.in";
		given()
		.queryParam("page", 2)
		.when()
		.get(uri+"/api/users")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200).log().all();
	}

}
