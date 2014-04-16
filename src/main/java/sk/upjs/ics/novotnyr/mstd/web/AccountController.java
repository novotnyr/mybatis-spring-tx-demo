package sk.upjs.ics.novotnyr.mstd.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sk.upjs.ics.novotnyr.mstd.MoneyTransferService;
import sk.upjs.ics.novotnyr.mstd.Transfer;
import sk.upjs.ics.novotnyr.mstd.mybatis.mappers.MoneyTransferDao;

@RestController
public class AccountController {
	@Autowired
	private MoneyTransferService transferService;

	@Autowired
	private MoneyTransferDao transferDao;

	@RequestMapping(value = "/accounts/{issuer}/transfers", method = RequestMethod.POST)
	public void transferMoney(@PathVariable String issuer, @RequestBody Transfer transfer) {
		transferService.transferMoney(issuer, transfer.getBeneficiary(), transfer.getAmount());
	}
	
	@RequestMapping(value = "/accounts/{issuer}")
	public String getStatus(@PathVariable String issuer) {
		return Integer.toString(transferDao.getAmount(issuer));
	}
}
