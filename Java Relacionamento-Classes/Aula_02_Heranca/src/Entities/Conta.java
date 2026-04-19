package Entities;

public class Conta {

	private Integer numeroConta;
	private String nomeTitular;
	protected Double saldo; //Protected encapsula a varaivel, sendo acessada só por classes no mesmo pacote ou subClasses em pacotes diferentes.
	
	
	
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
	
	
	
	//Obs: Herança tem uma relação de "É um" aqui contaEmpresarial é uma conta, pois herda da classe conta.
		 //As classes bases são chamadas de classes de gerenalização, são as classes mais abrangentes possiveis, já as subclasses são algo mais especifico dentro do contexto da classe pai.
		// Herança faz uma associação entre classes, não entre objetos, se eu instanciar contaEmpresarial só um objeto é criado, não dois que se relacionam.
}
