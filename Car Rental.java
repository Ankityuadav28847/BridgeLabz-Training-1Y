class CarRental {
    String customerName;
    String carModel;
    int days;
    double ratePerDay;
    
    CarRental(String name, String model, int d, double rate) {
        customerName = name;
        carModel = model;
        days = d;
        ratePerDay = rate;
    }
    
    double calculateTotalCost() {
        return days * ratePerDay;
    }
    
    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Days: " + days);
        System.out.printf("Total Cost: $%.2f%n", calculateTotalCost());
    }
}

public class CarRentalDemo {
    public static void main(String[] args) {
        CarRental rental = new CarRental("Bob Wilson", "Toyota Camry", 5, 75.0);
        rental.display();
    }
}
