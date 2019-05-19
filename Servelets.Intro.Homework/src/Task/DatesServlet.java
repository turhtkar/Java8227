package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DatesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Date CreationDate = new Date();
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		String initTitle = "Date Servlet Inti date: ";
		String CurrentTitle = "Current Time Is :";
	      out.println(docType +
	    	         "<html>\n" +
	    	            "<head><title>" + initTitle + "</title></head>\n" +
	    	            "<body bgcolor = \"#f0f0f0\">\n" +
	    	               "<h1 align = \"center\">" + initTitle + "</h1>\n" +
	    	               "<h2 align = \"center\">" + CreationDate.toString() + "</h2>\n" +
	    	               "<h3 align = \"center\">" + CurrentTitle + "</h3>\n" +
	    	               "<p align = \"center\">" + CreationDate.toString() + "</p>\n" +
	    	               "<meta http-equiv='refresh' content='1'" + "URL=" +
	    	               "http://localhost:8084/servletExample/dateTimeServlet'>\n" +
	    	               "<p>Click Here To go Back To Home Page: <a href=\"http://localhost:8080/Servelets.Intro.Homework\">Dates</a></p>" +
	    	            "</body>\n" +
	    	         "</html>"
	    	      );
	     
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	
}
