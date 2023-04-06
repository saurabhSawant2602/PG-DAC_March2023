import java.util.*;
class Question22{
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers for addition and get max and min value ");
        long a = sc.nextLong();
        long b = sc.nextLong();

        long sum = Long.sum( a, b);
        long min = Math.min(a, b);
        long max = Math.max( a, b);
        System.out.println("sum of two long numbers "+sum);
        System.out.println("minimum number "+ min);
        System.out.println("maximum number "+ max);

    }
}