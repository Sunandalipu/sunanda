package UsingGenericUtility;

import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.EndPointLibrary;
import com.crm.comcast.GenericUtilities.IConstants;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ReadProjectTest {
	@Test
	public void Readproject()
	{
		
		when()
		.get(IConstants.baseUri+EndPointLibrary.getAllProjects)
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.log().all();
		
	}
	

}
