package www.pack.com.gric;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
		System.out.println("this is servlet using generic servlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>this is my output file from servlet method</h1>");
		out.println("<h1>today date and time is"+new Date().toString()+"</h1>");
		out.print("<h1>hghjhkk</h1>");

	}
}