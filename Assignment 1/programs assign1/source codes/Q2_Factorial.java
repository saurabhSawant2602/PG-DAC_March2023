import java.util.*;

class Q2_Factorial{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to get factorial");
		int fact=1 ,n=sc.nextInt();
		int num=n;
		while(num>0){
			fact=fact*num;
			num--;
		}
		
		System.out.println("factorial of "+n+" is "+fact);
	}
	
}