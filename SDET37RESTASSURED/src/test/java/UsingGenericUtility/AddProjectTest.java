package UsingGenericUtility;

import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.EndPointLibrary;
import com.crm.comcast.GenericUtilities.IConstants;

import PojoClasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectTest {
	@Test
	public void Addproject()
	{
		ProjectLibrary plib=new ProjectLibrary("whitedevil", "eating", "created", 1);
		
		
		given()
		.contentType(ContentType.JSON).body(plib)
		.when()
		.post(IConstants.baseUri+EndPointLibrary.createProject)
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201).log().all();
	}

}
