import java.util.*;
class Question20{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the long value for conversions");
    long l= new Long( sc.nextLong());

    System.out.println("long value into String :"+Long.toString(l));
    System.out.println("long value into Long instance : "+Long.valueOf(l));
    //converting Long value to String Instance
    String str=Long.toString(l);
    System.out.println("String instance into Long instance :"+Long.valueOf(str));
    System.out.println("long value into binary :" +Long.toBinaryString(l));
    System.out.println("long value into octoal :"+Long.toOctalString(l));
    System.out.println("long value into hexadecimal :"+Long.toHexString(l));


    }
}
