package edu.uga.cs4300.objectlayer;

public class User {
	String username="";
	String password="";
	String email="";
	String address="";
	int user_id=0;
	
	public User(){
			
		}

	public User(String u, String p, String e){
		this.username=u;
		this.password=p;
		this.email=e;
	}
	
	public String getUsername(){
		return username;
	}

	public int getUser_id(){
		return user_id;
	}
	
	public void setUsername(String u){
		username = u;
	}

	public void setUser_id(int id){
		user_id = id;
	}
	
}//User