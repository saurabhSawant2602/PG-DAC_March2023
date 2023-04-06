import java.util.*;

class BankAccount {
  private static Scanner sc = new Scanner(System.in);
  private String accName;
  private int accNo;
  private double balance;
  private Random num= new Random();

  BankAccount(String accName) {
    this.accName = accName;
    this.accNo = num.nextInt(1000000);
    this.balance = 0;
    System.out.println("Account opened successfully!!");
    System.out.println(this);
  }

  public double getAccBal() {
    return this.balance;
  }

  public void depositMoney(int money) {
    if (!this.doesExists())
      return;
    this.balance += money;
  }

  public void withdrawMoney(int money) {
    if (!(this.doesExists()))
      return;

    if (!(money <= this.balance)){
      System.out.println(" !!--Insufficient Balance--!!");
      System.out.println("Balance  : "+this.balance);
        return;
    }
      
    this.balance -= money;
    System.out.println("Money withdrawn : "+money);
    System.out.println("Balance  : "+this.balance);
  }

  public Boolean doesExists() {
    if (this.accName.equals(null)) {
      System.out.println("You need to create an account");
      return false;
    }
    return true;
  }

  public static int showMenu() {
   System.out.println();
     System.out.println("----------------------------------------");
    System.out.println("1. Create a new account");
    System.out.println("2. Deposit money into an account");
    System.out.println("3. Withdraw money from an account");
    System.out.println("4. Display the account balance");
    System.out.println("5. Display the account holder's information");
    System.out.println("0. To exit");
    return sc.nextInt();
  }

  public String toString() {
    return "Account Holder : " + this.accName + "\n"
        + "Account No : " + this.accNo + "\n"
        + "Account Balance :" + this.balance + "\n";
  }
   
   public boolean validateData(){
     System.out.println("Enter user account number");
     int InputAccNo= sc.nextInt();
     if(this.accNo==InputAccNo) return true;
     System.out.println("#### Invalid Account number ####");
     return false;
   }
  
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("---------Welcome to Bank------");
    System.out.println();
    int option;
    BankAccount acc = null;

    while ((option = BankAccount.showMenu()) != 0) {
      switch (option) {
        case 1:

          System.out.println("Enter the Account holders name :");
          String name = sc.nextLine();
          acc = new BankAccount(name);
          break;

        case 2:
           
           if (acc != null && acc.validateData()){
              
              System.out.println("How much money you want to deposit");
               acc.depositMoney(sc.nextInt());
           }
           else System.out.println("Account not yet created");
         
          break;
        case 3:
          if (acc != null && acc.validateData()){
          System.out.println("How much money you want to withdraw");
           acc.withdrawMoney(sc.nextInt());
          }
          else System.out.println("Account not yet created");
         
          break;
        case 4:
          if (acc != null && acc.validateData())
          System.out.println(acc.getAccBal());
          else System.out.println("Account not yet created");
          break;

        case 5:
          if (acc != null && acc.validateData())
          System.out.println(acc);
          else System.out.println("Account not yet created");
          break;

          default:
            System.out.println(" ## Invalid choice ##");
      }
    }

  }
}