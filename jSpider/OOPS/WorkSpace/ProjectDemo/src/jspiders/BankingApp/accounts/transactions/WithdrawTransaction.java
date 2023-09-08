package transactions;

import accounts.Account;

public class WithdrawTransaction {
	
	public boolean withdraw( Account a1 , double withAmt) {
		if(a1.getAccBalance()>withAmt) {
			a1.setAccBalance(a1.getAccBalance()-withAmt);
			System.out.println("Withdraw Success.......");
			return true;
		}
		else {
			System.out.println("Withdraw Failed due : insufficient A/c Balance");
			return false;
		}
		
	}
	

}
