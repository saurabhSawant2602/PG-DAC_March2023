import java.util.*;

class Question16{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number :");
        int b = sc.nextInt();
        String s = new String(Integer.toString(b));
        
        System.out.println("int value into String  :"+Integer.toString(b));
        System.out.println("int value into Integer instance..  :"+Integer.valueOf(b));
        System.out.println("String instance into Integer instance.  :"+Integer.valueOf(s));
        System.out.println("int value into binary :" +Integer.toBinaryString(b) );
        System.out.println("int value into octal :"+Integer.toOctalString(b) );
        System.out.println("int value into hexadecimal  :"+Integer.toHexString(b));
    }
}