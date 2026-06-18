package Entities;

public class PessoaJuridica extends Contribuente{

	private Integer numFuncionarios;
	
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios ) {
		super(nome, rendaAnual);
		this.numFuncionarios =  numFuncionarios;
	}

	
	
	@Override
	public double calculoImposto() {
		
		if(this.numFuncionarios > 10) {
					
			return this.getRendaAnual() * 0.14;
			
		}else {

			return this.getRendaAnual() * 0.16;
		}
	}

}
