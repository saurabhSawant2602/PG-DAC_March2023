import java.util.*;

class Q11_SmallestOf3{
	public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("smallest among three");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		
		if(n1<n2 && n1<n3) System.out.println(n1+" is smallest");
		else if(n2<n3) System.out.println(n2+" is smallest");
		else System.out.println(n3+" is smallest");
		
			
	}
}