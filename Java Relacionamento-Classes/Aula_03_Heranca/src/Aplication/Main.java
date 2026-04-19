package Aplication;

import Entities.Conta;
import Entities.ContaEmpresarial;
import Entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		// Upcasting e downcasting

		
		Conta ct = new Conta(1009, "Miguel", 0.0); //ctrl + Espaço auto-completa a função com os parâmetros
		ContaEmpresarial cte = new ContaEmpresarial(1005, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Conta acc1 = cte;
		Conta acc2 = new ContaEmpresarial(1002, "Clovis", 1000.0, 2000.0); //Upcasting é a possibilidade de vc guardar um objeto filho no tipo da variavel da classe Pai
		Conta acc3 = new ContaPoupanca(1001, "Claudio", 3000.0, 1.5);
		
		// DOWNCASTING
		
		ContaEmpresarial acc4 = (ContaEmpresarial) acc2;  // downcasting é a possibilidade guardar um objeto da classe Pai dentro de uma variavel do tipo filha, mas é necessario especificar o tipo para a verificação do mesmo, utilizando o Casting manual
		acc4.emprestimo(1000);							// Obs: O tipo da variavel vai definir quais métodos eu posso utilizar, se eu tenho um variavel do tipo conta e instancio ContaEmpresarial eu não consigo utilizar os métodos de ContaEmpresarial.
		
		// INSTANCEOF
		
		if(acc3 instanceof ContaEmpresarial) {  //Instanceof faz a validação da instancia de uma variavel, acc3 é do tipo Conta e sua instancia é ContaPoupanca, não ContaEmpresarial, por isso esse if retorna false.
			ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
			acc5.emprestimo(1000);
			System.out.println("Emprestimo realizado");
		}else {
			System.out.println("False");
		}
		
		if(acc3 instanceof ContaPoupanca) {  // Já neste if, acc3 continua sendo tipo conta mas a comparação do instanceof é com a classe ContaPoupanca, que é de fato a instancia de acc3, por isso retorna true
		
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.calculoJuros();
			System.out.println("Juros calculados, valor atual de: " + acc5.getSaldo());
		
		}else {
			System.out.println("False");
		}
	}

}
