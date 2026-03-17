import java.util.Scanner;

public class StringIndexOutOfBounds {
    public static void main(String[] args) {
        try {
            throwIndexOut();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }
    
    static void throwIndexOut() {
        String s = "Hello";
        char c = s.charAt(10);
    }
}
