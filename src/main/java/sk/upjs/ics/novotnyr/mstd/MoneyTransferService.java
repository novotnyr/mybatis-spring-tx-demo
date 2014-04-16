package sk.upjs.ics.novotnyr.mstd;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface MoneyTransferService {
	public void transferMoney(String issuer, String beneficiary, int amount);
}
