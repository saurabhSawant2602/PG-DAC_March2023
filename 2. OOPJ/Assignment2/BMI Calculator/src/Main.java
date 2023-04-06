import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BMI Calculator");
        System.out.println("----------------------------------------");
        System.out.println("");

        // Take inputs for weight , height
        System.out.println("Enter your Weight in kg");
        double weight=sc.nextDouble();
        System.out.println("Enter your Height in m");
        double height=sc.nextDouble();
      
         
        //create instance of BMIcalculator
        BmiCalci myBmiCalci= new BmiCalci(height,weight);

        //Display the BMI 
        System.out.format("Your BMI is %.2f",myBmiCalci.calculateBMI());


    }
}

class BmiCalci{
    private double height;
    private double weight;


   //Parameterised constructor to initialze height and weight 
   BmiCalci(double height , double weight){
    this.height=height;
    this.weight=weight;
   }


    //getters 
    public double getHeight(){
       return this.height;
    }
    public double  getweight(){
         return this.weight;
    }

    //setters
    public void setHeight(double height){
       this.height=height;
    }
    public void  getweight(double weight){
        this.weight=weight;
    }

     //function calculater BMI and retuns 
     public double calculateBMI(){
        return (this.weight/(this.height*this.height)*10_000);
     }


  
}