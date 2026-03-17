import java.util.Scanner;

public class WordLengths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = splitIntoWords(text);
        int[] lengths = getWordLengths(words);
        
        System.out.println("Shortest: " + findShortest(words, lengths));
        System.out.println("Longest: " + findLongest(words, lengths));
        sc.close();
    }
    
    static String[] splitIntoWords(String s) {
        return s.split("\\s+");
    }
    
    static int[] getWordLengths(String[] words) {
        int[] lengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            lengths[i] = words[i].length();
        }
        return lengths;
    }
    
    static String findShortest(String[] words, int[] lengths) {
        int minIdx = 0;
        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] < lengths[minIdx]) minIdx = i;
        }
        return words[minIdx];
    }
    
    static String findLongest(String[] words, int[] lengths) {
        int maxIdx = 0;
        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] > lengths[maxIdx]) maxIdx = i;
        }
        return words[maxIdx];
    }
}
