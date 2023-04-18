package domain;

import java.util.InputMismatchException;
import java.util.Scanner;



import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingAccount;

public class Bank {

	public Bank() {
		loginDriveMenu();
	}

	static Scanner sc = new Scanner(System.in);
	private static Account account;
	Account[] accounts = new Account[] { new SavingAccount("1", 1000), new CheckingAccount("2", 5000),
			new SavingAccount("3", 6000), new CheckingAccount("4", 8000), new SavingAccount("5", 10000),
			new CheckingAccount("6", 5000), new SavingAccount("7", 4000), new CheckingAccount("8", 400),

	};

	public void displayAccounts() {
		for (Account acc : accounts) {
			System.out.println(acc);
		}
	}

	

	
	
	
	
	
	public int menuList() {
		System.out.println("MENU LIST ");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Get Balance");
		System.out.println("0. Logout");
		System.out.println("Enter your choice :");
		return sc.nextInt();
	}

	
	public int loginMenu() {
		System.out.println("---- Login ---");
		System.out.println("1. Login");
		System.out.println("0. Exit");
		System.out.println("Enter your choice :");
		return sc.nextInt();
	}
	public void assignAccount()  {
		System.out.println("Welcome to Banking App");
	
		sc.nextLine();
		System.out.println("Enter the account number to Login");
		String accnoString=sc.nextLine();
		account=getAcccount(accnoString);
		System.out.println("");
		System.out.println("Your logged In !!");
		System.out.println();
		System.out.println("Account Details :");
		System.out.println(account);
		driveMenu();

	}
	
	
	public void loginDriveMenu() {
		int option;
		while((option=loginMenu())!=0) {
			switch (option) {
			case 1:
				assignAccount();
				break;
			case 2:
				driveMenu();
				break;

			default:
				break;
			}
		}
	}
	
	public void driveMenu() {
		int option;
		while ((option = menuList()) != 0) {
			try {
				switch (option) {
			
				case 1:
					deposit();
					break;
				case 2:
					withdraw();
					break;
				case 3:
					printBal();
					break;

				default:
					throw new InputMismatchException();
				}
			}catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Invalid Input");
				
			}catch (NullPointerException e) {
				System.out.println("Account not found");
			}
		
		}
	}

	public void deposit() throws InputMismatchException {
    	  System.out.println("Enter the amount you want to deposit");
		    String msg=  account.deposit(sc.nextDouble()) ? ("Amount Deposited !!\n"+"Balace : "+account.getBalance()):"Deposit failed !!";
		    PrinterMessage(msg);
      }

	
	
	public void withdraw() throws InputMismatchException{
		 System.out.println("Enter the amount you want to withdraw");
		 String msg= account.withdraw(sc.nextDouble())? ("Amount Withdrawn !!"+"Balace : "+account.getBalance()):"Insufficient Balance/ overdraft Limit";
			PrinterMessage(msg);
	}
	
	public Account getAcccount(String accNo) {
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getAccNo().equals(accNo)) {
				return accounts[i];
			}
		}
		return null;
	}
	
	
	
	
	
	public void printBal()throws InputMismatchException {
		System.out.println(account.getBalance());
	}
	
	
	public static void PrinterMessage(String message) {
		System.out.println(message);
	}

}
