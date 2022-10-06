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
		
		OracleDb oracleDb = new OracleDb("oracldburl", "empdb", 5216, "oracleuser", "oraclepasswd", 100);
		oracleDb.displayOracleDbInfo();
		
		MySQLDb mySQLDb = new MySQLDb("mysqlurl", "empdb", 3306, "mysqlusername", "mysqlpasswd", 50);
		mySQLDb.displayMySQLDbInfo();
		
	}

}
