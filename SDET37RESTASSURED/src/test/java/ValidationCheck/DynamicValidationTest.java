package ValidationCheck;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicValidationTest {
	@Test
	public void Dynamicvalidation()
	{
		String expProjId = "TY_PROJ_403";
		
		Response rsp = when().get("http://localhost:8084/projects");
		
		List<String> projectID = rsp.jsonPath().and().get("projectId");
		boolean flag=false;
		
		for(String actProjectID : projectID) {
			
			if(actProjectID.equals(expProjId)) {
				System.out.println("Project name is matching");
				flag=true;
			}
		}
		
		Assert.assertTrue(flag);
	}

}
