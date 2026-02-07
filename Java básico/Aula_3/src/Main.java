package src;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //declarando a variavel que irá ler o input do usuario
		//Obs: Se trata de uma classe externa necesssario a importação e a instância com new.
	
		String x;
		int y;
		double z;
		char w;
		
		System.out.println("Digite seu nome:");
		x = sc.next(); // Atribuindo x como input/scanner (Para texto next())
		System.out.printf("Olá %s!%n", x);
		
		System.out.println("Digite sua idade:");
		y = sc.nextInt(); // Atribuindo y como input/scanner (Para int nextInt())
		System.out.printf("Uau %d anos!!%n", y);
		
		System.out.println("Digite um numero com casa decimal:");
		z = sc.nextDouble(); // Atribuindo z como input/scanner (Para double nextDouble())
		System.out.printf("Uau %.2f!!%n", z);
		
		System.out.println("Digite um nome:");
		w = sc.next().charAt(0); // Atribuindo w como input/scanner (Para char sc.next().charAt(0))
		System.out.printf("%s é a primeira letra do nome!%n", w);
		
		
		//Ler os dados em uma única linha delimitadas por espaço
		
		String nome;
		int idade;
		double altura;
		
		nome = sc.next();
		idade = sc.nextInt();
		altura = sc.nextDouble();
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		
		
		
		//Scanner com quebra de linha, não é delimitada por espaços.
		
		String s1, s2, s3; //Obs: se houver um scanner anterior ao Nexline() e ocorre alguma quebra de linha ela fica pendente
						   // e se não fizer o comando correto o nexline consome aquela quebra de linha
		
		sc.nextLine(); // Nexline() extra para não ocorrer o consumo do proximo comanda de nextLine(), obs acima.
		s1 = sc.nextLine();
		s2 = sc.nextLine();	
		s3 = sc.nextLine();
		
		
		System.out.printf("Resultados %s, %s, %s", s1, s2, s3);
		
		sc.close(); //Necessario para fechar o comando Scanner.
	}

}
