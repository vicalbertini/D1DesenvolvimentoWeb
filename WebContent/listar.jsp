<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
<%@page import="model.Noticia" %>

<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Lista de Noticias</title>
	<link rel="stylesheet" href="Plugin/bootstrap.min.css" >
	<link rel="stylesheet" href="Plugin/estilo.css" >
	
</head>

<body>

	<form  method="post" action="ListarNoticia.do" >	
	
	
	<div align="center"><img src="logo.png" alt="indisponível" width=400 height=400></div>
	
	<h1 align = "center">Portal RealNews</h1>
	
	<hr/>

    <h3 align="center">Lista de  Noticias:</h3>
    
    
<div align="center">
	<form action="" method="post">
	<font face="Helvetica Neue" size="5" color="#0057AE"><b>Deixe seu comentário:</b></font>
	
	<hr/>
	
	<font face="tahoma" size="3">Nome:</font><input type="text" name="nome" placehoder="Victor">
	
	<hr/>
	
	<label for="texto">Comentário:</label>
	<textarea name="comentarios" id="comentarios" placeholder="Comente aqui" value="comentário"></textarea>
	
	<hr/>

	<input action="" type="submit" value="Comentar">
	</form>
</div>

	<br>

	<div align="center"><a href="index.html">Voltar ao menu</a></div>


</body>
</html>