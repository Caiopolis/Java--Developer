package Entidades;
import java.util.Random;

public class Banco {
	
	private final int taxaSaque = 5;
	private int  numeroDaConta;
	private String nomeTitular;
	private double saldo;
	private Random gerador = new Random();
	
	
	public Banco() {
		this.saldo = 0;
		this.numeroDaConta = gerador.nextInt(0, 10000);
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	
	public void saque(double saldo) {
		this.saldo -= saldo + this.taxaSaque;
		
	}
	
	public String toString() {
		
		return  "Numero da conta: " + this.numeroDaConta
				+ " "
				+ "Usuário: " + this.nomeTitular
				+ " "
				+ "Saldo: " + this.saldo;
	
	}
}

