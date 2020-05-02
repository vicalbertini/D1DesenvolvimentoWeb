package model;

import java.io.Serializable;

public class Comentario implements Serializable{
   private static final long serialVersionUID = 1L;

	private int id;
	private String nome;
	private String texto;
	private int fk_noticia_id;

	public Comentario() {
	}

		public static long getSerialversionuid() {
		return serialVersionUID;
		}
	
	 	public int getId() {
			return id;
		}
		  
		  public void setId(int id) {
			this.id = id;
		}
		
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
				
		public String getTexto() {
			return texto;
		}
		
		public void setTexto(String texto) {
			this.texto = texto;
		}
		

		public int getFk_noticia_id() {
			return fk_noticia_id;
		}
		  
		public void setFk_noticia_id(int fk_noticia_id) {
			this.fk_noticia_id = fk_noticia_id;
		}
	@Override
	public String toString() {
		return "Comentario [id=" + id + ", nome=" + nome + ", texto=" + texto
				+ ", fk_noticia_id=" + fk_noticia_id + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (fk_noticia_id != other.fk_noticia_id)
			return false;	
		return true;
	}
}
