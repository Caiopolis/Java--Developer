import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Estrutura repetitiva
			
		  //While
		
				
				double x;
				double y = 0;
				Scanner sc = new Scanner(System.in);
		
				
				System.out.println("Digite um numero");
				x = sc.nextDouble();
				
				while(x != 0) {
					
					y += x;
					System.out.println("Digite outro numero");
					x = sc.nextDouble();
					
				}
				
				System.out.println("A soma dos valores digitados foi: " + y);
				
				sc.close();
				
	}

}
