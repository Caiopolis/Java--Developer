package Services;

import java.time.LocalDate;

import Entities.Contrato;
import Entities.Parcelas;


public class ContratoService {

	private PagamentoOnlineService pagamentoOnline;
	
	public ContratoService(PagamentoOnlineService pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}



	public void processamentoContrato(Contrato contrato, int meses) {
		
		double valorParcelaMensalSemJuros = contrato.getValorTotal()/meses;
		
		
		for(int i = 1; i <= meses; i++) {
			
			double valorTotalFatura;
			
			valorTotalFatura = valorParcelaMensalSemJuros + pagamentoOnline.jurosPagamento(valorParcelaMensalSemJuros, i);
			valorTotalFatura += pagamentoOnline.taxaPagamento(valorTotalFatura);
			
			LocalDate mesQueVem = contrato.getData().plusMonths(i);
			
			contrato.getListaParcelas().add(new Parcelas(mesQueVem, valorTotalFatura));
			
		}
		
	}
	
}
