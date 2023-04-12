import java.util.Scanner;

public class MatrixOperations {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);  
    System.out.print("Enter No. Rows of Array : ");
    int r = sc.nextInt();
    System.out.print("Enter No. Coloumns of Array : ");
    int c = sc.nextInt();
    
    
	int A[][] = new int[r][c];
	int B[][] = new int [r][c];
	int C[][] = new int [r][c];
	
	
	// input Array a
	System.out.println();
	System.out.println("Input the elements of the Matrix A : ");
	for(int i =0;i<r;i++) {
		for(int j = 0;j<c;j++) {
			A[i][j] = sc.nextInt() ;
		}
	}
	
	// input Array b
	System.out.println("Input the elements of the Matrix B : ");
		for(int i =0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				B[i][j] = sc.nextInt() ;
			}
		}
		
	// sum of a and b in c 
		System.out.println("Addition of Matrix A And B  : ");
		System.out.println();
		for(int i =0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(" "+C[i][j]+" ");
				}
			
			System.out.println();
		}
		
		
		
   // sub of a and b in c 
		System.out.println();
		System.out.println("Subtraction of Matrix A and B  : ");
		System.out.println();
			for(int i =0;i<r;i++) {
				for(int j = 0;j<c;j++) {
					C[i][j] = A[i][j] - B[i][j];
					System.out.print(" "+C[i][j]+" ");
				}
				
				System.out.println();
			}
			
	
    // multiplication of a and b in c
		for(int i=0;i<r;i++){
			
		  for(int j=0;j<c;j++) {
			  int sum=0;
			  for(int k=0;k<c;k++) {
				  sum = sum+A[i][k] * B[k][j];
				  C[i][j] = sum;
			  }
		  }
		}
		System.out.println();
		System.out.println("Multiplication of Matrix A and B : ");
		System.out.println();
		for(int i =0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				System.out.print(" "+C[i][j]+" ");
				}
			System.out.println();
		}
		
   // Transpose of matrix a
		System.out.println();
		System.out.println("Transpose Of Matrix A : ");
		System.out.println();
		for(int i =0;i<c;i++) {
			for (int j =0;j<r;j++){
				System.out.print(" "+A[j][i]+" ");
			}
			System.out.println();
		}
		
	// Transpose of matrix b
		System.out.println();
		System.out.println("Transpose Of Matrix B : ");
		System.out.println();
		for(int i =0;i<c;i++) {
			for (int j =0;j<r;j++){
				System.out.print(" "+B[j][i]+" ");
			}
				System.out.println();
			}	
     }
}
