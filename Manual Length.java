import java.util.Scanner;

public class ManualLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        
        int manualLen = getManualLength(s);
        int builtInLen = s.length();
        
        System.out.println("Manual length: " + manualLen);
        System.out.println("Built-in length: " + builtInLen);
        sc.close();
    }
    
    static int getManualLength(String s) {
        int count = 0;
        try {
            while (s.charAt(count) != '\0') count++;
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
        return 0;
    }
}
