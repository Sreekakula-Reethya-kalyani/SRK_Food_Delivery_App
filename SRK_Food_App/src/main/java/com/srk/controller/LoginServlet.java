package com.srk.controller;

import com.srk.dao.UserDao;
import com.srk.dao.UserDaoImplementation;
import com.srk.model.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        UserDao userdao=new UserDaoImplementation();
        User u=userdao.getUserData(email);
        if(u!=null && password.equals(u.getPassword()))
        {
        	HttpSession session=req.getSession();
        	session.setAttribute("loggedInUser", u);
        	resp.sendRedirect("home");
        }
        else
        {
        	req.getRequestDispatcher("wrongpassword.jsp").forward(req, resp);
        }
       
        
        
    }
}
