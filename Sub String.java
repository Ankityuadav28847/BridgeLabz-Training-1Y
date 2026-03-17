import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String sub = createSubstring(text, 1, 5);
        System.out.println("Substring: " + sub);
        
        boolean match = compareStrings(text, sub);
        System.out.println("Built-in substring match: " + match);
        sc.close();
    }
    
    static String createSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < s.length(); i++) {
            result += s.charAt(i);
        }
        return result;
    }
    
    static boolean compareStrings(String a, String b) {
        return a.contains(b);
    }
}
