import java.util.*;

class Q16_LCMusingFactorization{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter two numbers toget LCM using factorization");
		int n1=sc.nextInt(),n2=sc.nextInt(), lcm=1;
		
		int largest = n1>n2? n1 :n2;
		
		for(int i=2;i<=largest;i++){
			if(!isPrime(i)) continue;
			
             
			 while(true){
				if(n1%i==0 || n2%i==0 ){
					lcm*=i;
				}
				
				if(n1%i==0){
					n1=n1/i;
				}
				if(n2%i==0){
					n2=n2/i;
				}
			
				if(n1%i!=0 && n2%i!=0 ){
					break;
				}
			 }
		
						
			
			
			
		}
		
		System.out.println("LCM is "+lcm);
		
	}
	static boolean isPrime(int num){
		for(int i=2;i<num;i++){
			if(num%i==0) return false;
				
		}
		
		return true;
	}
}


