import java.util.*;

class Q5_checkPositiveOrNegative{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number to check if it is positive or negative");
		int num= sc.nextInt();
		
		if(num>0) System.out.println("positive");
		else if(num<0) System.out.println("negative");
		else System.out.println("zero");
		
	}
	
	
}