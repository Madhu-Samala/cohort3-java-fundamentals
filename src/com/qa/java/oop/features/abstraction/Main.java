package com.qa.java.oop.features.abstraction;

public class Main {

	public static void main(String[] args) {

		DatabaseUtil databaseUtil = new DatabaseUtil();
		Oracle oracledb = new Oracle("empdb","oracledburl", 52617, 100);
		MySQL mysqldb = new MySQL("empdb","mysqlurl", 3306, 50);
		
		System.out.println(databaseUtil.getDbConnection(mysqldb));
		databaseUtil.displayDatabaseInfo(mysqldb);
	}

}
