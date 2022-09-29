package www.myservlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

;

public class MyServlet extends HttpServlet{
	 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		 System.out.println("Servlet request file");
		 PrintWriter out=res.getWriter();
		  res.setContentType("text/html");
		  
		 out.println("<h1>welcome to dashboard</h1>");
		
	}
	 public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		 System.out.println("Servlet request file");
		 PrintWriter out=res.getWriter();
		 String name=req.getParameter("user_name");
		 String pass=req.getParameter("user_password");
		 String email=req.getParameter("email");
		 System.out.println(name+"   "+pass+"  "+email);
//		 RequestDispatcher re=req.getRequestDispatcher("success");
//		 re.forward(req,res);
		 if(name==null&&name==""&& pass==null&&pass==""&&email==null&&email=="") {
			 
			 out.println("please enter all detail");
		 }else {
			 out.println("wrong your details");
		 }
		
		  res.setContentType("text/html");
		  
		 out.println("<h1>post method</h1>");
		
	 }
	 
}
