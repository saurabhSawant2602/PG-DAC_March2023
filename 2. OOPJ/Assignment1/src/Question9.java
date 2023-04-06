import java.util.*;
class Question9{
    public static void main(String args[]){
        // Byte instance into byte,short, int. long, float and double.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the byte value to convert it into byte,short, int. long, float and double. ");
      
        byte b1= sc.nextByte();
        //AutoPack Byte b1= 8;
        Byte b = new Byte(b1) ;
          System.out.println();
        System.out.println("Byte Instance to byte= "+b.byteValue());
        System.out.println("Byte Instance to int = "+b.intValue());
        System.out.println("Byte Instance to long = "+b.longValue());
        System.out.println("Byte Instance to float = "+b.floatValue());
        System.out.println("Byte Instance to double = "+b.doubleValue());
    }
} 

/*public class Ass1Q9 {
    public static void main(String[] args) {
    byte a = 7;  
    Byte b = new Byte(a);
    System.out.println(Byte.valueOf(b));
    System.out.println(Short.valueOf(b));
    System.out.println(Integer.valueOf(b));
    System.out.println(Float.valueOf(b));
    System.out.println(Double.valueOf(b));
    System.out.println(Long.valueOf(b));

   }
}
*/