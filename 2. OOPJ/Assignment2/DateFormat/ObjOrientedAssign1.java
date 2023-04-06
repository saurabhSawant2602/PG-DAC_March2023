import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormat{

        static Date date= new Date();
        static Scanner sc= new Scanner(System.in);


        static void acceptFormatDate() throws Exception{
                        SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy");
                        System.out.println("Enter the date (dd/MM/yyyy):");
                        String strDate=sc.nextLine();
                        date= sdf.parse(strDate);
                }

                static String printFormatDate(String format){
                SimpleDateFormat sdf1 = new SimpleDateFormat(format);
                    return  sdf1.format(date);
                }

            
}
class TimeFormat{
    static int hour;
    static int mins;
    static int secs;
    static LocalTime time;


    static void AcceptInputs(){
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter time Hours , mins , secs");
            hour=sc.nextInt();
            mins=sc.nextInt();
            secs=sc.nextInt();
            time = LocalTime.of(hour,mins,secs);
    }Orin


   static String displayFormat(String format){
    
            DateTimeFormatter dtf1=DateTimeFormatter.ofPattern(format);
            return time.format(dtf1);
    }

}

public class ObjOrientedAssign1 {
 public static void main(String[] args) throws Exception{
    //Date formatting 
                    DateFormat.acceptFormatDate();
                    System.out.println("All date formats :");
                    System.out.println(DateFormat.printFormatDate("dd/MM/yyyy"));
                    System.out.println(DateFormat.printFormatDate("MM/dd/yyyy"));
                    System.out.println(DateFormat.printFormatDate("yyyy/MM/dd"));
                     System.out.println();    

    //Time formatting 
                    TimeFormat.AcceptInputs();
                    System.out.println("All time formats :");
                    System.out.println(TimeFormat.displayFormat("hh:mm:ss"));
                    System.out.println(TimeFormat.displayFormat("hh:mm:ss a"));
                    System.out.println(TimeFormat.displayFormat("hh:mm "));
                    System.out.println();           

    //Date Time format 
                    System.out.println(DateFormat.printFormatDate("dd/MM/yyyy") +" "+TimeFormat.displayFormat("hh:mm:ss"));
                    System.out.println(DateFormat.printFormatDate("MM/dd/yyyy") +" "+TimeFormat.displayFormat("hh:mm:ss a"));
                    System.out.println(DateFormat.printFormatDate("dd/MM/yyyy") +" "+TimeFormat.displayFormat("hh:mm "));

                   
                  
 }
}


