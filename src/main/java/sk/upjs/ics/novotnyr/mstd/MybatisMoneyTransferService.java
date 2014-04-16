package sk.upjs.ics.novotnyr.mstd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sk.upjs.ics.novotnyr.mstd.mybatis.mappers.MoneyTransferDao;

@Service
public class MybatisMoneyTransferService implements MoneyTransferService {
	@Autowired
	private MoneyTransferDao moneyTransferDao;
	
	public void transferMoney(String issuer, String beneficiary, int amount) {
		int issuerAmount = moneyTransferDao.getAmount(issuer);
		if(issuerAmount - amount < 0) {
			throw InsufficientMoneyException.forIssuer(issuer);
		}
		moneyTransferDao.addMoney(beneficiary, amount);
		moneyTransferDao.removeMoney(issuer, amount);
	}
}
