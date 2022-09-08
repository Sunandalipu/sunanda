package ReqauestChaining;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostAndGetProjectTest {
	@Test
	public void Postandget()
	{
		Random random = new Random();
		int randomNum = random.nextInt(1000);
				
		
		JSONObject josb= new JSONObject();
		josb.put("createdBy", "devil");
		josb.put("projectName", "study"+randomNum);
		josb.put("status", "created");
		josb.put("teamSize", 3);
		
		Response response = given().contentType(ContentType.JSON).body(josb).when().post("http://localhost:8084/addProject");
		String projId = response.jsonPath().get("projectId");
		
		given()
		.pathParam("pid", projId)
		.when()
		.get("http://localhost:8084/projects/{pid}")
		.then()
		.assertThat().statusCode(200).log().all();
	}

}
