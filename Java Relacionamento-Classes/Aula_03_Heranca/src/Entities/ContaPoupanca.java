package Entities;

public class ContaPoupanca extends Conta {

	private Double juros;

	
	
	public ContaPoupanca() {
		super();
	}
	
	
	public ContaPoupanca(Integer numeroConta, String momeTitular, Double saldo, Double juros) {
		super(numeroConta, momeTitular, saldo);
		this.juros = juros;
	}


	public Double getJuros() {
		return juros;
	}


	public void setJuros(Double juros) {
		this.juros = juros;
	}
	
	public void calculoJuros() {
		
		saldo += (saldo*(this.juros/100));
		
	}
	
}
