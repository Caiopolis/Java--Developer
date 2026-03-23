package Entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entities.Enum.LevelTrabalhador;

public class Trabalhador {
	
   private String name;
   private LevelTrabalhador level;
   private Double salarioBase;
   private List<ContratoHora> contratos = new ArrayList<>();
   private Departamento departamento;
   
   
  
   
   
   
   //Construtor
   
   public Trabalhador() {
	   
   }
   
   public Trabalhador(String name, LevelTrabalhador level, Double salarioBase, Departamento departamento) {

	this.name = name;
	this.level = level;
	this.salarioBase = salarioBase;
	this.departamento = departamento;
	
}

   //To String
   @Override
   public String toString() {
	   return "Trabalhador [name=" + name + ", level=" + level + ", salarioBase=" + salarioBase;
   }
   
   //Getters e Setters
   

 
   public String getName() {
		return name;
	   }
   
   public Departamento getDepartamento() {
	return departamento;
}

   public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
   }

   public void setName(String name) {
	this.name = name;
   }
   public LevelTrabalhador getLevel() {
	return level;
   }
   public void setLevel(LevelTrabalhador level) {
	this.level = level;
   }
   public Double getSalarioBase() {
	return salarioBase;
   }
   public void setSalarioBase(Double salarioBase) {
	this.salarioBase = salarioBase;
   }

   public List<ContratoHora> getContratos() {
	return contratos;
   }

   
   //Métodos da classe
   
   public void addContrato(ContratoHora contrato) {
	   contratos.add(contrato);
   }
   
   public void removeContrato(ContratoHora contrato) {
	   contratos.remove(contrato);
	   }
   
   public double montantePorMes(int ano, int mes) {
	   
	  double soma = this.salarioBase;
	  Calendar calendario = Calendar.getInstance();
	  
	  for(ContratoHora x : contratos) {
		  calendario.setTime(x.getData());
		  int anoX = calendario.get(Calendar.YEAR);
		  int mesX = 1 + calendario.get(Calendar.MONTH);
		  if(ano == anoX && mes == mesX) {
			  
			  soma += x.totalValor();
		  }
		  
		  
	  }
	  return soma;
	  
   }
   
   
}
