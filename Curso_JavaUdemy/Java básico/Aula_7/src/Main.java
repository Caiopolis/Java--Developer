import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Estrutura repetitiva
			
		  //While
		
				
				double x;
				double y = 0;
				Scanner sc = new Scanner(System.in);
		
				
				System.out.println("Digite um numero: ");
				x = sc.nextDouble();
				
				while(x != 0) {
					
					y += x;
					System.out.println("Digite outro numero: ");
					x = sc.nextDouble();
					
				}
				
				System.out.println("A soma dos valores digitados foi: " + y);
				
				
				
			//For 
				
				
				int quantNum, soma = 0;
				
				System.out.println("Digite a quantidade de numero que deseja somar:");
				quantNum = sc.nextInt();
				
				for(int i = 0; i != quantNum; i++) {
					
					int num;
					System.out.println("Digite os numero que deseja somar:");
					num = sc.nextInt();
					soma += num;
					
				}
				
				System.out.println("Soma: " + soma);
				sc.close();
				
	}

}
