package packagecontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;

import java.util.ArrayList;



@WebServlet("/ListarNoticia.do")
public class ListarNoticiaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		
		ArrayList<Noticia> noticias = new NoticiaService().ListarNoticiaController();
		
		
		PrintWriter out;
		response.setContentType("charset=UTF-8");;
		out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href='ListarNoticia.do'>criar noticia</a>");
		if(noticias.size() > 0)
	    for(Noticia noticia : noticias) {
	 
	
	 
	    }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}