package entities;

public class ConcretePrinter extends Device implements Scanner {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	@Override
	public String scan() {
		return "Scanned content";
	}

	public void print(String string) {
		// TODO Auto-generated method stub
		
	}
}