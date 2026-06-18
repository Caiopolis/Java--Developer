package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Contribuente;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Contribuente> listaContribuentes = new ArrayList<>();
		
		System.out.println("Quantos pagadores?");
		int quantFormas = sc.nextInt();
		
		for(int i = 0; i < quantFormas; i++) {
			
			System.out.printf("#%d Pagador%n", i+1);
			System.out.print("Pessoa juridica ou Pessoa Fisica (PJ/PF): ");
			String response = sc.next().toUpperCase();
			
			if(response.equals("PJ")) {
				
				System.out.println("Digite o nome do pagador:");
				String nome = sc.next();
				System.out.println("Digite o valor bruto anual:");
				double valorAnual = sc.nextDouble();
				System.out.println("Digite a quantidade de funcionarios:");
				int quantFuncionarios = sc.nextInt();
				
				Contribuente pessoaJuridica = new PessoaJuridica(nome, valorAnual, quantFuncionarios);
				
				listaContribuentes.add(pessoaJuridica);
			}else if(response.equals("PF")) {
				
				System.out.println("Digite o nome do pagador:");
				String nome = sc.next();
				System.out.println("Digite o valor bruto anual:");
				double valorAnual = sc.nextDouble();
				System.out.println("Digite o valor de gastos com saúde:");
				double gastosSaude = sc.nextDouble();
				
				Contribuente pessoaFisica = new PessoaFisica(nome,valorAnual,gastosSaude);
				listaContribuentes.add(pessoaFisica);
				
			}else {
				System.out.println("Tipo de contribuente não existe");
			}
			
			
			
			
		}
		
		System.out.println("Impostos dos Contribuentes");
		for(Contribuente x : listaContribuentes) {
			
			System.out.println(x.getNome() + " " + String.format("%.2f", x.calculoImposto()));
		}

	}

}
