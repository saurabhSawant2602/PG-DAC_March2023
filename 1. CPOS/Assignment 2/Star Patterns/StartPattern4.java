import java.util.*;

public class StartPattern4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--){
			for(int j=n;j>0;j--){
			 if(j<=i) System.out.print("*");
			 else System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
}