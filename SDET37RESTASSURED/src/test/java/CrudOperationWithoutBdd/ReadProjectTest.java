package CrudOperationWithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ReadProjectTest {
	@Test
	public void Read()
	{
		Response rsp = RestAssured.get("http://localhost:8084/projects");
		System.out.println(rsp.getContentType());
		System.out.println(rsp.getHeader("vary"));
		System.out.println(rsp.getStatusCode());
		System.out.println(rsp.getBody());
		System.out.println(rsp.getTime());
		ValidatableResponse val = rsp.then();
		//val.assertThat().contentType(ContentType.JSON);
		//val.assertThat().statusCode(200);
		val.log().all();
	}

}
