class Item {
    String itemCode;
    String itemName;
    int price;
    int quantity;
    
    Item(String code, String name, int p, int q) {
        itemCode = code;
        itemName = name;
        price = p;
        quantity = q;
    }
    
    void displayDetails() {
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Cost: $%d%n", price * quantity);
    }
}

public class InventoryDemo {
    public static void main(String[] args) {
        Item item = new Item("IT001", "Laptop", 999, 10);
        item.displayDetails();
    }
}
