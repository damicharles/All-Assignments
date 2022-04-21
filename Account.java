public class Account {
public static void main(String[] args) {
	private String name; 
	private double balance; 

	
	public Account(String name, double balance) {
		this.name = name; 

		
		if (balance > 0.0) { 
			this.balance = balance; 
		}
	}

	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) { 
			balance = balance + depositAmount; 
		}
	}

	public void whithdraw(double withdrawal) {
		if (withdrawal > balance) {
			System.out.println("Withdrawal amount exceeded account balance.");
			return;
		}

		balance = balance - withdrawal;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
}

}