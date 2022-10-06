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
	
	
	void displayOracleDbInfo() {
		displayDatabaseInfo();
		System.out.println("Max No Of Users Allowed : " + maxNoOfUsersAllowed);
	}
	
	
	

}
