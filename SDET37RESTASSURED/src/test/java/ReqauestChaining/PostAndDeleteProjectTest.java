package ReqauestChaining;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClassForSerializationAndDeserialization.AddProject;

public class PostAndDeleteProjectTest {
	@Test
	public void Postanddelete()
	{
		Random random=new Random();
		int randomNum = random.nextInt(1000);
		
		AddProject add=new AddProject("depika", "shoe"+randomNum, "created", 2);
		Response response = given().contentType(ContentType.JSON).body(add).when().post("http://localhost:8084/addProject");
		String projID = response.jsonPath().get("projectId");
		
		given()
		.pathParam("pid", projID)
		.when()
		.delete("http://localhost:8084/projects/{pid}")
		.then()
		.assertThat().statusCode(204).log().all();
		
		
		
	}

}
