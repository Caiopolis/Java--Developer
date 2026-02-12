package Mains;

	import java.util.Scanner;
	import Classes.Retangulo;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Programa que irá ler a altura e a largura de um retângulo e retornar sua área, perimetro e diagonal...
	
		Scanner sc = new Scanner(System.in);
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Coloque a altura e a largura do retãngulo:");
		x.altura = sc.nextDouble();
		x.largura = sc.nextDouble();
		
		x.area();
		x.diagonal();
		x.perimetro();
		
		System.out.println(x);
		

	}

}
