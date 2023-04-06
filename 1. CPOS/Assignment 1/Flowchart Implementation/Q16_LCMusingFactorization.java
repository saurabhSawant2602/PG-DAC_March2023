import java.util.*;

class Q16_LCMusingFactorization{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter two numbers toget LCM using factorization");
		int n1=sc.nextInt(),n2=sc.nextInt(), lcm=1,i=2;
	
	    
		while(n1!=1 || n2!=1){
			
			if(!isPrime(i)){
				++i;
				continue;
			}
			
			if(n1%i==0 || n2%i==0){
				lcm*=i;
				n1= n1%i==0? n1/i : n1;
				n2= n2%i==0? n2/i : n2;
			}else ++i;
			
			
			
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

