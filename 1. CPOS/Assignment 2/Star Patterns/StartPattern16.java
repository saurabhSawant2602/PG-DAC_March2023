import java.util.*;

public class StartPattern16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>0;j--){
			if( j==i || j==1 || i==n )  System.out.print("*");
		    else  System.out.print(" ");
			}
			 System.out.println();
		}
		
	}
}