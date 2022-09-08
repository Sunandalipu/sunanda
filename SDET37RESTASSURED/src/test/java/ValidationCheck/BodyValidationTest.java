package ValidationCheck;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BodyValidationTest {
	@Test
	public void Bodyvalidation()
	{
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().body("[0].projectName", Matchers.equalTo("holy"))
		.log().all();
		
	}

}
