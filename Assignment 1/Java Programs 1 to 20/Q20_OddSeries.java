import java.util.*;

class Q20_OddSeries{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of odd series");
		int num= sc.nextInt(), count=0, i=1;
		
		while(count<num){
			
			if(i%2!=0){
				System.out.print(i+" ");
					count++;
					
			}
		   i++;
		}
		
		
		
	}
	
}