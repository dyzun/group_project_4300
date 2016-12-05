package edu.uga.cs4300.persistlayer;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Owner
 */
public class PersistImpl {
	//open connection
	DbAccessImpl access= new DbAccessImpl();
	Connection con = access.connect();
	
    /**
     * used in LogicImpl for getting all games
     * @return all games
     */
    public ResultSet getGames(){
		String games = "SELECT * FROM games";
		ResultSet rs = access.retrieve(con, games);
		return rs;
	}//getGames
	
    /**
     * get a specific game based on its ID
     * @param game_id
     * @return single row from SQL table of game with id
     */
    public ResultSet getGamesById(int game_id){
		String games = "SELECT * FROM games WHERE id =" + game_id;
		ResultSet rs = access.retrieve(con, games);
		return rs;
	}//getGamesbyId
	
    /**
     * used to get all users
     * @return list of all user info
     */
    public ResultSet getUser(){
		String user = "SELECT * FROM user";
		ResultSet rs = access.retrieve(con,user);
		return rs;
	}//getUser
        
    /**
     * used to add user into table
     * @param username
     * @param email
     * @param password
     * @param address
     * @param city
     * @param zip_code
     * @param state
     */
    public void addUser(String username,String email,String password, String address,
                String city, int zip_code, String state){
            String user = "INSERT INTO `project_group`.`user`(`username`,`email`,"
                    + "`password`,`address`,`city`,`zip_code`,`state`) VALUES ("
                    + "'"+username+"', '"+email+"', '"+password+"', '"+address+"',"
                    + "'"+city+"', " + zip_code+ ",'"+state+"')";
            int update = access.update(con,user);
        }
	
    /**
     * used to get specific user
     * @param user_id
     * @return return single row of user table based on user_id
     */
    public ResultSet getUserById(int user_id){
		String user = "SELECT * FROM user WHERE id = " + user_id;
		ResultSet rs = access.retrieve(con,user);
		return rs;
	}//getUser
        
<<<<<<< HEAD
    /**
     * used to check login info
     * @param user
     * @param pass
     * @return single row of user with password, meant to fail if either wrong
     */
    public ResultSet getUserForSignIn(String user, String pass){
=======
        public ResultSet getUserForSignIn(String user, String pass){
>>>>>>> 270e7c4475047861df91e0f8d654a20ca8e13413
                String query = "SELECT * FROM user WHERE username = '"+user+"' AND password = '"+pass+"'";
                ResultSet rs = access.retrieve(con, query);
                return rs;
        }//getUser for login
        
    /**
     * used to return all items in a users cart
     * @param user_id
     * @return all rows in cart table based on user
     */
    public ResultSet getCart(int user_id){
		String cart = "SELECT * FROM cart WHERE user_id = " +user_id;
		ResultSet rs = access.retrieve(con, cart);
		return rs;
	}//getCart
        
    /**
     * used to add item to cart based on user id and game id
     * @param user_id
     * @param game_id
     */
    public void addToCart(int user_id, int game_id){
		String cart = "INSERT INTO `project_group`.`cart`(`user_id`,`game_id`)"
                        + "VALUES ( "+user_id+","+game_id+")";
		int update = access.update(con,cart);
	}//getCart
	
    /**
     * used to get genre of a selected game
     * @param game_id
     * @return all genres of a selected game
     */
    public ResultSet getGenre(int game_id){
		String genre = "SELECT * FROM game_genre WHERE game_id = " +game_id;
		ResultSet rs = access.retrieve(con, genre);
		return rs;
	}//getGenre
	
    /**
     * used to get console of a selected game
     * @param game_id
     * @return all consoles of a selected game
     */
    public ResultSet getConsoles(int game_id){
		String console = "SELECT * FROM game_consule WHERE game_id = " +game_id;
		ResultSet rs = access.retrieve(con,console);
		return rs;
	}//getConsoles
	
    /**
     * used to return all reviews for a selected game
     * @param game_id
     * @return all reviews based on game id
     */
    public ResultSet getReviews(int game_id){
		String reviews = "SELECT * FROM game_reviews WHERE game_id = " +game_id;
		ResultSet rs = access.retrieve(con,reviews);
		return rs;
	}//getReviews
	
    /**
     * used to add review to table
     * @param game_id
     * @param review
     * @param user_id
     * @param score
     */
    public void addReview(int game_id,String review,int user_id,int score){
		String reviews = "INSERT INTO `project_group`.`game_reviews`(`game_id`,`review`,"
				+ "`user_id`,`score`) VALUES ("+game_id+",'"+review+"',"
				+user_id+","+score+");";
		int update = access.update(con,reviews);
	}//getReviews
		
}
