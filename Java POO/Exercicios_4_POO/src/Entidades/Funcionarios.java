package Entidades;

public class Funcionarios {

	Integer id;
	String nome;
	Double salario;
	
	
	public Funcionarios(int id, String nome, double salario){
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		
	}
	
	
	public Integer getId() {
		return id;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		
		return this.id + ", " + this.nome + ", " + this.salario;
		
	}
	



	public void aumentoSalarial(double porcentagem) {
		
		this.salario += this.salario * (porcentagem/100);
		
	}


	
}
