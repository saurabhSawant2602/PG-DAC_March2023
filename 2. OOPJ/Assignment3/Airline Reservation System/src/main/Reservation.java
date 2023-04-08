package main;

import java.util.Scanner;

import domain.Flight;
import domain.User;



public class Reservation {
	static Scanner sc= new Scanner(System.in);
       Flight[] flightsArr;
       
       public Reservation() {
		this.flightsArr= new Flight[] {
				 new Flight(1, "Mumbai To Delhi", 10, 10), 
				 new Flight(2,  "Mumbai To Goa", 20, 20), 
				 new Flight(3,  "Delhi To Dubai", 20, 20), 
				 new Flight(4,  "Bengaluru To Delhi", 10, 10), 
				 new Flight(5,  "Bangkok To Delhi", 120, 120), 
				 new Flight(6,  "Mumbai To Singapore", 120, 120), 
				 new Flight(7,  "Singapore To Delhi", 120, 120), 
				 new Flight(8,  "Singapore To Mumbai", 120, 120), 
				 new Flight(9,  "Bankok To Mumbai", 120, 120)
			
		};
	    }
       public void showAllAvaiableSeats() {
    	   for(Flight flight : this.flightsArr) {
    		   System.out.println(flight.getFlightNo()+"    Flight name : "+flight.getName() +"    Avaialble Seat : "+ flight.getAvaialbleSeats() );
    	   }
       }
       
       
       public void showAllFlights() {
    	   System.out.println("Flights Scheduled :");
   		    for(Flight flight: this.flightsArr) {
   			System.out.println(flight);
   		    }
       }
       
       public void reserveSeat(User user , int flightNo) {
          Flight flight = findFlight(flightNo);
           // if flight not found 
           if(flight==null)   return;
          
    	   if(flight.getAvaialbleSeats()==0) {
    		   System.out.println("All seats are booked !!!!!!");
    		   return;
    	   }
    	   if(this.hasNotTicket(user , flight))
    	   flight.addReservedUser(user);
    	   
    	   
    	   
    	   
       }
       public boolean hasNotTicket(User user, Flight flight) {
    	for(User eleUser:flight.getReversUsers()) {
    		if(eleUser==user) {
    			if(eleUser==user) {
    				System.out.println("You already have ticket , want to get ticket again ?");
    				System.out.println("Enter 1 for yes ");
    				System.out.println("Enter any to No");
    				if(sc.nextInt()!=1) {
    					return false;
    				}
    			}
    		}
    	}
    	   
    	 return true;  
    	   
       }
       public void unreserveSeat(User user , int flightNo) {
           Flight flight = findFlight(flightNo);
            // if flight not found 
            if(this.findFlight(flightNo)==null)   return;
           
     	   flight.removeReservedUser(user);
     	   
     	   
     	   
     	   
        }
       
       
       public Flight findFlight(int flightNo) {
    	   for(Flight flight : flightsArr) {
    		   if(flight.getFlightNo()==flightNo) {
    			  return flight;
    		   }
    	   }
    	   System.out.println("flight not found");
    	   return null;
    	   
    	   
       }
       
       
       public void flightsByUser(User user) {
    	   if(flightsArr.length<0) return;
    	   for(Flight flight: flightsArr) {
    		   for(User FlightUser: flight.getReversUsers()) {
    			  if(FlightUser==user) {
    				  System.out.println(flight);
    			  }
    		   }
    	   }
       }
       
      
       
      
       
}
