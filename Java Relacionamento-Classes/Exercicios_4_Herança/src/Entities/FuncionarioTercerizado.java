package Entities;

public class FuncionarioTercerizado extends Funcionario{

	private Double valorAdicional;

		
	public FuncionarioTercerizado() {
		
	}
	
	public FuncionarioTercerizado(String nome, Integer horasTrabalhadas, Double valorPorHora, Double valorAdicional) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double valorPagamento() {
		
		return this.getValorPorHora() * this.getHorasTrabalhadas() + this.valorAdicional;
		
	}
			
	
	
}
