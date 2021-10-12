package project;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet ("Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1565465L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName=request.getParameter("fName");
		String lastName=request.getParameter("lName");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		String result=null;
		Member mem = new Member(firstName,lastName,username,password,address,contact);
		Dao dao = new Dao();
		try {
			result = dao.insert(mem);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		PrintWriter out = response.getWriter();
		out.print("<h1>" + result +"</h1>");
	
	}

}
