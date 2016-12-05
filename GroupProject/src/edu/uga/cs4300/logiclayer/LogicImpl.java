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

/**
 *
 * @author Owner
 */
public class LogicImpl {

	HttpServletRequest request=null;
	HttpServletResponse response=null;
	PersistImpl persist= null;
	ArrayList<Game> gameList = new ArrayList<>();
	ArrayList<Review> reviewList = new ArrayList<>();
	ArrayList<User> userList = new ArrayList<>();

    /**
     *
     * @param req
     * @param res
     */
    public LogicImpl(HttpServletRequest req, HttpServletResponse res){
		request = req;
		response= res;
		persist = new PersistImpl();
	} //constructor
        
    /**
     * Takes info to get the current user, if either wrong, SQL throws exception
     * @param username 
     * @param password
     */
    public void checkLoginInfo(String username, String password){
            ResultSet info = persist.getUserForSignIn(username, password);
            
            try{
                    while(info.next()){
                        User us = new User();
                        us.setUsername(info.getString(username));
                    }
            }
             catch (SQLException e) {
			// TODO REPLACE WITH ERROR MESSAGE/VARIBLE
			e.printStackTrace();
		}
            
        }//checkLoginInfo
        
    /**
     * used to generate list of all games
     * @return full list of all games
     */
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
                                gm.setId(games.getInt("id"));
				gameList.add(gm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return gameList;
	}//getAllGames

    /**
     * used to generate list of all games of a given genre
     * @param genre
     * @return list of games in genre
     */
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
                                gm.setId(games.getInt("id"));
				ResultSet genreQ = persist.getGenre(gm.getId());
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

    /**
     * used to generate list of all games of a given console
     * @param console
     * @return list of all games on said console
     */
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
                                gm.setId(games.getInt("id"));
				ResultSet consoleQ = persist.getConsoles(gm.getId());
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

    /**
     *
     * @return username and id
     */
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
        
    /**
     * used to import user into table
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
            persist.addUser(username,email,password,address,city,zip_code,state);
        }//addUser

    /**
     * used to general list of all reviews for a game
     * @param game_id
     * @return list of reviews per game with @param
     */
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
        
    /**
     * Used to add review to table
     * @param game_id
     * @param review
     * @param user_id
     * @param score
     */
    public void addReview(int game_id, String review,int user_id,int score){
            persist.addReview(game_id, review, user_id, score);
        }//addReview

    /**
     * used to return cart based on user
     * @param user_id
     * @return a list of all games in a users cart
     */
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
                                                gm.setId(games.getInt("id"));
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
        
    /**
     * used to add game per cart
     * @param user_id
     * @param game_id
     */
    public void addToCart(int user_id, int game_id){
            persist.addToCart(user_id, game_id);
        }

}
