package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.DBUtils;

/**
 * Servlet implementation class TopicsServ
 */
@WebServlet("/topics")
public class TopicsServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		System.out.println("destry method called");
		try {
			DBUtils.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.write("<h1>Welcome to the servlet page</h1>");
		//pw.print("<h1>validate User :"+request.getParameter("mail")+"</h1>");
		Cookie [] cookies=request.getCookies();
		if(cookies !=null) {
			for(Cookie c:cookies) {
				if(c.getName().equals("validate_user")) {
					pw.write("<h1>found all cooies data"+c.getValue()+"</h1>");
					break;
				}
			}
			
		}else {
			pw.write("<h1>No cookies found!!!!!!!!!!!</h1>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
