package sk.upjs.ics.novotnyr.mstd;

public class Transfer {
	private String beneficiary;
	
	private int amount;
	
	public Transfer() {
		// empty constructor, required for Jackson
	}
	
	public Transfer(String beneficiary, int amount) {
		this.beneficiary = beneficiary;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
	
	public String getBeneficiary() {
		return beneficiary;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	@Override
	public String toString() {
		return "Transfer [beneficiary=" + beneficiary + ", amount=" + amount
				+ "]";
	}
}
