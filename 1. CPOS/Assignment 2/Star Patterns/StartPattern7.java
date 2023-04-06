import java.util.*;

public class StartPattern7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		//upper traingle
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n*2-1;j++){
			   if((j>=(n-i+1)) && j<=(n+i-1)) System.out.print("*");
			   else System.out.print(" ");
		    }
			System.out.println("");
		}
		//upper traingle
		for(int i=n-1;i>0;i--){
			for(int j=1;j<=n*2-1;j++){
			   if((j>=(n-i+1)) && j<=(n+i-1)) System.out.print("*");
			   else System.out.print(" ");
		    }
			System.out.println("");
		}
		
	}
}
//n====4
//  i                 j                      j

//  1       *         4                      j>=4 && j<=4    (j>=(n-i+1)) && j<=(n+i-1)
//  2      ***        3,4,5                  j>=3 && j<=5     2
//  3     *****       2,3,4,5,6              j>=2 && j<=6      1
//  4    *******      1,2,3,4,5,6,7          j>=1 && j<=7      0
