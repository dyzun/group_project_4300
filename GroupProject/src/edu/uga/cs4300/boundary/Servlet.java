package edu.uga.cs4300.boundary;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.uga.cs4300.logiclayer.LogicImpl;
import edu.uga.cs4300.objectlayer.Game;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapperBuilder;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class imdbServlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Configuration cfg = null;
    Map<String, Object> root = new HashMap<String, Object>();
    ArrayList<Game> gameList = new ArrayList<Game>();
    ArrayList<Game> gamesForPurchase = new ArrayList<Game>();
    private String templateDir = "/WEB-INF/templates";
    String console="";
    String genre="";
    String gameId="";
    String gameToRemove="";
    String myCart="";
    int totalPrice = 0;
    boolean login=false;
    String logIn="";
    String logOut="";
    String gameToCart="";
    String register="";

    
    
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	// Create your Configuration instance, and specify if up to what FreeMarker
    	// version (here 2.3.25) do you want to apply the fixes that are not 100%
    	// backward-compatible. See the Configuration JavaDoc for details.
    	cfg = new Configuration(Configuration.VERSION_2_3_25);
    	
    	// Specify the source where the template files come from.
		cfg.setServletContextForTemplateLoading(getServletContext(), templateDir);
		
		// Sets how errors will appear.
		// During web page *development* TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		// Don't log exceptions inside FreeMarker that it will thrown at you anyway:
		cfg.setLogTemplateExceptions(false);
		
		
    }// init
	
	public void runTemplate(HttpServletRequest request, HttpServletResponse response, String templName) {
			// You can use this structure for all of your objects to be sent to browser
			Template template = null;
			DefaultObjectWrapperBuilder df = new DefaultObjectWrapperBuilder(Configuration.VERSION_2_3_25);
			
			try {
				String templateName = templName;
				template = cfg.getTemplate(templateName);
				response.setContentType("text/html");
				Writer out = response.getWriter();
				template.process(root, out);
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (TemplateException e) {
				e.printStackTrace();
			}
	}// runTemplate

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			LogicImpl logic = new LogicImpl(request, response);
			console = request.getParameter("myConsole");
			genre = request.getParameter("myGenre");
			gameId = request.getParameter("myGame");
			gameToCart = request.getParameter("gameToCart");
			gameToRemove = request.getParameter("gameToRemove");
			myCart = request.getParameter("myCart");
                        logIn = request.getParameter("logIn");
                        logOut = request.getParameter("logOut");
                        register = request.getParameter("register");
                        String username ="";
			username= request.getParameter("user");
			String password ="";
			password = request.getParameter("passw");
                        
                        String street = request.getParameter("street");
                        String email = request.getParameter("email");
                        String state = request.getParameter("state");
                        String city = request.getParameter("city");
                        String zip = request.getParameter("zip");
                        
			gameList.clear();
			
			if(console != null){
				gameList.addAll(logic.getGamesByConsole(console));
				root.put("games", gameList);
				root.put("console", console);
				runTemplate(request, response,"displayGames.ftl");
			}
			else if(genre != null){
				gameList.addAll(logic.getGamesByGenre(genre));
				root.put("games", gameList);
				root.put("genre", genre);
				runTemplate(request, response,"displayGenre.ftl");
			}
			else if(gameId != null){
				int id = Integer.parseInt(gameId);
				Game gm = logic.getGameById(id);
				root.put("game", gm);
				runTemplate(request, response, "gamePage.ftl");
			}
                        else if(gameToCart != null){
				int id = Integer.parseInt(gameToCart);
				System.out.println(gameToCart);
				gameToCart = null;
				System.out.println(gameToCart);
				Game gm = logic.getGameById(id);
				gamesForPurchase.add(gm);
				totalPrice += gm.getPrice();
				System.out.println("I ran");
				root.put("totalPrice", totalPrice);
				root.put("games", gamesForPurchase);
				runTemplate(request, response, "cart.ftl");
			}
			else if(myCart != null){
				root.put("totalPrice", totalPrice);
				root.put("games", gamesForPurchase);
				runTemplate(request, response, "cart.ftl");
			}
                        else if(logIn !=null){
                            String output = "";
                        
                            if(logic.checkLoginInfo(username, password)){
                            	
                            HttpSession session = request.getSession(); //creates a new session
                            session.setAttribute("name", username);
                            output = "User: " + username;
                            System.out.println("Logged in");
                        }
                            else output = "Account information is incorrect";
                            
                            root.put("input",output);
                            runTemplate(request, response, "index.ftl");
                            
                            
                        }
                        else if(logOut != null){
                            String output ="User: Guest";
                            response.setContentType("text/html");  
                            PrintWriter out=response.getWriter();  
                            HttpSession session=request.getSession();  
                            session.invalidate();  
                            root.put("input", output);
                            runTemplate(request, response, "index.ftl");
                        }
                        else if(register != null){
                            String output = "";
                            
                            if(logic.register(username, password, email, street, city, state, zip)) output = "Account created. Enter information above to sign in";
                            else output = "Username is already taken";
                            
                            root.put("input", output);
                            runTemplate(request, response, "index.ftl");

                        }

	} // doGet
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	} //doPost

}
