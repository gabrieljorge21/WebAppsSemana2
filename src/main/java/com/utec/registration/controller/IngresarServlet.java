package com.utec.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utec.registration.data.Data;
import com.utec.registration.model.*;

/**
 * Servlet implementation class IngresarServlet
 */
@WebServlet("/ingresar")
public class IngresarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static long contador = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PersonaVM pvm = (PersonaVM)request.getAttribute("persona");
		Persona p = new Persona();
		
		p.setId(contador++);
		p.setNombre(pvm.getNombre());
		p.setEdad(pvm.getEdad());
		p.setDireccion(pvm.getDireccion());
		p.setTelefono(pvm.getTelefono());
		
		Data.AddPersona(p);
		
		RequestDispatcher rd = request.getRequestDispatcher("/mostrardato.jsp");
        
		rd.forward(request, response);
	}
}
