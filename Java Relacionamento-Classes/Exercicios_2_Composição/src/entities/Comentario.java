package entities;

public class Comentario {

	private String texto;

	
	
	public Comentario() {
		super();
	}


	public Comentario(String comentario) {
		super();
		this.texto = comentario;
	}
	
	
	public String getComentario() {
		return texto;
	}

	public void setComentario(String comentario) {
		this.texto = comentario;
	}


	@Override
	public String toString() {
		return "Comentarios: " 
				+ texto 
				+ " ";
	}

}
