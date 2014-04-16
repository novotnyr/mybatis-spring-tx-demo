package sk.upjs.ics.novotnyr.mstd;

public class InsufficientMoneyException extends RuntimeException {
	public InsufficientMoneyException(String message) {
		super(message);
	}

	public static InsufficientMoneyException forIssuer(String issuer) {
		return new InsufficientMoneyException("Insufficient money for '" + issuer + "'");
	}
}
