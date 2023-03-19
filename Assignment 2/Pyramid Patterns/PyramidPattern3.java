import java.util.*;

public class PyramidPattern3{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++){
			  System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
			  System.out.print("* ");
			}
			 System.out.println(" ");
		}
		
	}
	
}
//    i       
//    1            *
//    2            **
//    3                      
//    4
//    5
