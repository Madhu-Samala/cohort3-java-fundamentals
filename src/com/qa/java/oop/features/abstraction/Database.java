package com.qa.java.oop.features.abstraction;

public interface Database {
	
	//all the variables are bydefault
	// public static final
	public static final String DB_NAME = "empdb" ;
	String DB_USERNAME = "qa@123";
	String DB_PASSWORD = "qa@1234";
	
	
	
	//all the methods are by default public abstract
	String getDbconnection();
	void displayDatabaseInfo();
	
	
	

}
