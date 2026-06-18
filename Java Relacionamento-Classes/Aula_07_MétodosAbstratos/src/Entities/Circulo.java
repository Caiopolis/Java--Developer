package Entities;

import Entities.Enum.Cor;

public class Circulo extends Forma {

	private Double raio;
	
	
	
   public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}


	public void setRaio(Double raio) {
		this.raio = raio;
	}


	//Como estamos Herdando forma o método calculoArea também é herdado, porém é abstrato e retorna erro, pois a classe Circulo não é.
	@Override		  // Para resolver isso é só sobrescrever o método com o Override, mudando assim o tipo do método, o tornando utilizavel sem mudar a classe para abstrata.
	public double calculoArea() {
		return Math.pow(this.raio,2) * 3.1415;
	};
	
	   @Override
		public String toString() {
	    	
	    	return "Area do Circulo = " + calculoArea();
	    }
	
}
