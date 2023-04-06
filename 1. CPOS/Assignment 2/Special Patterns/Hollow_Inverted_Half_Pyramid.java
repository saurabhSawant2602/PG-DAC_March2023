//Hollow_Inverted_Half_Pyramid

import java.util.*;

public class Hollow_Inverted_Half_Pyramid{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int n= sc.nextInt();
		
		for(int i=n;i>0;i--){
			for(int j=1;j<=n;j++){
				 if(i==n || j==1 || j==i) System.out.print("*");
				 else System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}