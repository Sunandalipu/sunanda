package Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BasicAuthTest {
	@Test
	public void Basicauth()
	{
		given()
		.auth().basic("rmgyantra", "rmgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(202).log().all();
	}

}
