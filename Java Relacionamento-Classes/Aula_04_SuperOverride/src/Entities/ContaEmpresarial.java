package Entities;

public class ContaEmpresarial extends Conta {

	private Double limiteEmprestimo;
	
	
	public ContaEmpresarial() {
		super();
	}


	public ContaEmpresarial(Integer numeroConta, String momeTitular, Double saldo, Double limiteSaque) { 
		super(numeroConta, momeTitular, saldo);	//Aqui o super evidência os atributos que estão na classe Pai, para o contrutor saber quais são.				
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
	public void saque(double quantSaque) {

		super.saque(quantSaque); //O super serve para acessarmos funções e atributos especificos da classe Pai, sem nenhuma alteração.
		this.saldo -= 2;  //Neste exemplo fiz um saque utilizando as regras da função saque da classe Pai e com base nessa função modifiquei o retorno para se encaixar (com base no requisito que todo saque da contaEmpresarial tem um juros de 2 reais) na classe filha

	}


	@Override
	public String toString() {
		return " Nome: " + this.getnomeTitular() + " Saldo: " + this.saldo + " Numero da conta: " + this.getNumeroConta()+ " Limite da conta: "  +this.limiteEmprestimo ;
	}



	
	
}
