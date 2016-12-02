package edu.uga.cs4300.objectlayer;

public class Review {
		int game_id=0;
		int score = 0;
		int user_id=0;
		String review="";
		
		public void setReview(String rv){
			review = rv;
		}
		public void getReview(){
			return review;
		}
		
		public void setUser(int uid){
			user_id = uid;
		}
		public void getUser(){
			return User_id;
		}
		
		public void setGame(int gid){
			game_id = gid;
		}
		public void getGame(){
			return game_id;
		}
		
		public void setScore(int sr){
			score = sr;
		}
		public void getScore(){
			return score;
		}
		
}//review
