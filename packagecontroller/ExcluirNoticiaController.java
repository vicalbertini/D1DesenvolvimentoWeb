package packagecontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.NoticiaService;


@WebServlet("/ExcluirNoticia.do")
public class ExcluirNoticiaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ExcluirNoticiaController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Id = Integer.parseInt(request.getParameter("id"));
		new NoticiaService().excluir(Id);
		
		response.sendRedirect(request.getContextPath());
	}

}