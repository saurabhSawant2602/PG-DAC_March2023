import java.util.*;

class Q17_PallindromeNum{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two number to check if it pallindrome!!");
		int num= sc.nextInt(), n=num, reversed=0;
	

		while(n!=0){
			int digit=n%10;
			reversed=reversed*10+digit;
			
			n=n/10;
		}
		
		
	  if(num==reversed) System.out.println(num+" is a pallindrome");
	  else  System.out.println(num+" is not a pallindrome");
	  
	}
}