package Aplication;

import Entities.Conta;
import Entities.ContaEmpresarial;

public class Main {

	public static void main(String[] args) {
		
		ContaEmpresarial conta1 = new ContaEmpresarial(1234,"Caio",2000.00,2400.00);
		Conta contaPadrao = new Conta(2345,"Andressa",5000.00);
		
		
		System.out.println(conta1);
		conta1.emprestimo(1000);
		System.out.println(conta1);
		System.out.println(contaPadrao);
	}

}
