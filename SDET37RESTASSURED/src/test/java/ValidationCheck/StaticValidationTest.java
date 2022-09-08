package ValidationCheck;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticValidationTest {
	@Test
	public void Staticresponse()
	{
		String expProjName = "holy";
	Response rsp = when()
	.get("http://localhost:8084/projects");
	
	String actProjName = rsp.jsonPath().get("[0].projectName");
	System.out.println(actProjName);
	
	Assert.assertEquals(expProjName, actProjName);
	
	
	}

}
