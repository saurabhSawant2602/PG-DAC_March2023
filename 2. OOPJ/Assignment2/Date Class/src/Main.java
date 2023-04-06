import java.util.*;
class Date{
    private int date;
    private int month;
    private int year;
    private int[] noOfDays = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    Date(int date , int month , int year){
        this.date=date;
        this.month=month;
        this.year=year;
        this.noOfDays[1]=this.isLeapYear()? 29: 28;
       
    }
    public boolean isValid(){
        if(this.isValidDate() || this.isValidMonth()) return true;
        return false;
       
    }

    public boolean isValidDate(){
        if(this.noOfDays[month-1]<this.date) return false;
        return true;
    }



    public boolean isValidMonth(){
        if(month>0 && month<=12)  return true;
        else return false;
    }
    public boolean isLeapYear(){
        if(year % 100==0 && year%400==0)  return true;
        else if (year%4==0) return true;
        else return false;
    }


    public Date getNextDate(){
        int nextDate;
        int nextMonth;
        int nextYear;
           if(this.date==this.noOfDays[this.month-1]){
            nextDate=1;
            nextMonth=this.month+1;
            nextYear=this.year;
                if(nextMonth==13){
                   nextYear=this.year+1;
                    nextMonth=1;
                }
                
                return new Date(nextDate, nextMonth, nextYear);
            }
        return new Date(this.date+1, this.month, this.year);

     }

    public Date getPreviousDate(){
        int previousDate;
        int previousMonth;
        int previousYear;
        if(this.date==1){
            previousMonth=this.month-1;
            previousDate=(previousMonth>1)?this.noOfDays[this.month-2]:this.noOfDays[11];
            previousYear=this.year;
            if(previousMonth==0){
                previousMonth=12;
                  previousYear=this.year-1;
            }
            return new Date(previousDate, previousMonth, previousYear);
        }
        return new Date(this.date-1, this.month, this.year);

     }



     public String toString(){
        return this.date+"-"+this.month+"-"+this.year;
     }
}

class Main{
    public static void main(String[] args){

        // date added int dd/mm/yyyy format in constructor
        Date date= new Date(31,11,2024);
        //check the date
        System.out.println(date);
             
        //check if date is valid 
         System.out.println(date.isValid());
        //check if leap year
        System.out.println(date.isLeapYear());

        //get next date
        System.out.println(date.getNextDate());

        //get previous date
        System.out.println(date.getPreviousDate());
    }
}
