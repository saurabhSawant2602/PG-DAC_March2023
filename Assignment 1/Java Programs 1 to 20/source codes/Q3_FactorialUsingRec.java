import java.util.*;

class Q3_FactorialUsingRec{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number to get factorial");
		int num= sc.nextInt();
		
		int fact= factorial(num);
		System.out.println("factorial of "+num+" is "+fact);
		
		
		
	}
	
	
	static int factorial(int n){
		if(n==1)  return 1;
		else  return n*factorial(n-1);
	}
	
}
