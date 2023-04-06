import java.util.*;

public class PyramidPattern5{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int n= sc.nextInt();
		
		for(int i=n;i>0;i--){
			for(int j=1;j<=n;j++){
				if(j>=i) System.out.print(j);
				else System.out.print(" ");
			}
		    for(int j=n-1;j>0;j--){
				if(j>=i) System.out.print(j);
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
}




//   k               i   ==   j

//   *                1     1
//   * *              2     2
//   *   *            3     3
//   *                4
//   * * * * *        5










