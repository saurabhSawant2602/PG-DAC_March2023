import java.util.*;

public class Pattern14{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to print");
		int n= sc.nextInt();
		
		for(int i=n;i>0;i--){
		
				for(int j=1;j<=n; j++){
					if(j<=i) System.out.print(j+" ");
			
				}
				System.out.println();
		}
	}
}