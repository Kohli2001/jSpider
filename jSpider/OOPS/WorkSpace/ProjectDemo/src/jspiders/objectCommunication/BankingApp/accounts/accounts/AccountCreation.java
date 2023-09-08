package accounts;

public class AccountCreation {
	
	public Account createAccount (String accHolder, long accNumber, String ifscCode, double accBalance , String branchName) {
		
		Account a1 = new Account(accHolder, accNumber, ifscCode,  accBalance ,  branchName);
			
			return a1;
		}
	
	}

