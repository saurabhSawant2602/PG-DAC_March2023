import java.util.*;

class Question28{
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter double value :");
        double b = sc.nextDouble();
        
        System.out.println("double value into String "+Double.toString(b));
        System.out.println("double value into double instance.. "+Double.valueOf(b));

        String s= Double.toString(b);
        System.out.println("double instance into double instance. "+Double.valueOf(s));
        System.out.println("double value into hexadecimal "+Double.toHexString(b));
        System.out.println("double value into binary :"+ Long.toBinaryString(Double.doubleToLongBits(b)));
        System.out.println("double value into octal :"+ Long.toOctalString(Double.doubleToLongBits(b)));
    }
}