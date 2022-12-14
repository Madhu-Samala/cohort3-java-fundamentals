package com.qa.java.oop.features;

public abstract class Database {

	String url;
	String dbName;
	int port;
	String username;
	String password;

	public Database() {
		System.out.println("Database() constructor");
	}

	public Database(String url, String dbName, int port, String username, String password) {
		this.url = url;
		this.dbName = dbName;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	abstract String getDbConnection();

	abstract void displayDatabaseInfo();

	{
		System.out.println("Database Url : " + url);
		System.out.println("Database Name : " + dbName);
		System.out.println("Database Port : " + port);
		System.out.println("Database Username : " + username);
		System.out.println("Database Password : " + password);
	}

	final static void displayDatabaseInfo(String dbName) {
		System.out.println("displaying database with databasename : " + dbName);
	}

}
