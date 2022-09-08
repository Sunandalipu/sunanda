package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasiAuthDigestTest {
	@Test
	public void Basicauth()
	{
		given()
		.auth().digest("rmgyantra", "rmgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.assertThat().statusCode(202).log().all();
	}

}
