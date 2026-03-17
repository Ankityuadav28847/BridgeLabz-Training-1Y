import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        try {
            accessLargeIndex();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBounds: " + e);
        }
    }
    
    static void accessLargeIndex() {
        int[] arr = new int[5];
        arr[10] = 100;
    }
}
