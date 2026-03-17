import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        String trimmed = trimString(text);
        System.out.println("Trimmed: '" + trimmed + "'");
        sc.close();
    }
    
    static String trimString(String s) {
        int start = 0, end = s.length();
        while (start < end && s.charAt(start) == ' ') start++;
        while (start < end && s.charAt(end-1) == ' ') end--;
        return s.substring(start, end);
    }
}
