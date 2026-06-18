package Entities;

import Entities.Enum.Cor;

public abstract class Forma {

	private Cor cor;
	
	public Forma(Cor cor) {
		this.cor = cor;
	}
	
	public Forma() {
		
	}



	public Cor getCor() {
		return cor;
	}



	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
	public abstract double calculoArea();
	
}
