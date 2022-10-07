package com.qa.java.oop.features;

public class MySQLDb extends Database {

	int maxConnectionPool;

	public MySQLDb() {
		super();
		System.out.println("MySQLDb() constructor");
	}

	public MySQLDb(int maxConnectionPool) {
		super();
		this.maxConnectionPool = maxConnectionPool;
	}

	public MySQLDb(String url, String dbName, int port, String username, String password, int maxConnectionPool) {
		super(url, dbName, port, username, password);
		this.maxConnectionPool = maxConnectionPool;
	}

	@Override
	String getDbConnection() {
		return "connected -> MySQL";
	}

	@Override
	void displayDatabaseInfo() {
		System.out.println("Database Url : " + url);
		System.out.println("Database Name : " + dbName);
		System.out.println("Database Port : " + port);
		System.out.println("Database Username : " + username);
		System.out.println("Database Password : " + password);
		System.out.println("Max Connection Pool : " + maxConnectionPool);
		
	}
	
	/*void displayDatabaseInfo() {
		super.displayDatabaseInfo();
		System.out.println("Max Connection Pool : " + maxConnectionPool);
	}
	
	String getDbConnection() {
		return "connected -> MySQL";
	} */
}
