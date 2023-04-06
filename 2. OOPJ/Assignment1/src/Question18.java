import java.util.*;
class Question18{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers for addition and get max and min value ");
        int a = sc.nextInt();
        int b = sc.nextInt();
  
        System.out.println("sum of two integer numbers "+Integer.sum( a, b));
        System.out.println("minimum number "+Math.min(a, b));
        System.out.println("maximum number "+ Math.max( a, b));

    }
}