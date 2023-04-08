package domain;

public class Flight {
    private int flightNo;
    private String name;
    private int totalseats;
    private int avaialbleSeats;
    private User[] reversUsers;
    
    
    
    
	public Flight(int flightNo, String name, int totalseats, int avaialbleSeats) {
		this.flightNo = flightNo;
		this.name = name;
		this.totalseats = totalseats;
		this.avaialbleSeats = avaialbleSeats;
		this.reversUsers= new User[this.avaialbleSeats];
	}
	
	
	public int getFlightNo() {
		return flightNo;
	}


	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTotalseats() {
		return totalseats;
	}


	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}


	public int getAvaialbleSeats() {
		return avaialbleSeats;
	}

	public void setAvaialbleSeats(int avaialbleSeats) {
		this.avaialbleSeats = avaialbleSeats;
	}

    public User[] getReversUsers() {
		return reversUsers;
	}


	public void setReversUsers(User[] reversUsers) {
		this.reversUsers = reversUsers;
	}


	public void addReservedUser(User user) {
    	for(int i=0;i<=this.reversUsers.length;i++) {
    		if(reversUsers[i]==null) {
    			reversUsers[i]=user;
    			this.avaialbleSeats-=1;
    			System.out.println("Ticket Booked");
    			return;
    		}
    	}
    	System.out.println();
    	System.out.println(" !! All seats are already booked !!!");
    	System.out.println();
    }

	public void removeReservedUser(User user) {
    	for(int i=0;i<this.reversUsers.length;i++) {
    		if(reversUsers[i]==user) {
    			reversUsers[i]=null;
    			this.avaialbleSeats+=1;
    			System.out.println("Ticket Cancelled");
    			return;
    		}
    	}
    	System.out.println();
    	System.out.println("You have not booked ticket for this Flight");
    	System.out.println();
    }




	@Override
	public String toString() {
		return "---------------------------------------------\n"+
	           "FlightNo    :" + flightNo +"\n"+ "Name     :" + name+
	           "\n---------------------------------------------";
	}
    
    
}
