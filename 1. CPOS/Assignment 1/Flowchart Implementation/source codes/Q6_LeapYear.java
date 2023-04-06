import java.util.*;

class Q6_LeapYear{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter year to know if it is leap year or not");
		int year= sc.nextInt();
		
		if(year%400==0 ){
			System.out.println("Leap Year");
			
			
		}else if(year%100==0){
			System.out.println("not leap Year");
		}else if(year%4==0){
			System.out.println("leap Year");
		}else{
				System.out.println("not leap Year");
		}
		
	}
}