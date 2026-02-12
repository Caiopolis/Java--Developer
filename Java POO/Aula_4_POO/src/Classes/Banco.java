package Classes;

	//Reutilizei o código do exercício 5 para teste do construtor

public class Banco {
	
	public String titular;
	public double saldo;
	public double valor;
	
	
	public Banco(double saldo, String titular) {  //Construtor (pode conter paramêtros ou não, depende do requerimento necessario)
		this.saldo = saldo;						//podendo também criar outros contrutores com o mesmo nome, porém, com a assinatura do método diferente (Sobrecarga)
		this.titular = titular;
	}
	
	

	public Banco(String titular) {  //Exemplo de sobrecarga (Mesmo nome porém com a assinatura diferente)
		this.titular = titular;
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Saldo atualizado!");
	
		
	}
	
	public void sacar(double valor) {
		
		if(saldo <= 0) {
			System.out.println("Saldo insufuciente!!");
			System.out.println("Seu saldo atual é de: !!" + this.saldo);
		}else {
			this.saldo -= valor;
			System.out.println("Saque realizado!!");
		}
		
		
	}
	
	public String toString() {
		
		return "Usuário: " + this.titular
				+ " "
				+ "Saldo: " + this.saldo;
	
	}
}
