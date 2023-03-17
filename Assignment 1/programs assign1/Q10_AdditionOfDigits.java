
import java.util.*;

class Q10_AdditionOfDigits{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number to get addition of all its digits");
		int num= sc.nextInt(), sum=0;
		
			
	    while(num!=0){
			
			int digit= num%10;
			sum+=digit;
		 
			num=num/10;
		}
		   System.out.println(sum);
		
	}
}