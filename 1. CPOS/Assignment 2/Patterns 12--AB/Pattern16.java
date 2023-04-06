import java.util.*;

public class Pattern16{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to print");
		int n= sc.nextInt();
		
		for(int i=n;i>0;i--){
		
				for(int j=n;j>0 && j>=i; j--){
					 System.out.print(j+" ");
			
				}
				System.out.println();
		}
	}
}