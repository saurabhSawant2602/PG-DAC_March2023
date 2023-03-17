

class Q7_PrintNumbersWithoutLoop{
	public static void main(String [] args){
    printNum(10);

		
	}
	
	static void printNum(int num){
		if(num==0) return; 
	     printNum(num-1);
		 System.out.println(num);
	}
}