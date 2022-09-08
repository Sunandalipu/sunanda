package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClassForSerializationAndDeserialization.AddProject;

public class AddProjectSingleDataProviderTest{
	
@Test(dataProvider = "bodydata")
public void Create(String ceatedBy, String projectName, String status,int teamSize)
{
	AddProject obj = new AddProject(ceatedBy,projectName,status,teamSize);
	given()
	.body(obj).contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().statusCode(201)
	.assertThat().contentType(ContentType.JSON)
	.log().all();
}
@DataProvider
public Object[][] bodydata()
{
	Object[][] objArray= new Object[4][4];
	objArray[0][0]="sunanda";
	objArray[0][1]="green bullet";
	objArray[0][2]="On Going";
	objArray[0][3]=1;
	
	objArray[1][0]="abhi";
	objArray[1][1]="white bullet";
	objArray[1][2]="On Going";
	objArray[1][3]=1;
	
	objArray[2][0]="mukesh";
	objArray[2][1]="stealthblack bullet";
	objArray[2][2]="On Going";
	objArray[2][3]=1;
	
	objArray[3][0]="susil";
	objArray[3][1]="mattblack bullet";
	objArray[3][2]="On Going";
	objArray[3][3]=1;
	
	return objArray;
	}
}