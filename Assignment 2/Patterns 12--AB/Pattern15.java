import java.util.*;

public class Pattern15{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to print");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++){
		
				for(int j=n;j>0; j--){
					
					if(j>=i) System.out.print(j+" ");
			
				}
				System.out.println();
		}
	}
}