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
		
}//review
