import java.util.*;

public class Pattern8{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int n= sc.nextInt();
		int m=n;
	      	boolean flag =true;
			for(int i=1;i<=n;i++){
				int k=m;
			    flag =true;
				for(int j=1; j<=n*2-1 ; j++){
					
					if(j>= (n+1-i )  && j<=(n+i-1) && flag ){
						System.out.print(k);
						k++;
						flag=false;
						
					}else{
						System.out.print(" ");
						flag=true;
	              
					}
					
				}
				System.out.println();
				m--;
			}
			
	}
}