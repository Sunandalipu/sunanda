package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenTest {
	@Test
	public void Brearertoken()
	{
		baseURI="https://api.github.com";
		JSONObject jobj=new JSONObject();
		jobj.put("name", "priya");
		
	  given()
	  .auth().oauth2("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")
	  .body(jobj)
	  .when()
	  .post("/user/repos")
	  .then()
	  .assertThat().statusCode(201).log().all();
	  
	}

}
