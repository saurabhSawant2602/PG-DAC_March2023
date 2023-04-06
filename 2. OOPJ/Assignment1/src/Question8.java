import java.util.Scanner;
class Question8{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the byte value to convert it into String value,instance value  ");
        byte b = sc.nextByte();
        
        System.out.println();
        System.out.println("Byte value to String value is : "+ Byte.toString(b));
        System.out.println("Byte to byte instance value is : "+Byte.valueOf(b));
         System.out.println("Enter the String --> String instance into Byte instance. ");
        String s=sc.nextLine();
        System.out.println("String instance into Byte instance: "+Byte.valueOf(s));

    }
} 