
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperation {
    static Scanner sc = new Scanner (System.in);
	
    private static void acceptArray(int[] arr) {
		if(arr != null) {
			for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("arr ["+i+"] : " );
			arr[i] = sc.nextInt();	
		}
			System.out.println();	
	 }
  }	
    
    private static void printArray(int[] arr) {
    	if(arr != null) {
    		System.out.print("Contents of Array:"+" ");
			for(int elements : arr) {
				System.out.print(elements+" ");
		}
		System.out.println();	
	 }
		
    }
    
    private static void sumOfArrayElements(int[] arr) {
		if(arr != null) {
		    int sum = 0;
			for(int i = 0 ; i<arr.length;i++) {
				sum += arr[i];
				
			}
			System.out.println("Sum of Array: "+sum);
		}	

	}
    
    private static void avgOfArrayElements(int[] arr) {
    	if(arr != null) {
		    int sum = 0;
		    int avg = 0;
			for(int i = 0 ; i<arr.length;i++) {
				sum += arr[i];
				avg = sum / arr.length;
			}
			System.out.println();
			System.out.println("Average of Array: "+avg);
			}	
            System.out.println();
	}

		
    private static void largestElementOfArray(int[] arr) {
		if(arr != null) {
			int max=arr[0];
			for(int i =0 ; i < arr.length ; i++) {
				max = arr[0];
				if(arr[i] > max) {
					max = arr[i];
					
				}
				
			}
			System.out.println("Largest element in Array: "+max);  	
		}
		
	}
	
    private static void smallestElementOfaraay(int[] arr) {
    	if(arr != null) {
    		int min = arr[0];
			for(int i =0 ; i < arr.length ; i++) {
				 min = arr[0];
				if(arr[i] < min) {
					min = arr[i];
					
				}
				
			}
			System.out.println("Smallest element in Array: "+min);
		}
		
	}
    
	private static void sortArrayElements(int[] arr) {
		
		    Arrays.sort(arr);
		    for(int elements : arr) {
			System.out.print(elements+ " ");
		}
		    System.out.println();
	}
	
	
	public static int showMenu(){
		

		System.out.println("1.Accept an array of integers of size");
		System.out.println("2.Display the contents of the array");
		System.out.println("3.Display the sum of all the elements in the array");
		System.out.println("4.Display the average of all the elements in the array");
		System.out.println("5.Display the largest element in the array");
		System.out.println("6.Display the smallest element in the array");
		System.out.println("7.Sort the array in ascending order and display the sorted array");
		System.out.println("0.Exit");
		System.out.println("============================================================");
	
		return sc.nextInt();
	}
    
    
	public static void main(String[] args) {
		
		System.out.print("Enter The Sizes Of Array : ");
		int size = sc.nextInt();
        int arr[] = null;
		int choice;
		while((choice = ArrayOperation.showMenu()) != 0 ){
		switch(choice){
		   
		case 1 :  arr = new int[size];
			     ArrayOperation.acceptArray(arr);
		         break;
		         
		case 2 : ArrayOperation.printArray(arr);
		         break;
		         
		case 3 : ArrayOperation.sumOfArrayElements(arr);
		         break;
		         
		case 4 : ArrayOperation.avgOfArrayElements(arr);
		         break;
		         
		case 5 : ArrayOperation.largestElementOfArray(arr);
		         break;
		         
		case 6 : ArrayOperation.smallestElementOfaraay(arr);
		         break;
		         
		case 7 : ArrayOperation.sortArrayElements(arr);
		         break;
		   }
		
		}
		
	}



	
	

	

	
	
	

	

}

