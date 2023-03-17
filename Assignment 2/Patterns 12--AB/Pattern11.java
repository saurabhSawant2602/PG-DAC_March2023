import java.util.*;

public class Pattern11{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int n= sc.nextInt();
		
	    
			for(int i=1;i<=n;i++){
				
				for(int j=1; j<=n*2-1 ; j++){
					
					if(j>=(n+1-i)  && j<=(n+i-1)){
						System.out.print("*");
					
						
					}
					else{
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			
	}
}