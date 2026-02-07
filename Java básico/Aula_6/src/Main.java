import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Clássicass Condicionais ksksks
		
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.println("Que horas são?");
		x = sc.nextDouble();
		
		
		if(x <= 12) {
			
			System.out.println("Bom dia");
		}else if(x < 18) {
			
			System.out.println("Boa tarde");
			
		}else {
			
			System.out.println("Boa noite");
			
		}
		
		
		//Atribuição comulativa
		
		int y, conta;
		
		conta = 50;
		y = sc.nextInt();
		
		if(y > 100) {
			
			conta += ( y - 100)* 2;	
		}
		System.out.printf("Valor franquia + execendente foi de R$ %d,00%n", conta);
		
		
		
		//Switch case
		
		int diaSemana;
		
		System.out.println("Digite o dia da semana (numero):");
		diaSemana = sc.nextInt();
		
		switch (diaSemana) {
		
		case 1:
			System.out.println("Bom domingo!");
			break;
		case 2:
			System.out.println("Boa segunda!");
			break;
		case 3:
			System.out.println("Boa terça!");
			break;
		case 4:
			System.out.println("Boa quarta!");
			break;			
		case 5:
			System.out.println("Boa quinta!");
			break;
		case 6:
			System.out.println("Boa sexta!");
			break;
		case 7:
			System.out.println("Bom sábado!");
			break;
		default:
			System.out.println("Valor invalido");
			break;
		}
		
		sc.close();
		
		
		//Condição ternária
		
		int z = 10;
		String verificarNumero = (z > 4) ? "True" : "False";
		
		System.out.println(verificarNumero);
		
		//OBS:
		//Debug verifica cada linha do código e mostra seu detalhamento/comportamento
		//BreakPoint = ponto em que a IDE vai depurar o código 
		
	}

}
