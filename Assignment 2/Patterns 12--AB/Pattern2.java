import java.util.*;

public class Pattern2{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int n= sc.nextInt();
		
		
		/*
			for(int i=1;i<=n;i++){
				
				for(int j=1, k=65; j<=i ;    j++,k++){
					 System.out.print((char)k+" ");
					 
				}
				System.out.println();
			}
			*/
			
				
			for(int i=1;i<=n;i++){
				char k='A';
				for(int j=1; j<=i ;    j++, k++){
					 System.out.print(k+" ");
					
				}
				System.out.println();
			}
			
	}
}