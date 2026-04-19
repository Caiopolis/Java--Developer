package Entities;

public class ContaEmpresarial extends Conta {

	private Double limiteEmprestimo;
	
	
	public ContaEmpresarial() {
		super();
	}


	public ContaEmpresarial(Integer numeroConta, String momeTitular, Double saldo, Double limiteSaque) { //Como ContaEmpresarial herdou de conta é necessario que seu construtor tenha os atributos da classe Pai
																										// Caminho para a criação automatica: Source -> Gerenerate constructor using fields e trocar superclasse 
		super(numeroConta, momeTitular, saldo);	// Super(atributos da classe pai) Utilizado para referenciar/executar o contrutor da classe Pai													
		this.limiteEmprestimo = limiteSaque;
		
	}


	public Double getLimiteSaque() {
		return limiteEmprestimo;
	}


	public void setLimiteSaque(Double limiteSaque) {
		this.limiteEmprestimo = limiteSaque;
	}


	public void emprestimo(double quantEmprestimo) {
		
		if(quantEmprestimo <= limiteEmprestimo ) {
			saldo += quantEmprestimo - 10;
		}else {
			System.out.println("Valor de empréstimo acima do limite!!");
		}
	}


	@Override
	public String toString() {
		return " Nome: " + this.getnomeTitular() + " Saldo: " + this.saldo + " Numero da conta: " + this.getNumeroConta()+ " Limite da conta: "  +this.limiteEmprestimo ;
	}



	
	
}
