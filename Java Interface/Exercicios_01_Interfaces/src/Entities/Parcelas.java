package Entities;

import java.time.LocalDate;

public class Parcelas {
	
	private LocalDate dataVencimento;
	private double montante;
	
	
	
	
	public Parcelas(LocalDate dataVencimento, double montante) {

		this.dataVencimento = dataVencimento;
		this.montante = montante;
	}
	
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public double getMontante() {
		return montante;
	}
	public void setMontante(double montante) {
		this.montante = montante;
	}
	
	
	public String toString() {
		
		return this.getDataVencimento() + " - " + this.getMontante();
		
	}
	
}
