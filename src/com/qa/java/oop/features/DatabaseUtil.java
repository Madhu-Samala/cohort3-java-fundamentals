package com.qa.java.oop.features;

public class DatabaseUtil {
	
	String getDbConnection(Database db) {
		return db.getDbConnection();
	}
	
	void displayDatabaseInfo(Database db) {
		db.displayDatabaseInfo();
	}

}
