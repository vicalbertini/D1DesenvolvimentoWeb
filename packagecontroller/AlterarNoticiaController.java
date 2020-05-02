package packagecontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ConnectionFactory;
import dao.NoticiaDAO;
import model.Noticia;
import service.NoticiaService;

import java.sql.ResultSet;

@WebServlet("/AlterarNoticia.do")
public class AlterarNoticiaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		
	
	Noticia noticia = new NoticiaService().carregar(id);
	
	
	out.println("<html>");
	out.println("<head>");
	out.println("<meta charset= UTF-8>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h2> Atualização da Noticia</h2>");
	out.println("<form action='DeletarAlterarNoticia.do' method='get'>");
	out.println("input style='display:none;' type = 'text' name='id' value='"+id+"'><br>");
	out.println("<input type='text' id='lname' value='"+noticia.getDescricao()+"' name='lastname' placeholder='Ex: Descrição...><br>");
	out.println("<input type = 'text' name='firstname' id= 'fname' value='"+noticia.getTitulo()+"' placeholder = 'Ex: Titulo'><br>");
	out.println("<textarea id='subject' name='subject'value='"+noticia.getTexto()+"' placeholder='Digite sua Noticia..' style='min-height: 450px; overflow: scroll; min-width: 100%;'></textarea>");
	out.println("<button type='submit'>Adicionar noticia</button>");
	out.println("</form>");
	out.println("</body>");
	out.println("</html>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		request.setCharacterEncoding("UTF-8");
		String Descricao = request.getParameter("descricao");
		String Titulo = request.getParameter("titulo");
		String Texto = request.getParameter("texto");
		int Id = Integer.parseInt(request.getParameter("id"));
		
		new NoticiaService().atualizar(new Noticia(Descricao, Titulo, Texto, Id));
		
		response.sendRedirect(request.getContextPath());
		
	
	}

}