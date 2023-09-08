package transactions;

import accounts.Account;

public class DepositTransaction {
	
	public void deposit(Account a1 , double depAmt) {
	
		System.out.println("Deposite Successfully Done......");
		a1.setAccBalance(a1.getAccBalance()+depAmt);
		
	}

}
