package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import Entities.Item;
import Entities.Enum.StatusPedido;

public class Ordem {
	
	private static DateTimeFormatter conversor = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime mometo;
	private StatusPedido status;
	private List<Item> itens = new ArrayList<>();
	private Cliente cliente;

	
	
	public Ordem() {

	}


	public Ordem(LocalDateTime mometo, StatusPedido status, Cliente cliente) {
	
		this.mometo = mometo;
		this.status = status;
		this.cliente = cliente;

	}

	public Cliente getClinte() {
		return cliente;
	}
	public LocalDateTime getMometo() {
		return mometo;
	}


	public void setMometo(LocalDateTime mometo) {
		this.mometo = mometo;
	}


	public StatusPedido getStatus() {
		return status;
	}


	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	
	public void addItem(Item item) {
		
		itens.add(item);
		
	}
	
	public void removeItem(Item item) {
		
		itens.remove(item);
		
	}
	
	public double total() {
		double soma = 0;
		for(Item x : itens) {
			 soma += x.getPreco() ;
		}
		return soma;
		
	}


	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: " + this.mometo.format(conversor) + "\n");
		sb.append("Status: " + this.status + "\n");
		sb.append("Cliente: " + this.cliente + "\n");
		sb.append("Itens: \n");
		for(Item x : itens) {
			sb.append(x.getProduto() + " Quantidade: " + x.getQuant() + " SubTotal: " + x.subTotal() + "\n");
		}
		sb.append("Total do pedido: " + this.total());
		
		return sb.toString();
		
	}
	
	
		
}
