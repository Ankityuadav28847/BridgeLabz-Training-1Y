import java.util.Scanner;

public class StringEqualsCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();
        
        boolean equal = compareStrings(s1, s2);
        System.out.println("Strings equal: " + equal);
        
        if (s1.length() > 0) {
            char firstChar = s1.charAt(0);
            System.out.println("First char of s1: " + firstChar);
        }
        sc.close();
    }
    
    static boolean compareStrings(String a, String b) {
        return a.equals(b);
    }
}
