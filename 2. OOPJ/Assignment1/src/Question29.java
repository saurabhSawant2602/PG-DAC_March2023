import java.util.*;
class Question29{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter double value :");
        double d =sc.nextDouble();
        Double D = new Double(d);
        System.out.println("Double instance to byte :"+D.byteValue());
        System.out.println("Double instance to short :"+D.shortValue());
        System.out.println("Double instance to int :"+D.intValue());
        System.out.println("Double instance to long :"+D.longValue());
        System.out.println("Double instance to float :"+D.floatValue());
        

    }
}