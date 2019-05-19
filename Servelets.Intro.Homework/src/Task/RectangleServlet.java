package Task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RectangleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int max = 25;
		int min = 5;
		int x = (int) (Math.random() * (max - min));
		int y = (int) (Math.random() * (max - min));
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		String Title = "WowShape";
		out.println(docType + "<html>\n" + "<head><title>" + Title + "</title>\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">" + "<style>\r\n"
				+ ".square {\r\n" + "  height: " + x + "px;\r\n" + "  width: " + y + "px;\r\n"
				+ "  background-color: #FF0000;\r\n" + "}\r\n" + "</style>" + "</head>\n"
				+ "<body bgcolor = \"#f0f0f0\">\n" + "<h1 align = \"center\">" + Title + "</h1>\n"
				+ "<div class=\"square\"></div>"
				+ "<p>Click Here To go Back To Home Page: <a href=\"http://localhost:8080/Servelets.Intro.Homework\">Dates</a></p>"
				+ "</body>\n" + "</html>");
	}

}
