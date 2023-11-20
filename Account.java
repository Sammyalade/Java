public class Account{
	private String name; 
	private double balance; 
	
	
	public Account(String accountName, double balance){
		this.name = accountName;


		if (balance > 0.0){
		this.balance = balance;	
		}

	}

	public void deposit(double depositAmount){
		if (depositAmount > 0.0){
		   balance = balance + depositAmount;
		}
	}

	public void withdraw(double withdrawAmount){
		if (balance > withdrawAmount){
		   balance = balance - withdrawAmount;
		}
		else
		if (withdrawAmount > balance){
		withdrawAmount = 0;
		   System.out.println("Withdrawal amount exceeded account balance.");
		}
	}

	public double getBalance() {
		return balance;
	}
	
	
	public void setName(String name){
	this.name = name;
	}

	public String getName(){
	return name;	
	}
	
	
	
}
	