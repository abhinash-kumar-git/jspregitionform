package www.pack.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
	ServletConfig config;

	public void init(ServletConfig config) {
		this.config=config;
		System.out.println("creating objecting---------");
		
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
		System.out.println("Servicing_______________");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>this is my output file from servlet method</h1>");
		out.println("<h1>today date and time is"+new Date().toString()+"</h1>");
		out.print("<h1>hghjhkk</h1>");
	}
	public void destroy() {
		System.out.println("destroy");
		
	}
	public String getServletInfo() {
		return "this service is by abhinash kumar";
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}
	

}
