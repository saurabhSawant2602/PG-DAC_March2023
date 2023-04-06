import java.util.*;


class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
      
         Book b= new Book();

        System.out.println("Enter the Book title");
        b.setTitle(sc.nextLine());
         
        System.out.println("Enter Author's name");
        b.setAuthor(sc.nextLine());

        System.out.println("Enter Author's Publisher");
        b.setPublisher(sc.nextLine());

        System.out.println("Enter ISBN number");
        b.setIsbn(sc.nextLine());

        System.out.println("Enter year ");
        b.setYear(sc.nextInt());
        
        sc.nextLine();
        System.out.println("Enter price of book");
        b.setPrice(sc.nextDouble());
        


        int option;
        do{
       
        System.out.println("1. increase the quantity");
        System.out.println("2. Decrease the quantity");
        System.out.println("3. Get total value of the inventory");
        System.out.println("* Any other key to exit");
        System.out.println("Enter your choice");
        option=sc.nextInt();

        switch(option){
            case 1:
               System.out.println("By how much you wanna increase quantity");
                 b.increaseQuantity(sc.nextInt());
                 System.out.println(b);
                  break;


             case 2:
                System.out.println("By how much you wanna increase quantity");
                b.decreaseQuantity(sc.nextInt());
                 System.out.println(b);
                   break;                

             case 3:
                  
                System.out.println(b.getInventryValue());
                System.out.println(b);
                break;
            }
       }while(option>=1 && option<4);
       
     
        


    }



}
/*
a. title: A string field to store the title of the book.
b. author: A string field to store the name of the author of the book.
c. publisher: A string field to store the name of the publisher of the book.
d. isbn: A string field to store the ISBN number of the book.
e. year: An integer field to store the year in which the book was published.
f. price: A double field to store the price of the book.
g. quantity: An integer field to store the quantity of the book in the inventory.
*/
class Book {
   private String title;
   private String author;
   private String publisher;
   private String isbn;
   private int year;
   private double price;
   private int quantity;

    {
       quantity=100;
    }



   Book(){
  
      
   }
   //to inncrease quantity 
      public void increaseQuantity(int quantity){
         this.quantity+=quantity;
      }
   //to decrease quantity 
      public void decreaseQuantity(int quantity){
         this.quantity-=quantity;
      }



    //getters
            public String getTitle(){
                  return this.title;
            }
            public String getAuthor(){
                  return this.author;
            }
            public String getPublisher(){
                  return this.publisher;
            }
            public String getIsbn(){
                  return this.isbn;
            }
            public int getYear(){
                  return this.year;
            }
            public double getPrice(){
                  return this.price;
            }
            public int getQuantity(){
                  return this.quantity;
            }
      
        //setters
            public void setTitle(String title){
                this.title=title;
            }
            public void setAuthor(String author){
                this.author=author;
            }
            public void setPublisher(String publisher){
                this.publisher=publisher;
            }
            public void setIsbn(String isbn){
                this.isbn=isbn;
            }
            public void setYear(int year){
                this.year=year;
            }
            public void setPrice(double price){
                this.price=price;
            }
            public void setQuantity(int quantity){
                this.quantity=quantity;
            }


      //getters 
            public String toString(){
            return ("title : "+this.title+"\n"
                                 +"Author : "+this.author+"\n"
                                 +"Publisher : " +this.publisher+"\n"
                                 +"isbn : "+this.year+"\n"
                                 +"year : "+this.price+"\n"
                                 +"price : "+this.quantity+"\n");
            }
 
             public double getInventryValue(){
                return this.price*this.quantity;
             }
     
}
