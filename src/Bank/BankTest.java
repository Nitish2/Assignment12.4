package Bank;

public class BankTest { // Creating Bank Test class to checks the exception 
	public void test(double balance) throws BankATMException{ // Throw Statement 
		if(balance<10000.00){
			throw new BankATMException(); // Throw exception 
			
		}
		else{
			System.err.println("Not sufficient balance"); // Prints error if exception occurs 
		}
	}
}
