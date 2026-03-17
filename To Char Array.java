import java.util.Scanner;

public class ToCharArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        boolean result = compareCharArrays(text);
        System.out.println("Char arrays equal: " + result);
        
        char[] chars = text.toCharArray();
        System.out.println("toCharArray(): " + new String(chars));
        sc.close();
    }
    
    static boolean compareCharArrays(String s) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = s.toCharArray();
        return java.util.Arrays.equals(arr1, arr2);
    }
}
