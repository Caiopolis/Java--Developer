package Aplication;

import Entities.Conta;
import Entities.ContaEmpresarial;
import Entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		// Super e Override

		
		//OVERRIDE
		Conta acc1 = new Conta(2345, "Caião", 1000.0);
		acc1.saque(200);
		System.out.println(acc1.getSaldo());
		
		Conta acc2 = new ContaPoupanca(1234, "Fabio", 1000.0, 1.5);  //Override entrando em ação, mesmo a variavel sendo do Tipo conta ele retornou o método sobrescrito do objeto ContaPoupanca.
		acc2.saque(200);
		System.out.println(acc2.getSaldo());
		
		
		//SUPER	
		
		Conta acc3 = new ContaEmpresarial(2343, "CaioHenrique", 2000.0, 2300.0);
		acc3.saque(100);  // Esse método utilizou o Suoer.saque da classe pai (this.saldo -= (quantSaque + 5.0)) + As especificações do método próprio da contaEmpresarial(super.saque(quantSaque); this.saldo -= 2; )
		System.out.println(acc3.getSaldo());
	}
}
