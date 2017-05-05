package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Crianca;
import service.SCrianca;

/**
 * Servlet implementation class HCrianca
 */
@WebServlet("/HCrianca")

public class HCrianca extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SCrianca servCrianca;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HCrianca() {
        super();
        // TODO Auto-generated constructor stub
        
        servCrianca = new SCrianca();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("listaCriancas", servCrianca.getArCrianca());
		
		request.getRequestDispatcher("Crianca.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Crianca c= new Crianca(
				servCrianca.getArCrianca().size(),
				request.getParameter("nome"),
				request.getParameter("data_nascimento"),
				request.getParameter("ccidadao"),
				request.getParameter("observacoes")
				);
		
		servCrianca.getArCrianca().add(c);
		
		doGet(request, response);
	}

}
