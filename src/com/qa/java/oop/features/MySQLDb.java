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
	
	void displayMySQLDbInfo() {
		displayDatabaseInfo();
		System.out.println("Max Connection Pool : " + maxConnectionPool);
	}
	
	
}
