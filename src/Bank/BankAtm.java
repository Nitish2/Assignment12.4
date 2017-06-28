package Bank;

public class BankAtm {
	
	double balance = 50000; //initialize balance variable

	public void withdraw(double amt) { //Creating withdraw method 
		double newbalance; //initialize new balance variable for withdraw method
		newbalance = balance - amt; // 
		if (balance - amt < 10000) { //if statement to check the withdraw condition
			try {
				throw new BankATMException();
			} catch (BankATMException e) { //Catch Block
				
				System.out.println("You can not make this transaction your balance is below 10000");
			}
		} else {  //Else Statement 
			System.out.println("Transaction is succesful. Available balance is " + newbalance);
		}
	}

	public void deposit(double amt) { // Creating Deposit method 
		double newBalance = balance + amt; //initialize new balance variable for deposit method
		System.out.println("Available balance is " + newBalance);
	}

	public static void main(String[] args) { // Main Method 
		BankAtm a = new BankAtm(); // Creating class object 1
		a.deposit(1000.00);
		a.withdraw(100000.00);
		BankAtm b = new BankAtm(); // Creating class object 2
		b.deposit(20000.00);
		b.withdraw(10000.00);
		BankAtm c = new BankAtm(); //Creating class object 3
		c.deposit(678958);
		c.withdraw(9899999);

	

	}

}
