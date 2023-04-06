import java.util.*;

class ElectricityBill{
   /*
       a. customerName (String)
       b. unitsConsumed (double)
       c. billAmount (double)

   */
    private String customerName;
    private double unitsConsumed;
    private double billAmount;
  
   ElectricityBill(String customerName,double unitsConsumed){
    this.customerName=customerName;
    this.unitsConsumed=unitsConsumed;
   }
    
    public void calculateBillAmount(){
        double units=this.unitsConsumed;
        if(units>100) {
           this.billAmount= 5*100;
           units-=100;
        }else units=units*5;
        if(units>200){
           this.billAmount= 7*200;
            units-=200;
        }else units*=7;
        if(units>0){
            this.billAmount= 10*units;
        }
     
    }


    public String toString(){
        return "Customer Name :" + customerName+"\n"
               +"Units Consumed :" + unitsConsumed+"\n"
               +"_Total Bill"+billAmount;
    }
}
class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
       System.out.println("------ Generate Bill -----");
       System.out.println("Enter customers name");
       String custName=sc.nextLine();
       System.out.println("Enter how much units used by "+custName);
        double unitsConsumed=sc.nextDouble();
       ElectricityBill myBill= new ElectricityBill(custName, unitsConsumed);
       myBill.calculateBillAmount();
       System.out.println(myBill);

    }
}
