import java.util.Scanner;

import Entidade.Calculator;

public class Main {

	public static void main(String[] args) {
		
		//Membros estáticos
		//OBS: Final = Constante (comumente a variavel constante é escrita em CAPSLOCK e fora da classe Main)
		//OBS: Não é possivel utilizar um método não estatico dentro de um método estatico e vice-versa.
		//OBS: Se criar uma classe que não tenha métodos estaticos e tentar utiliza-lá na Main (que é um método estatico)
		//Só será possível se houver uma instância.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
	}

}
