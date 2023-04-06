import java.util.*;
class Question23{
    public static void main(String args[]){
           Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers for addition and get max and min value ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float sum = Float.sum( a, b);
        float min = Math.min(a, b);
        float max = Math.max( a, b);
        System.out.println("sum of two float numbers "+sum);
        System.out.println("minimum number "+ min);
        System.out.println("maximum number "+ max);

    }
}