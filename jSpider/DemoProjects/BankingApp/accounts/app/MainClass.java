package app;
import java.util.Scanner;

import accounts.Account;
import accounts.AccountCreation;
import transactions.DepositTransaction;
import transactions.FundTransfer;
import transactions.ViewAccountBalance;
import transactions.WithdrawTransaction;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountCreation ac = new AccountCreation();
		
		
		System.out.println("============== Welcome to BankApp =================");
		
		System.out.println("What you want to do?\n1.To View Balance\n2.To Withdraw Balance\n3.To Deposit Balance\n4.To Fund Deposit");
		int ans = sc.nextInt();
		switch (ans) {
		case 1:
		{
			System.out.println("*********Please Provide Correct Credentials to View********");
			System.out.println("Enter your name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter Account Number");
			long accno = sc.nextLong();
			System.out.println("Enter Branch Name");
			String branch = sc.next();
			System.out.println("Enter IFSC Code");
			String ifsc = sc.next();
			
			Account a1 = ac.createAccount(name,accno,ifsc,300000,branch);
			//Account a2 = ac.createAccount(name,accno,ifsc,300000,branch);
			ViewAccountBalance v1 = new ViewAccountBalance();
			System.out.print("Your Account Balance : ");
			 a1.disp();
			 
			break;
		}
			
		case 2:
		{
			System.out.println("*********Please Provide Correct Credentials to Withdraw********");
			System.out.println("Enter your name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter Account Number");
			long accno = sc.nextLong();
			System.out.println("Enter Branch Name");
			String branch = sc.next();
			System.out.println("Enter IFSC Code");
			String ifsc = sc.next();
			System.out.println("How much you want to withdraw");
			double withamt = sc.nextDouble();
			
			Account a1 = ac.createAccount(name,accno,ifsc,300000,branch);
			Account a2 = ac.createAccount(name,accno,ifsc,300000,branch);
			WithdrawTransaction w1 = new WithdrawTransaction();
			w1.withdraw(a1, withamt);
			a1.disp();
			break;
		}
		case 3:
		{
			System.out.println("*********Please Provide Correct Credentials to Deposit********");
			System.out.println("Enter your name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter Account Number");
			long accno = sc.nextLong();
			System.out.println("Enter Branch Name");
			String branch = sc.next();
			System.out.println("Enter IFSC Code");
			String ifsc = sc.next();
			System.out.println("How much you want to Deposit");
			double depoAmt = sc.nextDouble();
			
			Account a1 = ac.createAccount(name,accno,ifsc,300000,branch);
			Account a2 = ac.createAccount(name,accno,ifsc,300000,branch);
			DepositTransaction d1 = new DepositTransaction();
			d1.deposit(a1, depoAmt);
			a1.disp();
			break;
		}
		case 4:{
			System.out.println("*********Please Provide Correct Credentials for Your Account ********");
			System.out.println("Enter your name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter Account Number");
			long accno = sc.nextLong();
			System.out.println("Enter Branch Name");
			String branch = sc.next();
			System.out.println("Enter IFSC Code");
			String ifsc = sc.next();
			System.out.println("How much Amount you want to Transfer");
			double transAmt = sc.nextDouble();
			
			//for transfer bank account 
			System.out.println("========== Kindly fill below details for Transfer Amount ==================");
			
			System.out.println("Enter Second A/C Holder name");
			sc.nextLine();
			String name2 = sc.nextLine();
			System.out.println("Enter Account Number to Transfer ");
			long accno2 = sc.nextLong();
			System.out.println("Enter Branch Name to Transfer ");
			String branch2 = sc.next();
			System.out.println("Enter IFSC Code to Transfer");
			String ifsc2 = sc.next();
			
			
			Account a1 = ac.createAccount(name,accno,ifsc,300000,branch);
			Account a2 = ac.createAccount(name2,accno2,ifsc2,10000,branch2);
			FundTransfer  f1 = new FundTransfer();
			f1.transfer(a1, a2, transAmt);
			//a1.disp();
			System.out.println("Transfer Balance : "+transAmt);
			a2.disp();
			break;
		}
		
		default:
			System.out.println("Invalide Input");
			break;
		}
			
		
	}
	
	
}
















//AccountCreation ac = new AccountCreation();
//
//Account a1 = ac.createAccount("Kamlesh",3780987652222l,"BORBO1524", 150000.00,"BTM Layout");
//Account a2 = ac.createAccount("Kamlesh",3780987652223l,"BORBO1524",3000000.00,"BTM Layout");
//
//ViewAccountBalance v1 = new ViewAccountBalance();
//DepositTransaction d1 = new DepositTransaction(); 
//WithdrawTransaction w1 = new WithdrawTransaction();
//FundTransfer  f1 = new FundTransfer();
//
//v1.viewBalance(a1);
//d1.deposit(a1, 5000.00);
//w1.withdraw(a1, 3000.00);
//f1.transfer(a1, a2, 2000.00);
