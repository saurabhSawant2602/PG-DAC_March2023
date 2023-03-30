class A9{
    public static void main(String args[]){
        // Byte instance into byte,short, int. long, float and double.
        byte b1= 14;
        Byte B = new Byte(b1) ;
        byte b = B;
        int i = B;
        long l = B;
        float f = B;
        double d = B; 
        System.out.println("Byte Instance to byte= "+b);
        System.out.println("Byte Instance to int = "+i);
        System.out.println("Byte Instance to long = "+l);
        System.out.println("Byte Instance to float = "+f);
        System.out.println("Byte Instance to double = "+d);
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