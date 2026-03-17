class HotelRoom {
    String roomType;
    int nights;
    double pricePerNight;
    
    HotelRoom(String type, int n, double price) {
        roomType = type;
        nights = n;
        pricePerNight = price;
    }
    
    double getTotalCost() {
        return nights * pricePerNight;
    }
    
    void display() {
        System.out.println("Room: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.printf("Total Cost: $%.2f%n", getTotalCost());
    }
}

public class HotelDemo {
    public static void main(String[] args) {
        HotelRoom room = new HotelRoom("Deluxe", 3, 150.0);
        room.display();
    }
}
