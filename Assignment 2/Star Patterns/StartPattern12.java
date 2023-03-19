import java.util.*;

public class StartPattern12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--){
			for(int j=1;j<=i;j++){
			 System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++){
			for(int j=1;j<=i;j++){
			 System.out.print("*");
			}
			System.out.println();
		}
		
	}
}