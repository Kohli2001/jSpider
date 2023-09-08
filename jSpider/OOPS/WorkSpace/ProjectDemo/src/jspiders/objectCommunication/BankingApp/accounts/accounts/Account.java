package accounts;

public class Account {
	
 private String accHolder;
 private long accNumber;
 private String ifscCode;
 private double accBalance;
 private String branchName;
 
 	//Creating Constructor
 
 	public Account(String accHolder, long accNumber, String ifscCode, double accBalance , String branchName) {
 		
 		this.accHolder = accHolder;
 		this.accNumber = accNumber;
 		this.ifscCode = ifscCode;
 		this.accBalance = accBalance;
 		this.branchName=branchName;
 	}
 	
 	//getters and setters methods 
 	
 	public String getAccHolder() {
 		return accHolder;
 		
 	}

 	public void setAccHolder(String accHolder) {
 		this.accHolder = accHolder;
 		
 	}

 	public long getAccNumber() {
 		return accNumber;
 		
 	}

 	public void setAccNumber(long accNumber) {
 		this.accNumber = accNumber;
	
	}

	public String getIfscCode() {
		return ifscCode;
	
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
		
	}

	public double getAccBalance() {
		return accBalance;
		
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
		
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public void disp() {
		System.out.println("Branch Name: "+branchName);
		System.out.println("Account Holder Name: "+accHolder);
		System.out.println("Account Number: "+accNumber);
		System.out.println("IFSC Code: "+ifscCode);
		System.out.println("Account Balance: "+accBalance);
		
	}


 
 
	

}
