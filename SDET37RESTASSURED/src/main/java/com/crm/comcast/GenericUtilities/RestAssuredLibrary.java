package com.crm.comcast.GenericUtilities;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	
	public String getjsonData(Response resp,String path) {
		
		String jsonData = resp.jsonPath().getString(path);
		return jsonData;
	}
}
