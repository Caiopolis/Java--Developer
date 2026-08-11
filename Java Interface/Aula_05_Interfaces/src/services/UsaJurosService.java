package services;

public class UsaJurosService implements JurosService {

	private double interestRate;

	public UsaJurosService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
