package edu.uga.cs4300.persistlayer;

import java.sql.Connection;
import java.sql.ResultSet;


public class PersistImpl {
	
	//open connection
	DbAccessImpl access= new DbAccessImpl();
	Connection con = access.connect();
	
	//set up the queries
	String games = "SELECT * FROM games";
	
	public ResultSet getGames(){
		ResultSet rs = access.retrieve(con, games);
		return rs;
	}//getGames
	
	
	
	
}
