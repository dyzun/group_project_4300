package edu.uga.cs4300.persistlayer;

import java.sql.Connection;
import java.sql.ResultSet;


public class PersistImpl {
	//TODO TEST FOR GIT
	//open connection
	DbAccessImpl access= new DbAccessImpl();
	Connection con = access.connect();
	
	public ResultSet getGames(){
		String games = "SELECT * FROM games";
                String test ="TEST FOR GIT";
		ResultSet rs = access.retrieve(con, games);
		return rs;
	}//getGames
	
	public ResultSet getGamesById(int game_id){
		String games = "SELECT * FROM games WHERE id =" + game_id;
		ResultSet rs = access.retrieve(con, games);
		return rs;
	}//getGamesbyId
	
	public ResultSet getUser(){
		String user = "SELECT * FROM user";
		ResultSet rs = access.retrieve(con,user);
		return rs;
	}//getUser
	
	public ResultSet getUserById(int user_id){
		String user = "SELECT * FROM user WHERE id = " + user_id;
		ResultSet rs = access.retrieve(con,user);
		return rs;
	}//getUser
	
	public ResultSet getCart(int user_id){
		String cart = "SELECT * FROM cart WHERE user_id = " +user_id;
		ResultSet rs = access.retrieve(con, cart);
		return rs;
	}//getCart
	
	public ResultSet getGenre(int game_id){
		String genre = "SELECT * FROM game_genre WHERE game_id = " +game_id;
		ResultSet rs = access.retrieve(con, genre);
		return rs;
	}//getGenre
	
	public ResultSet getConsoles(int game_id){
		String console = "SELECT * FROM game_consule WHERE game_id = " +game_id;
		ResultSet rs = access.retrieve(con,console);
		return rs;
	}//getConsoles
	
	public ResultSet getReviews(int game_id){
		String reviews = "SELECT * FROM game_reviews WHERE game_id = " +game_id;
		ResultSet rs = access.retrieve(con,reviews);
		return rs;
	}//getReviews
	
	public void addReview(int game_id,String review,int user_id,int score){
		String reviews = "INSERT INTO `project_group`.`game_reviews`(`game_id`,`review`,"
				+ "`user_id`,`score`) VALUES ("+game_id+","+review+","
				+user_id+","+score+");";
		int update = access.update(con,reviews);
	}//getReviews
		
}
