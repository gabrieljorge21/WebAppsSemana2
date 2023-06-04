package com.utec.registration.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.utec.registration.model.*;

/**
 * Servlet implementation class PersonaServlet
 */
@WebServlet("/validar")
public class ValidarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarServlet() {
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
		
		String nombre = request.getParameter("nombre");
		
		if(!nombre.isBlank()) {
			String msjError = "";
			int edad=Integer.parseInt(request.getParameter("edad"));
			String direccion=request.getParameter("direccion");
			String telefono=request.getParameter("telefono");
			
			PersonaVM pvm = new PersonaVM();
			
			pvm.setNombre(nombre);
			pvm.setEdad(edad);
			pvm.setDireccion(direccion);
			pvm.setTelefono(telefono);
				
			request.setAttribute("persona", pvm);
			request.setAttribute("mensajeError", msjError);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ingresar");
			
			rd.forward(request, response);
		}	
		else {
			String msjError = "Debe ingresar el nombre";
			request.setAttribute("mensajeError",msjError);
			
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            
			rd.include(request, response);
		}
	}

}
