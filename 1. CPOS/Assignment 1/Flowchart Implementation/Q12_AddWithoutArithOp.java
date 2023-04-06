import java.util.*;


class Q12_AddWithoutArithOp{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two numbers for addition without arithmetic operator");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		for(int i=1;i<=n2;i++){
			n1+=1;
		}
		System.out.println("addition : "+n1);
			
	}
}