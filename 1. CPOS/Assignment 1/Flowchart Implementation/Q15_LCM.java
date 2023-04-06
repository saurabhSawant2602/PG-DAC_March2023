import java.util.*;

class Q15_LCM{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number to get LCM ");
		int n1= sc.nextInt(), n2=sc.nextInt(),lcm, i=1;
		
		int large= n1>n2?n1:n2;
		
		while(true){
			
			if(large%n1==0 && large%n2==0){
				lcm =large;
				break;
			}
			
			
			large++;
		}
		
		System.out.println("The LCM of "+n1+" "+n2+" is "+lcm);
		
		
	}
	
}