package domain;

public class Warehouse {
   private static String[] shelves;
   
   static {
	   Warehouse.shelves= new String[10];
   }

   public static void addToshelf(int n, String item) {
	 
	   if(n<=0 || n>shelves.length)  {
		   System.out.println("Invalid Entry !! . Our warehouse has capacity of 10 items");
		   return;
	   }
	   
	   if(Warehouse.shelves[n-1]!=null) {
		   System.out.println("Shelf already has an item !!");
		   return;
	   }
	   
	   
	   shelves[n-1]=item;
	   System.out.println("!! Item Added !!");
   }
   
   

   public static void removeItem(int n) {
	   if(n<=0 || n>shelves.length)  {
		   System.out.println("Invalid Entry !! . Our warehouse has capacity of 10 items");
		   return;
	   }
	   if(Warehouse.shelves[n-1]!=null) {
		   shelves[n-1]=null;
		   System.out.println("!! Item Removed !!");
		   return;
	   }
	   System.out.println("It is Empty !! There's no item to remove");
   }
   
   
   public static void printAllShelvesItems() {
	   System.out.println();
	    for(int i=0;i<shelves.length;i++)  {
	    	if(shelves[i]==null) System.out.println("Shelf "+(i+1)+" :"+"[Empty]");
	    	else System.out.println("Shelf "+(i+1)+" : "+ (shelves[i]));
	    }
	    System.out.println();
   }
}
