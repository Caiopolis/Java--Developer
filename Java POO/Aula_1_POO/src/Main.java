
import java.util.Scanner;

import Entidades.Triangulo; //Criamos uma classe triangulo onde há os atributos a,b,c.

//OBS: ctrl + shift + O efetua os imports necessarios automaticamente.

public class Main {

	public static void main(String[] args) {
	
		//Introdução ao POO, inserindo classes, atributos e métodos.
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y; //Referenciando que x e y fazem parte da classe triangulo na memória
		
		x = new Triangulo(); //Atribuindo as caracteristicas de triangulo com instância
		y = new Triangulo();
		
		//Abaixo lógica de calculo
		
		System.out.println("Enter the measures of triangle X: ");
		x.c = sc.nextDouble();
		x.b= sc.nextDouble(); //inserindo valor aos atributos da classe triangulo.
		x.a = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.c = sc.nextDouble();
		y.b = sc.nextDouble();
		y.a = sc.nextDouble();
		
		
		double areaX = x.calculoAreaTriangulo();
		double areaY = y.calculoAreaTriangulo();
		
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
		System.out.println("Larger area: X");
		}
		else {
		System.out.println("Larger area: Y");
		}
		sc.close();
	
		}

}
