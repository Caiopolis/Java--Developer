package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	
	private int numeroContrato;
	private LocalDate data;
	private double valorTotal;
	
	private List<Parcelas> listaParcelas = new ArrayList<>();

	
	
	public Contrato() {
		
	}
	
	public Contrato(int numeroContrato, LocalDate data, double valorTotal) {
	
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.valorTotal = valorTotal;
	}
	
	

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getListaParcelas() {
		return listaParcelas;
	}

	public void setListaParcelas(List<Parcelas> listaParcelas) {
		this.listaParcelas = listaParcelas;
	}
	
	
	
}
