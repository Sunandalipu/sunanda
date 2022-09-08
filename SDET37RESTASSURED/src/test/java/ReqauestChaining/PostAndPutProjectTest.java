package ReqauestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassForSerializationAndDeserialization.AddProject;

public class PostAndPutProjectTest {
	@Test
	public void Postandput()
	{
		Random random = new Random();
		int randomNum = random.nextInt(1000);
		
		AddProject add=new AddProject("deepika", "shoe"+randomNum, "created", 2);
		Response response = given().contentType(ContentType.JSON).body(add).when().post("http://localhost:8084/addProject");
		String projID = response.jsonPath().get("projectId");
		
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "you");
		jobj.put("projectName", "air");
		
		given()
		.pathParam("pid", projID)
		.contentType(ContentType.JSON).body(jobj)
		.when()
		.put("http://localhost:8084/projects/{pid}")
		.then()
		.assertThat().statusCode(200).log().all();

}
}
