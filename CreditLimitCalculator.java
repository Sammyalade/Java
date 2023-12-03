public class CreditLimitCalculator{
		private int accountNumber;
		private int beginningBalance;
		private int itemCharged;
		private int creditForTheMonth;
		private int creditLimit;	

		public CreditLimitCalculator(int creditLimit){
		this.creditLimit = creditLimit;
		}
		
		public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
		}

		public void setBeginningBalance(int beginningBalance){
		this.beginningBalance = beginningBalance;
		}

		public void setItemCharged(int itemCharged){
		this.itemCharged = itemCharged;
		}

		public void setCreditForTheMonth(int creditForTheMonth){
		this.creditForTheMonth = creditForTheMonth;
		}

		
		

		public int getAccountNumber(){
		return accountNumber;
		}

		public int getBeginningBalance(){
		return beginningBalance;
		}

		public int getItemCharged(){
		return itemCharged;
		}

		public int getCreditForTheMonth(){
		return creditForTheMonth;
		}

		public int getCreditLimit(){
		return creditLimit;
		}
		
	
	

}