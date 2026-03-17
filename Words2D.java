import java.util.Scanner;

public class Words2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = manualSplitWords(text);
        int[] lengths = getManualLengths(words);
        
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " (" + lengths[i] + ")");
        }
        sc.close();
    }
    
    static String[] manualSplitWords(String s) {
        java.util.ArrayList<String> words = new java.util.ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word = new StringBuilder();
                }
            } else {
                word.append(s.charAt(i));
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }
    
    static int[] getManualLengths(String[] words) {
        int[] lengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            try {
                while (words[i].charAt(count) != '\0') count++;
            } catch (StringIndexOutOfBoundsException e) {
                lengths[i] = count;
            }
        }
        return lengths;
    }
}
