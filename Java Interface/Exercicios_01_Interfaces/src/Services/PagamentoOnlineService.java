package Services;

public interface PagamentoOnlineService {

	double taxaPagamento(double montante);
	double jurosPagamento(double montante, int meses);
	
}
