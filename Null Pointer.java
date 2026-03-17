import java.util.scanner;
public class NullPointerDemo {
    public static void main(String[] args) {
        String text = null;
        try {
            accessNull(text);
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }
    
    static void accessNull(String s) {
        int len = s.length();
    }
}
