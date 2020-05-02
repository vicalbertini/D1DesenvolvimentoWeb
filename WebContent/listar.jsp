<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar</title>
</head>
<body>
 
 <tr>
 
 <td>id</td>
  <td>descricao</td>
  <td>titulo</td>
   <td>texto</td>
 </tr>
 
 
 <% 
 int id;
 String descricao;
 String titulo;
 String texto;
 
 String url = "jdbc:mysql://localhost:3306/portal_realnews?useTimezone=true&serverTimezone=America/Sao_Paulo&user=root&password=Baguncinha";
 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
 Connection conn = DriverManager.getConnection(url, "portal_realnews", "portal_realnews");
 Statement stmt = conn.createStatement();
 ResultSet rs = stmt.executeQuery("select * from noticia");
   while(rs.next()){
	  id = rs.getInt("id");
	  descricao = rs.getString("descricao");
	  titulo = rs.getString("titulo");
	  texto = rs.getString("texto");
	   
	   
   }
 

   
   if(request.getParameter("Cadastrar").equals("submit")){
		String Descricao = request.getParameter("descricao");
		String Titulo = request.getParameter("titulo");
		String Texto = request.getParameter("texto");
		
		 url = "jdbc:mysql://localhost:3306/portal_realnews?useTimezone=true&serverTimezone=America/Sao_Paulo&user=root&password=Baguncinha";
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		 Connection conn = DriverManager.getConnection(url, "portal_realnews", "portal_realnews");	   
	     String sql = "insert into noticia(descricao, titulo, texto) values(?, ?, ?)";
	     PreparedStatement stm = conn.prepareStatement(sql);
	   stm.setString(1, descricao);
	   stm.setString(2, titulo);
	   stm.setString(3, texto);
	   stm.executeUpdate();
	   stm.close();
	   conn.close();
   }
   
   if(request.getParameter("Excluir").equals("submit")){
	
	   
	   
	int Id= Integer.parseInt(request.getParameter("id"));
	  url = "jdbc:mysql://localhost:3306/portal_realnews?useTimezone=true&serverTimezone=America/Sao_Paulo&user=root&password=Baguncinha";
	 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	 Connection conn2 = DriverManager.getConnection(url, "portal_realnews", "portal_realnews");
	   
	String sql = "delete from noticia where id=?";
	PreparedStatement stm = conn.prepareStatement(sql);
	stm.setInt(1, id);
	stm.execute();
	stm.close();
	conn.close();
	      
	   
   }
   
   
   if(request.getParameter("Alterar").equals("submit")){
		int Id= Integer.parseInt(request.getParameter("id"));
		String Descricao = request.getParameter("descricao");
		String Titulo = request.getParameter("titulo");
		String Texto = request.getParameter("texto");
	   
   		  url = "jdbc:mysql://localhost:3306/portal_realnews?useTimezone=true&serverTimezone=America/Sao_Paulo&user=root&password=Baguncinha";
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		 Connection conn2 = DriverManager.getConnection(url, "portal_realnews", "portal_realnews");
   
   String sql = "update noticia set descricao = ?, titulo = ?, texto = ? where id=?";
   
	PreparedStatement stm = conn.prepareStatement(sql);
	stm.setString(1, descricao);
	stm.setString(2, titulo);
	stm.setString(3, texto);
	stm.executeUpdate();
	stm.close();
	conn.close();
	      
   
   
   
   
   
   
   }
	
   
   
   
   
   
 %>






</body>
</html>