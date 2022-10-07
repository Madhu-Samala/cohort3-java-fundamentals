package com.qa.java.oop.features.abstraction;

public class DatabaseUtil {
	
	String getDbConnection(Database database) {
		return database.getDbconnection();
	}
	
	void displayDatabaseInfo(Database database) {
		database.displayDatabaseInfo();
	}

}
