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




/**
 * Servlet implementation class imdbServlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Configuration cfg = null;
    Map<String, Object> root = new HashMap<String, Object>();
    ArrayList<Game> gameList = new ArrayList<Game>();
    private String templateDir = "/WEB-INF/templates";
    String console="";
    String genre="";
    boolean login=false;
    
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
			genre= request.getParameter("myGenre");
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

			String username ="";
			username= request.getParameter("user");
			String password ="";
			password = request.getParameter("passw");
			System.out.println("Username: "+ username + " Password: "+ password);
			logic.checkLoginInfo(username, password);			
	} // doGet
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	} //doPost

}
