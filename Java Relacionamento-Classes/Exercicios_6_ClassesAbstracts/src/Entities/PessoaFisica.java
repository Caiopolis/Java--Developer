package Entities;

public class PessoaFisica extends Contribuente {

	private double gastosComSaude;

	

	public PessoaFisica(String nome, Double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}


	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}


	@Override
	public double calculoImposto() {
		
		double imposto = 0;
		if(this.getRendaAnual() < 20000) {
			imposto = (this.getRendaAnual() * 0.15) - (this.gastosComSaude * 0.5);
			return imposto;
		}else {
			imposto = this.getRendaAnual() * 0.25 - (this.gastosComSaude * 0.5);
			return imposto;
		}
		
	}
	
	
}
