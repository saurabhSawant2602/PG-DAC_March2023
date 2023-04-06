import java.util.*;

class TollBooth {

    /*
     * a. vehicleType: A string field to store the type of vehicle.
     * b. numAxles: An integer field to store the number of axles.
     * c. distanceTraveled: A double field to store the distance traveled.
     * d. tollFee: A double field to store the calculated toll fee.
     * e. totalAmountDue: A double field to store the total amount due.
     */

    private String type;
    private int noOfAxles;
    private double distanceTravelled;
    private double tollFee;
    private double totalAmountDue;

    // getters
    public String getType() {
        return this.type;
    }

    public int getNoOfAxles() {
        return this.noOfAxles;
    }

    public double getdistanceTravelled() {
        return this.distanceTravelled;
    }

    public double gettollFee() {
        return this.tollFee;
    }

    public double gettotalAmountDue() {
        return this.totalAmountDue;
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }

    public void setNoOfAxles(int noOfAxles) {
        this.noOfAxles = noOfAxles;
    }

    public void setdistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public void settollFee(double tollFee) {
        this.tollFee = tollFee;
    }

    public void settotalAmountDue(double totalAmountDue) {
        this.totalAmountDue = totalAmountDue;
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter vehicle type  (car, van, bus, or truck)");
        System.out.println("2. Enter number of axles");
        System.out.println("3. Enter distance travelled");
        System.out.println("4. Calculate toll fee");
        System.out.println("5. Generate bill");
        System.out.println("6. Exit");
        return sc.nextInt();
    }

    // calculate the toll fee method
    public void calculateTollFee() {
        if (!this.validateData())
            return;

        String VehicleType = this.type;
        double rate;
        if (VehicleType == "truck") {
            rate = 0.50;
        } else if (VehicleType.equals("car") || VehicleType.equals("van") || VehicleType.equals("bus")
                || VehicleType.equals("truck"))
            rate = 0.25;
        else {
            System.out.println("Invalid Vehicle Type ");
            rate = 0;
            return;
        }

        this.tollFee = this.noOfAxles * rate * this.distanceTravelled;
        this.totalAmountDue = tollFee + 2;
    }

    // Generate bill
    public void generateBill() {
        if (!this.validateData())
            return;

        System.out.println("_______________Toll Booth Bill_____________________");
        System.out.println("Vehicle Type : " + this.type);
        System.out.println("Number of Axles : " + this.noOfAxles);
        System.out.println("Distance Travelled : " + this.distanceTravelled);
        System.out.println("--------------------------------------------------");
        System.out.println(" __Total Fee : " + this.tollFee);
        System.out.println(" __Total Amound due : " + this.totalAmountDue);
        System.out.println("--------------------------------------------------");

    }

    private boolean validateData() {

        if (this.type.equals(null) || this.noOfAxles == 0 || this.distanceTravelled == 0) {
            System.out.println("Vehicle Type , No of Axles and distance travelled by vehicle can't be empty");
            return false;
        }

        return true;

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        TollBooth booth = new TollBooth();
        while ((option = TollBooth.menu()) != 6) {
          
            switch (option) {
                case 1:
                    System.out.println("Enter vehicle type");
                    booth.setType(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Enter number of axles");
                    booth.setNoOfAxles(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter distance travelled");
                    booth.setdistanceTravelled(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Calculating total fee......");
                    booth.calculateTollFee();
                    break;
                case 5:
                    System.out.println("Generating bill");
                    booth.generateBill();
                    break;
            }
           }

        }
    }
