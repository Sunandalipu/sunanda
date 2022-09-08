package DifferentWaysToPost;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClassForSerializationAndDeserialization.AddProject;

public class AddProjectUsingPojoClass {

	@Test
	public void Addproject()
	{
		AddProject add = new AddProject("sunanda","visit","created",6);
		given()
		.body(add).contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}
