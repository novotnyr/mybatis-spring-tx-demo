package sk.upjs.ics.novotnyr.mstd;


public interface MoneyTransferService {
	public void transferMoney(String issuer, String beneficiary, int amount);
}
