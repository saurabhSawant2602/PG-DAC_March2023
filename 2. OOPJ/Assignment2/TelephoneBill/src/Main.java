import java.util.*;

class TelephoneBill{
    /*
    a. Customer name
b. Phone number
c. Number of calls made
d. Duration of calls (in minutes)


    */
   private String custName;
   private long phNo;
   private int noOfCalls;
   private double[] callDuration;
   private double TeleBill;
    
    TelephoneBill(String custName, long phNo, int noOfCalls , double[] callDuration){
        this.custName=custName;
        this.phNo=phNo;
        this.noOfCalls=noOfCalls;
        this.callDuration=callDuration;
    }

   public void calculateBill(){
        int calls= noOfCalls;
        if(calls>=100){
            this.TeleBill=100*0.5;
            calls-=100;
        }else calls*=0.5;

        if(calls>0){
             this.TeleBill=100*0.25;
        }

        if(this.TeleBill>10) this.TeleBill=10;
   }

   public String toString(){
    return "Customers Name : "+custName+"\n"
            +"Customers ph No : "+phNo+"\n"
            +"No of calls : " +noOfCalls+"\n"
            +"_Telephone Bill :"+TeleBill+"\n";
   }

}
//main class
public class Main{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("----Telephone bill generator----");
      
       long phNo;
       String custName;
      while(true){
       System.out.println("Enter customers name");
        custName=sc.nextLine();

       System.out.println("Enter "+custName+ "'s customer phone number");
        phNo=sc.nextLong();
        if(phNo<=999_999_999_9L && phNo>=999_999_999L) break;  
        sc.nextLine();
         System.out.println("Invalid number!! please Enter details again");
      }
       System.out.println("Enter number of calls");
       int noOfCalls = sc.nextInt();

       System.out.println("Enter the duration for all calls in mins");
       double[] durations = new double[noOfCalls];
       
       for(int i=0;i<noOfCalls;i++){
                double duration = sc.nextDouble();
                if (duration <1) duration=1;
                durations[i]=duration;
       }


       TelephoneBill myBill= new TelephoneBill(custName , phNo, noOfCalls, durations );
       myBill.calculateBill();
       System.out.println(myBill);
    }
}