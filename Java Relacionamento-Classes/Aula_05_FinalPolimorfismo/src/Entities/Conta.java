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
		
		this.saldo -= (quantSaque + 5.0);
		
	}
	
	public final void deposito(double quantDeposito) { // Quando declaramos que um método é Final esse método não poderá ser sobrescrito, ou seja o Override não seria possivel nas classes Filhas.
		
		this.saldo += quantDeposito;					//Obs: Não é recomendado ter varios métodos sobrescritos, por conta da segurança, podendo dar brechas as inconsistencias, por isso o final é recomendando
														
	}


	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}
	
	
}
