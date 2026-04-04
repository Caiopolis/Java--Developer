package aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comentario;
import entities.Postagem;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime d01 = LocalDateTime.parse("2018-06-21T13:09:44");
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("That´s awesome!");
		
		Postagem p1 = new Postagem(d01,"Traveling to New Zealand",12,"I´m going to visit this wanderful country!");
		
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
	}
	
}
