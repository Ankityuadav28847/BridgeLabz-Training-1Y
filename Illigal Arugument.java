import java.util.scanner;
public class IllegalArgument {
    public static void main(String[] args) {
        try {
            validateIndex(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
    
    static void validateIndex(int idx) {
        if (idx < 0 || idx > 10) {
            throw new IllegalArgumentException("Index out of bounds: " + idx);
        }
        System.out.println("Valid index: " + idx);
    }
}
