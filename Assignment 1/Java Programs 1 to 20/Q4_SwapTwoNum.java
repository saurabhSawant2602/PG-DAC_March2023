import java.util.*;

class Q4_SwapTwoNum{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two number to swap ");
		int a=sc.nextInt(), b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
	}
	
}