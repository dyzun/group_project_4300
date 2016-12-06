package edu.uga.cs4300.objectlayer;

/**
 *
 * @author Owner
 */
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
		
    /**
     *
     * @param nm
     */
    public void setName(String nm){
			name = nm;
		}
		
    /**
     *
     * @param dt
     */
    public void setDate(int dt){
			date = dt;
		}
		
    /**
     *
     * @param im
     */
    public void setImage(String im){
			image = im;
		}
		
    /**
     *
     * @param ds
     */
    public void setDescript(String ds){
			description = ds;
		}
		
    /**
     *
     * @param pb
     */
    public void setPub(String pb){
			publisher = pb;
		}
		
    /**
     *
     * @param dv
     */
    public void setDev(String dv){
			developer = dv;
		}
		
    /**
     *
     * @param pc
     */
    public void setPrice(int pc){
			price = pc;
		}

    /**
     *
     * @param id
     */
    public void setId(int id){
                    game_id =id;
                }
		
    /**
     *
     * @param sc
     */
    public void setStock(int sc){
			stock = sc;
		}

    /**
     *
     * @return
     */
    public String getName(){
			return name;
		}

    /**
     *
     * @return
     */
    public int getDate(){
			return date;
		}

    /**
     *
     * @return
     */
    public String getImage(){
			return image;
		}

    /**
     *
     * @return
     */
    public String getDescription(){
			return description;
		}

    /**
     *
     * @return
     */
    public String getPub(){
			return publisher;
		}

    /**
     *
     * @return
     */
    public String getDev(){
			return developer;
		}

    /**
     *
     * @return
     */
    public int getPrice(){
			return price;
		}

    /**
     *
     * @return
     */
    public int getStock(){
			return stock;
		}

    /**
     *
     * @return
     */
    public int getId(){
                    return game_id;
                }
}//game
