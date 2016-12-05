package edu.uga.cs4300.logiclayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.uga.cs4300.objectlayer.Game;
import edu.uga.cs4300.objectlayer.Review;
import edu.uga.cs4300.objectlayer.User;
import edu.uga.cs4300.persistlayer.PersistImpl;

public class LogicImpl {

	HttpServletRequest request=null;
	HttpServletResponse response=null;
	PersistImpl persist= null;
	ArrayList<Game> gameList = new ArrayList<Game>();
	ArrayList<Review> reviewList = new ArrayList<Review>();
	ArrayList<User> userList = new ArrayList<User>();

	public LogicImpl(HttpServletRequest req, HttpServletResponse res){
		request = req;
		response= res;
		persist = new PersistImpl();
	} //constructor

	public ArrayList<Game> getAllGames(){
		//get the result sets
		ResultSet games = persist.getGames();

		try {
			while(games.next()){
				Game gm = new Game();
				gm.setDate(games.getInt("release_date"));
				gm.setDescript(games.getString("description"));
				gm.setDev(games.getString("developer"));
				gm.setImage(games.getString("img"));
				gm.setName(games.getString("name"));
				gm.setPrice(games.getInt("price"));
				gm.setPub(games.getString("publisher"));
				gm.setStock(games.getInt("stock"));
				gameList.add(gm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return gameList;
	}//getAllGames

	public ArrayList<Game> getGamesByGenre(String genre){
		//get the result sets
		ResultSet games = persist.getGames();

		try {
			while(games.next()){
				Game gm = new Game();
				gm.setDate(games.getInt("release_date"));
				gm.setDescript(games.getString("description"));
				gm.setDev(games.getString("developer"));
				gm.setImage(games.getString("img"));
				gm.setName(games.getString("name"));
				gm.setPrice(games.getInt("price"));
				gm.setPub(games.getString("publisher"));
				gm.setStock(games.getInt("stock"));
				ResultSet genreQ = persist.getGenre(games.getInt("id"));
				try{
					while(genreQ.next()){
						if(genreQ.getString("genre").equals(genre)){
							gameList.add(gm);
						}//if
					}//while
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//try catch
			}//while
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gameList;
	}//getGamesByGenre

	public ArrayList<Game> getGamesByConsole(String console){
		//get the result sets
		ResultSet games = persist.getGames();

		try {
			while(games.next()){
				Game gm = new Game();
				gm.setDate(games.getInt("release_date"));
				gm.setDescript(games.getString("description"));
				gm.setDev(games.getString("developer"));
				gm.setImage(games.getString("img"));
				gm.setName(games.getString("name"));
				gm.setPrice(games.getInt("price"));
				gm.setPub(games.getString("publisher"));
				gm.setStock(games.getInt("stock"));
				ResultSet consoleQ = persist.getConsoles(games.getInt("id"));
				try{
					while(consoleQ.next()){
						if(consoleQ.getString("consule").equals(console)){
							gameList.add(gm);
						}//if
					}//while
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//try catch
			}//while
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gameList;
	}//getGamesByConsole

	public ArrayList<User> getUser(){
		ResultSet users = persist.getUser();

		try {
			while(users.next()){
				User us = new User();
				us.setUsername(users.getString("username"));
				us.setUser_id(users.getInt("id"));
				userList.add(us);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userList;
	}//getUser

	public ArrayList<Review> getReviewsByGame(int game_id){
		//get the result sets
		ResultSet reviews = persist.getReviews(game_id);
		ResultSet users = persist.getUser();			
		try {
			while(reviews.next()){
				Review rv = new Review();
				rv.setScore(reviews.getInt("score"));
				rv.setReview(reviews.getString("review"));
				//TODO need to setUser
				try{
					while(users.next()){
						User us = new User();
						if(us.getUser_id() == reviews.getInt("user_id")){
							rv.setReviewer(us.getUsername());
						}//if
					}//while users
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//trycatch
				reviewList.add(rv);
			}//while reviews
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reviewList;
	}//getReviewsByGame

	public ArrayList<Game> getCart(int user_id){
		//get the result sets
		ResultSet cart = persist.getCart(user_id);			
		try{
			while(cart.next()){
				ResultSet games = persist.getGamesById(cart.getInt("game_id"));
				try {
					while(games.next()){
						Game gm = new Game();
						gm.setDate(games.getInt("release_date"));
						gm.setDescript(games.getString("description"));
						gm.setDev(games.getString("developer"));
						gm.setImage(games.getString("img"));
						gm.setName(games.getString("name"));
						gm.setPrice(games.getInt("price"));
						gm.setPub(games.getString("publisher"));
						gm.setStock(games.getInt("stock"));
						gameList.add(gm);
					}//while
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//trycatch
			}//while cart
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//trycatch
		return gameList;
	}//getCart

}
