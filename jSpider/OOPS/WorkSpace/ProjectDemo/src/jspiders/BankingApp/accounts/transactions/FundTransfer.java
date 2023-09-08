package transactions;

import accounts.Account;

public class FundTransfer {
	
	public boolean transfer(Account fromAccount , Account toAccount , double fundAmt) {
		 
		 if(fromAccount.getAccBalance()>fundAmt) {
			 
			 fromAccount.setAccBalance(fromAccount.getAccBalance()-fundAmt);
			 toAccount.setAccBalance(toAccount.getAccBalance()+fundAmt);
			 return true;
		 }
		 else {
			 return false;
		 }
		 
		
	}

}
