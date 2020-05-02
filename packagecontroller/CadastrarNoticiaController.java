package packagecontroller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticiaDAO;

import javax.servlet.RequestDispatcher;

import model.Noticia;
import service.NoticiaService;

//Implementando servlet
@WebServlet("/CadastrarNoticia.do")
public class CadastrarNoticiaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//@see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	//@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out;
		response.setContentType("charset=UTF-8");;
		out = response.getWriter();
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset= 'utf-8>' />");
		out.println("<link rel='stylesheet' 'estilo.css' type='text/css'/>");
		out.println("</head>");
		out.println("<div align=\"center\"<font size=\"+5\" face=\"Helvetica Neue\">Sua Notícia foi postada com sucesso!\"</font>");
		out.println("<hr/>");
		out.println("<div align=\"center\"><a href=\"index.html\" type=\"button\" class=\"btn index\">Voltar ao menu</a></div>");
	
	
	try {
		
		String Descricao = request.getParameter("descricao");
		String Titulo = request.getParameter("titulo");
		String Texto = request.getParameter("texto");
		
		//instanciar o javabean
		Noticia noticia = new Noticia();
		noticia.setDescricao(Descricao);
		noticia.setTitulo(Titulo);
		noticia.setTexto(Texto);
		
		NoticiaDAO dao = new NoticiaDAO();
		dao.criar(noticia);
		
		//instanciar o service
		NoticiaService ns = new NoticiaService();
		ns.criar(noticia);
		noticia = ns.carregar(noticia.getId());
				
		//enviar para o jsp
		request.setAttribute("noticia", noticia);
			    
		RequestDispatcher view = 
		request.getRequestDispatcher("listar.jsp");
		view.forward(request, response);
	
	}
	
	catch(Exception error) {
		error.printStackTrace();
		out.println("<h1> Ops, houve uma falha na postagem da Notícia =( </h1>");
	}
	
	out.println("</html>");
	
	}
		
	}


