package Entities;

public final class ContaPoupanca extends Conta {  //Quando declaranos que uma classe é final significa que ela não pode ter subclasses, ou seja, não pode ser Herdada
												  //Obs: O final nas classes é utilizado dependendo das regras de negócio do seu sistema e eel também ajuda na performance do sistema, por conta da analise reduzida.

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
	
	
	
	@Override  
	public void saque(double quantSaque) {
		
		this.saldo -= quantSaque;
		
	}
	
	
}
