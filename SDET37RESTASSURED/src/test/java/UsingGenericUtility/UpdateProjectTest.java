package UsingGenericUtility;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.EndPointLibrary;
import com.crm.comcast.GenericUtilities.IConstants;

import PojoClasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {
	@Test
	public void Updateproject()
	{
		ProjectLibrary pLib=new ProjectLibrary("radha", "acting", "created", 1);
		
		given()
		.contentType(ContentType.JSON)
		.body(pLib)
		.when()
		.put(IConstants.baseUri+EndPointLibrary.updateProject+"TY_PROJ_406")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.log().all();
	}
	

}
