package com.qa.java.oop.features.abstraction;

public class MySQL extends DatabaseProperties implements Database {

	
	int maxConnectionPool;
	
	
	

	public MySQL(String dbName, String dbUrl, int portNo, int maxConnectionPool) {
		super(dbName, dbUrl, portNo);
		this.maxConnectionPool = maxConnectionPool;
	}

	@Override
	public String getDbconnection() {
		return "connected -> MySQL";
	}

	@Override
	public void displayDatabaseInfo() {
		System.out.println("Database Url : " + dbUrl);
		System.out.println("Database Name : " + dbName);
		System.out.println("Database Port : " + portNo);
		System.out.println("Database Username : " + DB_USERNAME);
		System.out.println("Database Password : " + DB_PASSWORD);
		System.out.println("Max Connection Pool : " + maxConnectionPool);

	}

}
