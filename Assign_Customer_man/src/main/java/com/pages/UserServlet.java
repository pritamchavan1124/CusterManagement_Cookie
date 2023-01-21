package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dal.DALImplemention;
import com.pojo.User;
import com.utils.DBUtils;
import static com.utils.DBUtils.*;

@WebServlet(value = "/user", loadOnStartup = 1)
public class UserServlet extends HttpServlet {
	
	DALImplemention dalObj;
	@Override
	public void init() throws ServletException {
		try {
			DBUtils.openConnection();
			dalObj=new DALImplemention();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try(PrintWriter pw=resp.getWriter();){
			
		
		pw.write("<h2>Welcome to User System</h2>");
		String userEmail=req.getParameter("mail");
		String password=req.getParameter("pass");
		
		User uObj=dalObj.validateUser(userEmail, password);
		System.out.println(uObj);
		if(uObj!=null) {
			pw.write("<h1>User Successfully Login</h1>");
			
			Cookie c1=new Cookie("validate_user", uObj.toString());//cookies are stored in server side heap
			resp.addCookie(c1);//method of HttpServletResponse
			resp.sendRedirect("topics");
		}
		else
		{
			
			pw.write("<h4>Invalid Login,please <a href='index.html'>Retry</a></h4>");
		}
	}catch(Exception e) {
		throw new ServletException("err occur in do post method", e);
	}
	}

	@Override
	public void destroy() {
		try {
			DBUtils.closeConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}

	
	
	

}
