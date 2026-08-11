package services;

public class BrazilJurosService implements JurosService {

	private double interestRate;

	public BrazilJurosService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
