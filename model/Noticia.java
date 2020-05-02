package model;

import java.io.Serializable;

public class Noticia implements Serializable{
   private static final long serialVersionUID = 1L;

	private int id;
	private String descricao;
	private String titulo;
	private String texto;

	public Noticia() {
	}

	 public Noticia(String descricao, String titulo, String texto, int id) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
			return id;
		  }
		  
		  public void setId(int id) {
			this.id = id;
		  }
		
		
		public String getDescricao() {
			return descricao;
		}
		
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		
		
		public String getTitulo() {
			return titulo;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		

		public String getTexto() {
			return texto;
		}
		
		public void setTexto(String texto) {
			this.texto = texto;
		}
	@Override
	public String toString() {
		return "Noticia [id=" + id + ", descricao=" + descricao + ", titulo=" + titulo
				+ ", texto=" + texto + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (id != other.id)
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
}
