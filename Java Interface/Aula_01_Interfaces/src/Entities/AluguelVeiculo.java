package Entities;

import java.time.LocalDateTime;

public class AluguelVeiculo {

	private LocalDateTime comeco;
	private LocalDateTime fim;
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelVeiculo() {
		
	}

	public AluguelVeiculo(LocalDateTime comeco, LocalDateTime fim, Veiculo veiculo) {
		this.comeco = comeco;
		this.fim = fim;
		this.veiculo = veiculo;
	}
	

	public LocalDateTime getComeco() {
		return comeco;
	}

	public void setComeco(LocalDateTime comeco) {
		this.comeco = comeco;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
	
	
}
