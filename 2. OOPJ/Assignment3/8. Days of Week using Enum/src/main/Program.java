package main;

enum DayOfWeek{
	SUNDAY(1,"sunday") , MONDAY(2,"Monday") ,TUESDAY(3,"Tuesday") ,WEDNESDAY (4,"Wednesday"), THURSDAY(5,"Thursday") , FRIDAY(6,"Friday") , SATURDAY(7,"Saturday");
	
	private String dayString;
	private int dayNumber;
	private DayOfWeek( int dayNumber,String dayString) {
		this.dayString=dayString;
		this.dayNumber=dayNumber;
	}
	
	

	public String getDayString() {
		return dayString;
	}



	public void setDayString(String dayString) {
		this.dayString = dayString;
	}



	public int getDayNumber() {
		return dayNumber;
	}



	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}


    // method to print day of the week
	public void printday(DayOfWeek day ) {
		System.out.println(day.name());
	}
	
	//method to get next day of the week
	public static DayOfWeek getNextday(DayOfWeek day) {
		int num= day.ordinal();
		return (DayOfWeek.values()[(num+1)%7]);
	}
	
	
	
	// method returns array of weekend days
	public static DayOfWeek[] getWeekends() {
		return new DayOfWeek[] {(DayOfWeek.values()[0]),(DayOfWeek.values()[6])};
		
		
	}
	
	
}


public class Program {
	public static void main(String[] args) {
		// initialization of the variable in enum
		DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
		
		//print the day
		System.out.println("Day of the week :");
		dayOfWeek.printday(dayOfWeek);
		
		
		
		
		//get the next day and print it to the console
		System.out.println("Next day :");
		DayOfWeek nextDayOfWeek =DayOfWeek.getNextday(dayOfWeek);
		nextDayOfWeek.printday(nextDayOfWeek);
		
		// get the number of weekday and print to the console
		System.out.println("Number of weekday :");
		int dayNum=dayOfWeek.getDayNumber();
		System.out.println(dayNum);
		
		//getting weekend days
		DayOfWeek[] weekdays= DayOfWeek.getWeekends();
		
	}
  
  
}
