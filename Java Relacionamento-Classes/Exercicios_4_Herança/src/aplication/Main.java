package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Funcionario;
import Entities.FuncionarioTercerizado;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de funcionnarios que deseja cadastrar");
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
		int quantFuncionarios = sc.nextInt();
		
		for(int i = 0;i < quantFuncionarios ;i++) {
			
			System.out.println("Funcionario Tercerizado?");
			String respost = sc.next().toLowerCase();
			
			if(respost.equals("s")) {
				
				System.out.println("Nome:");
				String nome = sc.next();
				System.out.println("Horas Trabalhadas:");
				int horasTrabalhadas = sc.nextInt();
				System.out.println("Valor por hora:");
				double valorPorHora = sc.nextDouble();
				System.out.println("Valor adicional:");
				double valorAdcional = sc.nextDouble();
				
				Funcionario funcionarioTercerizado = new FuncionarioTercerizado(nome, horasTrabalhadas, valorPorHora, valorAdcional);
				
				listaFuncionario.add(funcionarioTercerizado);
				
			}else {
				
				System.out.println("Nome:");
				String nome = sc.next();
				System.out.println("Horas Trabalhadas:");
				int horasTrabalhadas = sc.nextInt();
				System.out.println("Valor por hora:");
				double valorPorHora = sc.nextDouble();
				
				Funcionario funcionario = new Funcionario(nome, horasTrabalhadas, valorPorHora);
				
				listaFuncionario.add(funcionario);			
				}
				
		}
		
		System.out.println("PAGAMENTOS:");
		
		for(Funcionario funcionario:listaFuncionario) {
			
			System.out.println(funcionario.getNome() + " - " + funcionario.valorPagamento());
			
		}		

	}

}
