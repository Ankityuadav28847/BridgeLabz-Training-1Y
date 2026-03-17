class MobilePhone {
    String brand;
    String model;
    double price;
    
    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }
    
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: $%.2f%n", price);
    }
}

public class MobilePhoneDemo {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S23", 899.99);
        phone.displayDetails();
    }
}
