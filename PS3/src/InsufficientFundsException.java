@SuppressWarnings("serial")

public class InsufficientFundsException extends Exception {
	private double FundsReq;
	
	public double getFundsReq() {
		return FundsReq;
	}
	
	public InsufficientFundsException(double Funds) {
		this.FundsReq = Funds;
	}
}
