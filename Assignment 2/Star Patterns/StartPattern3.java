import java.util.*;

public class StartPattern3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		for(int i=5;i>0;i--){
			for(int j=1;j<=i;j++){
			  System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}