import java.util.*;



class Q13_ReverseNum{
		public static void main(String [] args){
     	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two number and get reversed number");
		int num= sc.nextInt(), reversed=0;
	

		while(num!=0){
			int digit=num%10;
			reversed=reversed*10+digit;
			
			num=num/10;
		}
		
		
		System.out.println(reversed);
		
	}
}