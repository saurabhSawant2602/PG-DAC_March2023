import java.util.*;

class Q18_PrimeFactorsOfNum{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number to get prime factors");
		int num= sc.nextInt();
		
		for(int i=2;i<=num;i++){
			if(num%i==0 &&  isPrime(i))  System.out.print(i+" ");
		}
		
	}
	
	static boolean isPrime(int num){
		
		for(int i=2;i<num;i++){
			if(num%i==0) return false;
		}
		
		return true;
		
	}
}
