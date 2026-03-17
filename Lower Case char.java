import java.util.Scanner;

public class LowercaseChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String lower = toLowerChar(text);
        System.out.println("Lowercase: " + lower);
        System.out.println("Compare result: " + compareStrings(text, lower));
        sc.close();
    }
    
    static String toLowerChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
    
    static boolean compareStrings(String s1, String s2) {
        return s1.toLowerCase().equals(s2.toLowerCase());
    }
}
