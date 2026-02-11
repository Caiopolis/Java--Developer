package Classes;

public class Banco {
	
	public String titular;
	public double saldo;
	public double valor;
	
	
	public Banco() {
		this.saldo = 0;
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
