import java.util.*;

public class Pattern12{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int n= sc.nextInt();
		
	    boolean k=true;
		
			for(int i=1;i<=n;i++){
		
				for(int j=1; j<=n*2-1 ; j++){
					
					if(j>=(n+1-i)  && j<=(n+i-1)&&k){
						System.out.print(i);
					    k=false;
						
					}
					else{
						System.out.print(" ");
						k=true;
					}
					
				}
				System.out.println();
			}
			
	}
}