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
	
	
	
	@Override  //Override serve para  sobrescrever um método que já existe na Classe Pai, neste exeplo a classe Pai desconta 5 reais no momento do saque, já na classe filha esse desconto não existe.
			   //A assinatura do método é igual somente seu retorno irá mudar, e a nomemclatura Override serve para o compilador saber que aquilo é o método sobrescrito, ou seja um método que já existe mais foi reescrito.
	public void saque(double quantSaque) {
		
		this.saldo -= quantSaque;
		
	}
	
	
}
