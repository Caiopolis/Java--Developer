package Aplication;

import java.util.ArrayList;
import java.util.List;

import Entities.Conta;
import Entities.ContaEmpresarial;
import Entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		//Classes abstratas não podem ser instanciadas, criando essa regra de manuseio da classe, possibilitando o controle de acesso, neste caso, a super-classe.

		 //Conta acc1 = new Conta(1234, "Caio", 1000.00);  Aqui estamos tentando instaciar conta, mas é abstrata, por isso não é possivel realziar a instancia
		
		Conta acc2 = new ContaPoupanca(1223, "Claudio", 2000.00, 200.00);  //Já essas são filhas de Conta (Herança), e como não são abstratas conseguem realizar a instância normalmente
		Conta acc3 = new ContaEmpresarial(1111, "Amauri", 3000.00, 1000.00);
		Conta acc4 = new ContaEmpresarial(1243, "Fabio", 7000.00, 555.00);
		Conta acc5 = new ContaPoupanca(1245, "Andressa", 7000.00, 100.00); 
		
		List<Conta> listaContas = new ArrayList<>();
		
		listaContas.add(acc2);
		listaContas.add(acc3);
		listaContas.add(acc4);
		listaContas.add(acc5);
		
		double soma = 0;
		
		for(Conta x : listaContas) { //Como todas as contas mesmo sendo instancias das filhas, elas podem ser do tipo Pai, já que elas herdam a mesma, facilitando assim a manipulação de grandes massas de objetos
									 // Por exemplo nesse for que consegue acessar todos os objetos da lista (do tipo Conta) e fazer a soma de todas, mesmo sendo classes difernetes.
			soma += x.getSaldo();
		}
		System.out.println(soma);
		
		for(Conta y : listaContas) { //O mesmo aqui, só mudando o método para depositar em todas as contas da lista.
			
			y.deposito(10);
			System.out.printf("Um depósito de 10 reais foi feito na conta %d, total de saldo: %.2f%n", y.getNumeroConta(), y.getSaldo());
			
		}
	
	}
}
