package Services;

public class PayPalService implements PagamentoOnlineService{

	
	
	public double jurosPagamento(double montante, int meses) {
		return montante * meses/100;
	}

	public double taxaPagamento(double montante) {
		
		return montante * 0.02;
	   
	}
	
	
}
