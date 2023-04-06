import java.util.*;

public class StartPattern9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>0;j--){
				if(j<=i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>0;i--){
			for(int j=n;j>0;j--){
				if(j<=i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}