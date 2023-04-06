import java.util.*;
class Question25{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float num1 = 129;
        Float num = new Float(num1);
        System.out.println("Float instance into byte value :"+num.byteValue());
        System.out.println("Float instance into short value :"+num.shortValue());
        System.out.println("Float instance into int value :"+num.intValue());
        System.out.println("Float instance into float value :"+num.floatValue());
        System.out.println("Float instance into double value :"+num.doubleValue());
        System.out.println("Float instance into long value :"+num.longValue());
    }
}