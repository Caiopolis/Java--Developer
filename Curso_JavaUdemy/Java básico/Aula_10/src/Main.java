import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Função
		//Deve ser codificada fora da função main, descrevendo seu encapsulamento (public, private e protect), comportamento (static) e tipo (void, int etc)
		
		Scanner sc = new Scanner (System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = lerMaior(a,b,c);
		mostrarMaior(maior);
	}
	
	public static int lerMaior(int num1, int num2, int num3) {
		int aux;
		
		if (num1 > num2 && num1 > num3) {
			aux = num1;
		}else if(num2 > num1 && num2 > num3){
			aux = num2;
		}else {
			aux = num3;
		}
		return aux;
	}
	
	public static void mostrarMaior(int valor) {
		System.out.println("o Maior numero é "+ valor);
	}
}
