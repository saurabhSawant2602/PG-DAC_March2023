import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Assignment1 {
 public static void main(String[] args) throws Exception{
    Scanner sc= new Scanner(System.in);
    
    //Date formatting 
    SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy");
    System.out.println("Enter the date (dd/MM/yyyy):");
    String strDate=sc.nextLine();
      Date date=    sdf.parse(strDate);
   
      SimpleDateFormat sdf1 = new SimpleDateFormat( "dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat( "MM/dd/yyyy");
    SimpleDateFormat sdf3 = new SimpleDateFormat( "yyyy/MM/dd");
 
    String strDate1 = sdf1.format(date);
    String strDate2 = sdf2.format(date);
    String strDate3 = sdf3.format(date);

    //Time formatting 
    System.out.println("Enter time Hours , mins , secs");
    int hour=sc.nextInt();
    int mins=sc.nextInt();
    int secs=sc.nextInt();
    LocalTime time= LocalTime.of(hour,mins,secs);

     DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("hh:mm:ss");
     DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("hh:mm:ss a");
     DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("hh:mm");


    //date format
    
    System.out.println( "dd/MM/yyyy "+strDate1 );
    System.out.println( "MM/dd/yyyy "+strDate2 );
    System.out.println( "yyyy/MM/dd "+strDate3 );
    System.out.println();
  


   //time format
    System.out.println( "hh:mm:ss"+dtf1.format(time));
    System.out.println( "hh:mm:ss a"+dtf2.format(time));
    System.out.println( "hh:mm "+dtf3.format(time));



    //Date time formatting
    System.out.println();
    System.out.println("Time Date Format ");
    System.out.println( "dd/MM/yyyy hh:mm:ss"+" "+strDate1+" "+dtf1.format(time));
    System.out.println("MM/dd/yyyy hh:mm:ss a" +" "+strDate2+" "+dtf2.format(time));
    System.out.println( "yyyy/MM/dd hh:mm"+strDate3+" "+dtf3.format(time));
 }
}