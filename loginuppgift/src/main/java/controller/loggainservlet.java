package controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.myjavabean;
import model.userhandler;

/**
 * Servlet implementation class loggainservlet
 */
@WebServlet("/loggainservlet")
public class loggainservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loggainservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		myjavabean user1=new myjavabean();
		user1.setUsername(request.getParameter("un"));
		user1.setPassword(request.getParameter("pw"));
		user1.setMsg(request.getParameter("msg"));
		
		
;	    
	   if(user1.getPassword().equals("josip") && user1.getUsername().equals("josip")) {
		   
		   HttpSession session = request.getSession();
		   session.setAttribute("mySession", user1.getUsername());
		   
		   request.setAttribute("msg", user1);
		   
		   RequestDispatcher rd = request.getRequestDispatcher("welcomepage.jsp");
		   
		   rd.forward(request, response);
	   }
	    
	    
	   /* if (username.equals(request.getParameter("un")) && password.equals(request.getParameter("pw"))) {
			HttpSession session = request.getSession(); 
			session.setAttribute("mySession",request.getParameter("un"));
			session.getAttribute("un");
			RequestDispatcher rd = request.getRequestDispatcher("welcomepage.jsp");
			rd.forward(request, response);

		
		}else if(username2.equals(request.getParameter("un")) && password2.equals(request.getParameter("pw"))) {
			HttpSession session = request.getSession();
			session.setAttribute("mySession",request.getParameter("un"));
			session.getAttribute("un");
			RequestDispatcher rd = request.getRequestDispatcher("welcomepage.jsp");
			rd.forward(request, response);
			
			
		}*/
	    
	    
	    
		
	}
	

}
