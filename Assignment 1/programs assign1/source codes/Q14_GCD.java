import java.util.*;


class Q14_GCD{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two numbers to find the GCD");
		int n1=sc.nextInt(), n2= sc.nextInt(),gcd=1;
		
		int smallNo= n1<n2?n1:n2;
		
		for(int i=1;i<=smallNo;i++){
			if(n1%i==0 && n2%i==0){
				gcd = i;
			}
		}
		
		System.out.println("gcd of "+n1+" and " +n2+" is "+gcd);
	}
}
