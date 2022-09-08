package ValidationCheck;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class TimeValidationTest {
	@Test
	public void Timevalidation()
	{
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(500l), TimeUnit.MILLISECONDS)
		.log().all();
	}

}
