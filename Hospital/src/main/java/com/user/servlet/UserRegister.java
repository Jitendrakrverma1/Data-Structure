package com.user.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.entity.User;

@SuppressWarnings("serial")
@WebServlet("/user_register")
public class UserRegister extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	try 
    	{   
    		String id = req.getParameter("id");
    		String fullName = req.getParameter("fullname");
    		String email = req.getParameter("email");
    		String password = req.getParameter("password");
    		
    		User u = new User(id,fullName, email, password);
    		
    		UserDao dao = new UserDao(DBConnect.getConn());
    		boolean f = dao.register(u);
    		
    		if(f==true) {
    			System.out.println("register successful");
    		}
    		else {
    			System.out.println("Something wrong on server");
    		}
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
