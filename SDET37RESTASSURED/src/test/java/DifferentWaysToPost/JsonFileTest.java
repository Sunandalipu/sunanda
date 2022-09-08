package DifferentWaysToPost;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class JsonFileTest {
	@Test
	public void Jsonfile()
	{
		 File file = new File("./src/test/resources/yamaha.json");
		 given()
		 .contentType(ContentType.JSON).body(file)
		 .when()
		 .post("http://localhost:8084/addProject")
		 .then()
		 .assertThat().contentType(ContentType.JSON)
		 .assertThat().statusCode(201)
		 .log().all();
	}
	

}
