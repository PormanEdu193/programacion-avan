package com.example.ejemplo;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/BeanServlet")
public class BeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	SessionBean sessionbean; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(sessionbean.Ejemplo());
	}


}
