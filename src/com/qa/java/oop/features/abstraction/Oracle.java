package com.qa.java.oop.features.abstraction;

public class Oracle extends DatabaseProperties implements Database {
	
	
	int maxNoOfUsersAllowed;
	
	


	public Oracle(String dbName, String dbUrl, int portNo, int maxNoOfUsersAllowed) {
		super(dbName, dbUrl, portNo);
		this.maxNoOfUsersAllowed = maxNoOfUsersAllowed;
	}

	@Override
	public String getDbconnection() {
		return "connected -> Oracle";
	}

	@Override
	public void displayDatabaseInfo() {
		System.out.println("Database Url : " + dbUrl);
		System.out.println("Database Name : " + DB_NAME);
		System.out.println("Database Port : " + portNo);
		System.out.println("Database Username : " + DB_USERNAME);
		System.out.println("Database Password : " + DB_PASSWORD);
		System.out.println("Max No Of Users Allowed : " + maxNoOfUsersAllowed);

	}

}
