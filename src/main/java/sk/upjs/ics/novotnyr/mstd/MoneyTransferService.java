package sk.upjs.ics.novotnyr.mstd;


public interface MoneyTransferService {
	void transferMoney(String issuer, String beneficiary, int amount);
}
