import java.util.*;

class Question14 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter short to convert state of Short instance into byte, short, int, long, float and double :");
        short a = sc.nextShort();
        //we can also autobox  Short s=sc.nextShort();
        Short s = new Short(a);
        System.out.println("short instance into byte value "+s.byteValue());
        System.out.println("short instance into short value "+s.shortValue());
        System.out.println("short instance into int value "+s.intValue());
        System.out.println("short instance into float value "+s.floatValue());
        System.out.println("short instance into doube value "+s.doubleValue());
        System.out.println("short instance into long value "+s.longValue());
    }
    
}