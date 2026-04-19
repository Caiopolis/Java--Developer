package Aplication;

import Entities.Conta;
import Entities.ContaEmpresarial;
import Entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		// Final e Polimorfismo

		
		//FINAL (Packet Entities)
		
		//POLIMORFISMO
		
		Conta x = new Conta(4345, "Victor", 2000.0); 
		Conta y = new ContaPoupanca(4345, "Victor", 2000.0,1.5); //"Polimorfismo é a possibilidade de criar variáveis do mesmo tipo, porém sendo objetos diferentes, que terão comportamentos distintos. 
		                                                        //Neste exemplo, existe a classe pai (Conta) e criei uma variável do tipo Conta que receberá uma instância de ContaPoupanca, a classe filha. 
		                                                        //Nessa classe filha vai ter tudo o que tem na classe pai e mais um pouco (referente às suas especificações). E, se você quiser utilizar um método da classe pai, mas com alguma mudança, você utiliza o Override. 
		                                                        //Por isso o nome Polimorfismo: várias maneiras de efetuar uma mesma ação.
		x.saque(50);
		y.saque(50);
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo()); //Mesmo método, mas resultados diferentes.
		
		
	}
}
