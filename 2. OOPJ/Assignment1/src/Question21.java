import java.util.*;

class Question21{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the long value for conversion of value to instance");
        long num1 = 129;
        Long num = new Long(num1);
        System.out.println("Long instance into byte value"+num.byteValue());
        System.out.println("Long instance into short value"+num.shortValue());
        System.out.println("Long instance into int  value"+num.intValue());
        System.out.println("Long instance into float value"+num.floatValue());
        System.out.println("Long instance into double value"+num.doubleValue());
        System.out.println("Long instance into long value"+num.longValue());
    }
}