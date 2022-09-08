package com.crm.comcast.GenericUtilities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseApiClass {
DataBaseUtility dLib=new DataBaseUtility();
JavaUtility jLib= new JavaUtility();

@BeforeSuite
public void bsConfig()
{
	dLib.connectToDB();
	
	
}

@AfterSuite
public void bsconf()
{
	dLib.closeDB();
}


}
