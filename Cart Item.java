import java.util.Scanner;
import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;
    
    CartItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }
    
    double getTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();
    
    void addItem(String name, double price, int qty) {
        items.add(new CartItem(name, price, qty));
    }
    
    void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        }
    }
    
    double getTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotal();
        }
        return total;
    }
    
    void display() {
        System.out.println("Shopping Cart:");
        for (int i = 0; i < items.size(); i++) {
            CartItem item = items.get(i);
            System.out.printf("%d. %s - $%.2f x %d = $%.2f%n", 
                i+1, item.itemName, item.price, item.quantity, item.getTotal());
        }
        System.out.printf("Total Cost: $%.2f%n", getTotalCost());
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        
        cart.addItem("Laptop", 999.99, 1);
        cart.addItem("Mouse", 25.50, 2);
        
        cart.display();
        sc.close();
    }
}
