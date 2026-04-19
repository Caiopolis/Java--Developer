package Entities;

public class Conta {

	private Integer numeroConta;
	private String nomeTitular;
	protected Double saldo;
	
	
	
	public Conta() {
		
	}
	
	
	public Conta(Integer numeroConta, String momeTitular, Double saldo) {

		this.numeroConta = numeroConta;
		this.nomeTitular = momeTitular;
		this.saldo = saldo;
	}
	
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getnomeTitular() {
		return nomeTitular;
	}
	
	public void setMomeTitular(String momeTitular) {
		this.nomeTitular = momeTitular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(double quantSaque) {
		
		this.saldo -= quantSaque;
		
	}
	
	public void deposito(double quantDeposito) {
		
		this.saldo += quantDeposito;
		
	}


	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}
	
	
}
