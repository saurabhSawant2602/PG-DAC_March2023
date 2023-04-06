import java.util.*;
public class Question33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x= Integer.parseInt(args[0]);
        float y= Float.parseFloat(args[1]);
        double z= Double.parseDouble(args[2]);

        System.out.println("Enter your choice to perform\n"+"1.Addition of 3 no\n"+"2.Subtraction of 3 no\n"+"3.Multiplication of 3 no\n"+"4.Division of 3 no");
        int a=sc.nextInt();
        switch (a) {
            case 1:  System.out.println("Result= "+(x+y+z));
                     break;
            case 2:  System.out.println("Result= "+(x-y-z));
                     break;
            case 3:  System.out.println("Result= "+(x*y*z));
                     break;
            case 4:  System.out.println("Result= "+(x/y/z));
                     break;         
            default: System.out.println("Invalid Input");
                      break;
        }
        
    }
}