package Task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RandomsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int x = (int)(Math.random() * 99 + 1);
		int a = (int)(Math.random() * 99 + 1);
		int b = (int)(Math.random() * 99 + 1);
		int c = (int)(Math.random() * 99 + 1);
		int d = (int)(Math.random() * 99 + 1);
		int e = (int)(Math.random() * 99 + 1);
		int f = (int)(Math.random() * 99 + 1);
		int g = (int)(Math.random() * 99 + 1);
		int h = (int)(Math.random() * 99 + 1);
		int r = (int)(Math.random() * 99 + 1);
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		String Title = "Your Secret code is: ";
		out.println(docType + "<html>\n" + "<head><title>" + Title + "</title></head>\n"
				+ "<body bgcolor = \"#f0f0f0\">\n" + "<h1 align = \"center\">" + Title + "</h1>\n"
				+ "<h2 align = \"center\">" + x + " " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + r + "</h2>\n"
				+ "<h3 align = \"center\">"
				+ "<p>Click Here To go Back To Home Page: <a href=\"http://localhost:8080/Servelets.Intro.Homework\">Dates</a></p>"
				+ "</body>\n" + "</html>");

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	

}
