package com.qa.java.oop.features;

public class Main {

	public static void main(String[] args) {

		// Database db = new Database();

		/*OracleDb oracleDb = new OracleDb(100);
		System.out.println(oracleDb.maxNoOfUsersAllowed);
		System.out.println(oracleDb.dbName);

		MySQLDb mySQLDb = new MySQLDb(50);
		System.out.println(mySQLDb.maxConnectionPool);
		System.out.println(mySQLDb.dbName);*/
		
		//Database database = new Database(); can't instantiate abstract classes
		
		OracleDb oracleDb = new OracleDb("oracldburl", "empdb", 5216, "oracleuser", "oraclepasswd", 100);
		oracleDb.displayDatabaseInfo();
		
		MySQLDb mySQLDb = new MySQLDb("mysqlurl", "empdb", 3306, "mysqlusername", "mysqlpasswd", 50);
		mySQLDb.displayDatabaseInfo();
		
		DatabaseUtil dbUtil = new DatabaseUtil();
		System.out.println(dbUtil.getDbConnection(mySQLDb));
		mySQLDb.displayDatabaseInfo("empdb");
		
	}

}
