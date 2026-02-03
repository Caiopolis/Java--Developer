import java.util.Scanner;

public class ExercicioRepeticao_1 {

	public static void main(String[] args) {
		
		//Exercicio 1: Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
	
	
		int senha = 2002;
		int tentativa;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha:");
		
		tentativa = sc.nextInt();
		
		while(tentativa != senha) {
			
			System.out.println("Senha incorreta, por favor, tente novamente:");
			tentativa = sc.nextInt();
		}
		
		System.out.println("Seja Bem-vindo(a)!!");
		
	}
	
	

}
