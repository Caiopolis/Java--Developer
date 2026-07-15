package Service;

import java.time.Duration;
import Entities.AluguelVeiculo;
import Entities.Fatura;

public class FaturaService {

	private Double precoPorHora;
	private Double precoPorDia;
	private TaxService taxa;

	public FaturaService(double precoPorHora, double precoPorDia, TaxService taxa) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxa = taxa;
	}
	
	public void processoFatura(AluguelVeiculo aluguelVeiculo) {
		
		double minutos = Duration.between(aluguelVeiculo.getComeco(),aluguelVeiculo.getFim()).toMinutes();
		double horas = minutos/60;
	
		
		double montante = 0;
		if( horas <= 12.0) {
			
			 montante = Math.ceil(horas) * this.precoPorHora;
			
		}else {
			 montante = Math.ceil(horas/24) * this.precoPorDia;
		}
		
		
		aluguelVeiculo.setFatura(new Fatura(montante, taxa.taxa(montante)));
		
	}
}
