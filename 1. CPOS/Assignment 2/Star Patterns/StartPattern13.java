import java.util.*;

public class StartPattern13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--){
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=n-i+1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	    for(int i=2;i<=n;i++){
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=n-i+1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}