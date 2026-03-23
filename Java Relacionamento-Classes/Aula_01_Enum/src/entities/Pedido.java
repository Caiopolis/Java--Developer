package entities;
import java.util.Date;

import entities.Enum.Status;

public class Pedido {

	private Integer id;
	private Date momentoPedido;
	private Status status;    //Implementando atributo do tipo Status, no caso é um Enum.
	
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momentoPedido=" + momentoPedido + ", status=" + status + "]";
	}

	public Pedido() {
		
		
	}

	public Pedido(Integer id, Date momentoPedido, Status status) { //Construtor para instancia
		
		this.id = id;
		this.momentoPedido = momentoPedido;
		this.status = status;
		
	}



	public Integer getId() {
		return id;
	}

	public Date getMomentoPedidp() {
		return momentoPedido;
	}

	public void setMomentoPedidp(Date momentoPedidp) {
		this.momentoPedido = momentoPedidp;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}
