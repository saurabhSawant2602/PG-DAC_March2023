import java.util.*;

class Q16_LCMusingFactorization2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter two numbers toget LCM using factorization");
		int n1=sc.nextInt(),n2=sc.nextInt(), lcm=1;
	
		
		for(int i=2;i<=n1 || i<=n2;i++){
			//if number is not prime return from here only
			if(!isPrime(i)) continue;
			
  
			 while(true){
				 
				 
				 // If i is able to divide any of the number then multipy it to 
				if(n1%i==0 || n2%i==0 ){
					lcm*=i;
					
					
			    //if i is not able to divide , break inner while loop 
				}else break;
				
				// find and divide that number for further calculations
				n1= n1%i==0? n1/i : n1;
				n2= n2%i==0? n2/i : n2;
		
		
			   
				//if(n1%i!=0 && n2%i!=0 ){
				//	break;
				//}
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


