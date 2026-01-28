package Introdução;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hellooooou Word"); //Clássico "Hellou Word" cumprindo tabela ksks
		
		String nome = "Caio";
		int x = 33;
		double y = 7.4565; //Declarando variavel também cumprindo tabela ksks
		
		System.out.println(x);
		System.out.printf("%.2f%n", y); //printf serve para formatar o output.
		
		
		Locale.setDefault(Locale.US);  // Comando para mudar a formatação da ortografia
		System.out.printf("%.2f%n", y);
		
		System.out.println(x + " Carros, uau!!"); //Concatenando
		System.out.printf("Resultado = %.2f Média%n", y); //Concatenando com PrintF
		
		// Obs: %f é a variavel tipo boolean
		     // %d é a variavel tipo int
		     // %s é a variavel tipo String ou char[]
			 // %n quebra linha
		
		System.out.printf("Olá %s, é bom te ver! parabéns pelos %d anos, lembrando que sua média foi %.1f", nome,x,y);
		
	}
}
