package com.crm.comcast.GenericUtilities;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class DataBaseUtility {
	static Driver driverRef;
	static Connection connection;
	static ResultSet result;
	/**
	 * this method is used to connect to DB
	 * 
	 */
public void connectToDB()
{
	try {
		driverRef= new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driverRef);
		connection=DriverManager.getConnection(IConstants.Dburl,IConstants.DBUsername,IConstants.DBPassword);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
/**
 * this method is used to close DB connection
 */
public void closeDB()
{
	try {
		connection.close();
	}catch(Exception e) {
		
	}
}
/**
 * this method is used to execute query
 * @param query
 * @param columnNum
 * @param expectedDate
 * @return
 * @throws SQLException 
 */
public boolean executeQuery(String query,int columnNum,String expectedDate) throws SQLException
{
	result= connection.createStatement().executeQuery(query);
    boolean flag = false;
    while(result.next())
{
	if(flag)
	{
		flag = true;
		break;
		
	}
}

if(flag)
{
	System.out.println("data is present");
	return flag;
}else {
	System.out.println("data is not present");
	return flag;
}
}

/**
 * this method is used to perform execute update
 * @param query
 * @throws SQLException 
 */
public void executeUpdate(String query) throws SQLException
{
int res = connection.createStatement().executeUpdate(query);
if(res==1)
{
	System.out.println("data is updated");
}else {
	System.out.println("data is not updated");
}
}
}