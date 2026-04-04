package entities;

import entities.Comentario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Postagem {
	private static DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime momento;
	private String titulo;
	private Integer likes;
	private String descricao;
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Postagem() {
	
	}

	public Postagem(LocalDateTime momento, String titulo, Integer likes, String descricao) {

		this.momento = momento;
		this.titulo = titulo;
		this.likes = likes;
		this.descricao = descricao;
		
	}

	public LocalDateTime getMomento() {
		return momento;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getLikes() {
		return likes;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void addComentario(Comentario comentario) {
		
		comentarios.add(comentario);
		
	}
	
public void removeComentario(Comentario comentario) {
		
		comentarios.remove(comentario);
		
	}

@Override
public String toString() {

	StringBuilder sb = new StringBuilder(); //StringBuilder, utilizado para facilitar a construção do toString()
	sb.append(titulo + "\n");
	sb.append(likes + " Likes - " + momento.format(fm1) + "\n");
	sb.append("Comentarios: \n");
	for(Comentario x : this.comentarios) {		
		sb.append(x.getComentario() + "\n");	
	
	}
	
	return sb.toString();

	
}



}

