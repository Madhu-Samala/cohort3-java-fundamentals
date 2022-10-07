package com.qa.java.oop.features;

public class OracleDb extends Database {

	int maxNoOfUsersAllowed;

	public OracleDb() {
		super();
		System.out.println("Oracledb() constructor");
	}

	public OracleDb(int maxNoOfUsersAllowed) {
		super();
		this.maxNoOfUsersAllowed = maxNoOfUsersAllowed;
	}

	public OracleDb(String url, String dbName, int port, String username, String password, int maxNoOfUsersAllowed) {
		super(url, dbName, port, username, password);
		this.maxNoOfUsersAllowed = maxNoOfUsersAllowed;
	}

	@Override
	String getDbConnection() {
		return "connected -> Oracle";
	}

	@Override
	void displayDatabaseInfo() {
		System.out.println("Database Url : " + url);
		System.out.println("Database Name : " + dbName);
		System.out.println("Database Port : " + port);
		System.out.println("Database Username : " + username);
		System.out.println("Database Password : " + password);
		System.out.println("Max No Of Users Allowed : " + maxNoOfUsersAllowed);
		
		
		
	}
	
	
	
	//Overriding
	/*void displayDatabaseInfo() {
		
		System.out.println("Max No Of Users Allowed : " + maxNoOfUsersAllowed);
	}
	
	String getDbConnection() {
		return "connected -> Oracle";
	}*/
	
	
	

}
