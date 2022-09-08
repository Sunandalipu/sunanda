package UsingGenericUtility;

import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.EndPointLibrary;
import com.crm.comcast.GenericUtilities.IConstants;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest {
	@Test
	public void Delete()
	{
		
		when()
		.delete(IConstants.baseUri+EndPointLibrary.deleteProject+"TY_PROJ_831")
		.then()
		.assertThat().statusCode(204)
		.log().all();
	}
	

}
