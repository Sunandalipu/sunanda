package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class oauthAuthnew {
	@Test
	public void newOauthggg()
	{
		Response resp = given().formParam("client_id", "zomato")
		.formParam("client_secret","9894b127a70bbe2e09d23e9876d38e18")
		.formParam("grant_type","client_credentials")
		.formParam("redirect_uri","https://zomato.com")
		.formParam("code","3738")
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		String token = resp.jsonPath().get("access_token");
		
		System.out.println(token);
		
		given()
		.auth().oauth2(token)
		.pathParam("uid",3738)
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{uid}/barn-unlock")
		.then().log().all();
	}

}
