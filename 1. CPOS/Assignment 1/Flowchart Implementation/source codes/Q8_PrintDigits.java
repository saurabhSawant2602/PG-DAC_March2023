import java.util.*;

class Q8_PrintDigits{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number to get all the digits");
		int num= sc.nextInt();
		
	    while(num!=0){
			
			int digit= num%10;
			
		    System.out.println(digit);
			num=num/10;
		}
	
	}
}