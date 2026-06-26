package Model.Entities;

import Model.Exceptions.ContaExceptions;

public class ContaBancaria {

	private Integer numConta;
	private String nomeConta;
	private Double saldo;
	private Double limiteSaque;
	
	
	public ContaBancaria(Integer numConta, String nomeConta, Double saldo, Double limiteSaque) {
		
		this.numConta = numConta;
		this.nomeConta = nomeConta;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
		
	}


	public Integer getNumConta() {
		return numConta;
	}


	public String getNomeConta() {
		return nomeConta;
	}


	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}


	public Double getSaldo() {
		return saldo;
	}


	public Double getLimiteSaque() {
		return limiteSaque;
	}


	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	
	public void deposito(double deposito) {
		
		this.saldo += deposito;
		
	}
	
	public void saque(Double saque) {
		
		if(saque > this.limiteSaque) {
			
			throw new ContaExceptions("Erro ao executar saque: Valor do saque é maior que o limite permitido.");
			
		}else if (this.saldo == 0) {
			
			throw new ContaExceptions("Erro ao executar saque: A conta se encontra sem saldo.");
			
		}else {
			
			this.saldo -= saque;
			
		}
		
	}
	
	
}
