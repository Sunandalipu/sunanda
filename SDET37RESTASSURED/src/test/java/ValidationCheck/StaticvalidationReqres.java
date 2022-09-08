package ValidationCheck;

import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticvalidationReqres {
	@Test
	public void Staticresponse()
	{
		String expProjName = "";
	Response rsp = when()
	.get("");
	
	String actProjName = rsp.jsonPath().get("");
	System.out.println(actProjName);
	
	Assert.assertEquals(expProjName, actProjName);
	
}

}