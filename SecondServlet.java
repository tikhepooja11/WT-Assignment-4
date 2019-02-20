// Name this file as SecondServlet.java 
package GeeksforGeeks; 

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*; 

@WebServlet("/SecondServlet") // annotation 
public class SecondServlet extends HttpServlet { 

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	{ 
		try { 

			response.setContentType("text/html");
			PrintWriter out = response.getWriter(); 
			// getting value from the query string 
			String n = request.getParameter("uname"); 
			out.print("Hello " + n); 
			/* out.println is used to print on the client web browser */
			out.close(); 
		} 
		catch (Exception e) { 
			System.out.println(e); 
		} 
	} 
} 
