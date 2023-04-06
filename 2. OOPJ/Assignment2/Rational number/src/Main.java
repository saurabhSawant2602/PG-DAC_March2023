import java.util.*;
class Rational{
   int n1 ;
   int d1 ;
   int n2 ;
   int d2 ;
   int num;
   int denom;
   
   Rational (){

   }
   //setter
   public void setN1(int n1){
    this.n1 = n1 ;
   }
   public void setD1(int d1){
    this.d1 = d1 ;
   }
   public void setN2(int n2){
    this.n2 = n2 ;
   }
   public void setD2(int d2){
    this.d2 = d2 ;
   }
   //getter
   public int getN1(){
    return this.n1 ;
   }
   public int getD1(){
    return this.d1 ;
   }
   public int getN2(){
    return this.n2 ;
   }
   public int getD2(){
    return this.d2 ;
   }

   public int getNum(){
    return this.num ;
   }
   public int getDenom(){
    return this.denom ;
   }


   //methods
   public void addition(){
     if(d1 == d2){
       this.num = (n1+n2);
       this.denom =d1 ;
     }
     else {
        this.num=((n1*d2)+(n2*d1)) ;
        this.denom =(d1*d2);
     }     this.reduceFrac();
   }
   
   public void subtraction(){
     if(d1 == d2){
       this.num = (n1-n2);
       this.denom =d1 ;

     }
     else {
        this.num=((n1*d2)-(n2*d1)) ;
        this.denom =(d1*d2);

     }
          this.reduceFrac();
   }
   public void multiplication(){
     
       this.num = (n1*n2);
       this.denom =(d1*d2);
     this.reduceFrac();
    }

    public void division(){
     this.num = (n1*d2);
     this.denom =(d1*n2);
     this.reduceFrac();
   }

   public int gcd(int a, int b)
    { 
        int i= a<b?a:b;
  
       for (i = i; i > 1; i--) {
         if (a % i == 0 && b % i == 0)
                return i;
        }
 
        return 1;
    }
  
    public void reduceFrac() {
	  int gc= this.gcd(this.num,this.denom);
	  this.num/=gc;
	  this.denom/=gc;
	       
	  
  }







   
}

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Rational r =new Rational();
        System.out.println("enter the Numerator of first natural number:");
        r.setN1(sc.nextInt());
        System.out.println("enter the denominator of second  natural number:");
        r.setD1(sc.nextInt());
       System.out.println("enter the Numerator of first natural number:");
        r.setN2(sc.nextInt());
        System.out.println("enter the denominator of  second natural number:");
        r.setD2(sc.nextInt());

        r.addition();
        System.out.println("Addition :"  +r.getNum() +"/"+r.getDenom());
        r.subtraction();
        System.out.println("Subtraction :" +r.getNum() +"/"+r.getDenom()); 
        r.multiplication();
        System.out.println("multiplication :" +r.getNum() +"/"+r.getDenom()); 
        r.division();
        System.out.println("devision :" +r.getNum() +"/"+r.getDenom());
    
           
    }
}