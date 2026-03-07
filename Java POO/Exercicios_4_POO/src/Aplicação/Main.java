package Aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.Funcionarios;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionarios deseja registrar? ");
		int quantidade  = sc.nextInt();
		List<Funcionarios> list = new ArrayList<>();
		
		for(int i = 1;i<=quantidade;i++) {
			
			System.out.printf("Funcionario %d#%n", i);
			System.out.println("Digite o id: ");
			int id = sc.nextInt();
			
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			
			System.out.println("Digite o Salario: ");
			double salario = sc.nextDouble();
			System.out.println(" ");
			System.out.println("----------------------");
			System.out.println(" ");
			list.add(new Funcionarios(id,nome,salario));
			
		}
		
		
		System.out.println("Insira o id do funcionario que deseja dar aumento: ");
		int idFuncionario = sc.nextInt();
		
		Funcionarios funcionarioFiltradoiId = list.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		
		if(funcionarioFiltradoiId == null) {
			System.out.println("Esse funcionario não existe");
		}else {
			
			System.out.println("Qual a porcentagem que deseja aumentar o salario: ");
			double porcentagem = sc.nextDouble();
			funcionarioFiltradoiId.aumentoSalarial(porcentagem);
		}
		
		System.out.println(" ");
		for(Funcionarios x: list) {
			System.out.println(x);
		}
	
		
	}

}
