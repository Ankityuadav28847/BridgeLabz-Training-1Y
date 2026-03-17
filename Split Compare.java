import java.util.Scanner;

public class SplitCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] manualSplit = manualSplit(text);
        String[] builtInSplit = text.split("\\s+");
        
        System.out.println("Manual split words: " + manualSplit.length);
        System.out.println("Built-in split words: " + builtInSplit.length);
        sc.close();
    }
    
    static String[] manualSplit(String s) {
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') wordCount++;
        }
        return new String[wordCount];
    }
}
