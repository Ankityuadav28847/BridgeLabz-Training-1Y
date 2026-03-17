import java.util.Scanner;

public class UppercaseASC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String upper = toUpper(text);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + toLower(upper));
        sc.close();
    }
    
    static String toUpper(String s) {
        return s.toUpperCase();
    }
    
    static String toLower(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
