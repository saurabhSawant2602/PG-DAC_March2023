import java.util.Scanner;

class CreditScoreCalci{
    /*
    a. creditHistory: An int to represent the length of the individual's credit history.
    b. creditUtilization: A double to represent the percentage of available credit the
    individual is using.
    c. paymentHistory: A boolean to represent whether the individual has a good
    payment history or not
    
    */
   static Scanner sc= new Scanner(System.in);
   int creditHistory;
   double creditUtilization;
   boolean paymentHistory;
   double creditScore;

    CreditScoreCalci(){
        //td
    }
    // CreditScoreCalci(int creditHistory,int creditUtilization,boolean paymentHistory){
    //   this.creditHistory=creditHistory;
    //   this.creditUtilization=creditUtilization;
    //   this.paymentHistory=paymentHistory;
    // }

     //getters
    public int  getCeditHistory(){
          return  this.creditHistory;
    }
   public double   getCreditUtilization(){
     return this.creditUtilization;
   }
   public boolean getPaymentHistory(){
      return this.paymentHistory;
   }
  
   public double getCreditScore(){
      return this.creditScore;
   }


     //setters
    public void setCeditHistory( int creditHistory){
            this.creditHistory=creditHistory;
    }
   public void setCreditUtilization(double creditUtilization){
      this.creditUtilization=creditUtilization;
   }
   public void setPaymentHistory(boolean paymentHistory){
       this.paymentHistory=paymentHistory;
   }
   public void setCreditScore(double creditScore){
       this.creditScore=creditScore;
   }


   //calci
   public void calculateScore(){
  
      int multiplier;
      multiplier=  this.paymentHistory?35:55;
       this.creditScore= (creditHistory*15)+(int)(creditUtilization*30)+multiplier;
   }






    public static int menuList(){
   
              
        System.out.println();
        System.out.println("----------------------------------------");
             
        System.out.println();
         System.out.println("0. To exit");
        System.out.println("1. Enter the length of the credit history");
        System.out.println("2. Percentage of available credit the individual");
        System.out.println("3. Individual has a good payment history or not. (true/false)");
        System.out.println("4. Get credit score");
       
         return sc.nextInt();
       

    }


    public boolean checkIfNotEmpty(){
        if(creditHistory>0 && creditUtilization>0 ){
           
            return true;
        }
        return false;
    }
   



   }











class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int option;
        CreditScoreCalci calci= new CreditScoreCalci();
        while((option= CreditScoreCalci.menuList() )!=0){
             switch(option){

                case 1:
                      calci.setCeditHistory(sc.nextInt());
                       break;

                case 2:
                        calci.setCreditUtilization(sc.nextDouble());
                        break;


                case 3:calci.setPaymentHistory(sc.nextBoolean());
                         break;

                 case 4:if(!calci.checkIfNotEmpty())   continue;
                         calci.calculateScore();
                         System.out.println(calci.getCreditScore());
                         break;

                default: System.out.println(" ## Invalid choice ##");
             }
        }
    }
}