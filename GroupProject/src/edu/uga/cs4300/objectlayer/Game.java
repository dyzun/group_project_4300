package edu.uga.cs4300.objectlayer;

public class Game {
		String name="";
		int date= 0;
		String image="";
		String description="";
		String publisher="";
		String developer="";
		int price=0;
		int stock=0;
                int game_id=0;
		
		public void setName(String nm){
			name = nm;
		}
		
		public void setDate(int dt){
			date = dt;
		}
		
		public void setImage(String im){
			image = im;
		}
		
		public void setDescript(String ds){
			description = ds;
		}
		
		public void setPub(String pb){
			publisher = pb;
		}
		
		public void setDev(String dv){
			developer = dv;
		}
		
		public void setPrice(int pc){
			price = pc;
		}
                public void setId(int id){
                    game_id =id;
                }
		
		public void setStock(int sc){
			stock = sc;
		}
		public String getName(){
			return name;
		}
		public int getDate(){
			return date;
		}
		public String getImage(){
			return image;
		}
		public String getDescription(){
			return description;
		}
		public String getPub(){
			return publisher;
		}
		public String getDev(){
			return developer;
		}
		public int getPrice(){
			return price;
		}
		public int getStock(){
			return stock;
		}
                public int getId(){
                    return game_id;
                }
}//game
