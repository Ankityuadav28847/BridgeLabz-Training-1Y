class PalindromeChecker {
    String text;
    
    PalindromeChecker(String t) {
        text = t.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    }
    
    boolean checkPalindrome() {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome: " + checkPalindrome());
    }
}

public class PalindromeDemo {
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("A man a plan a canal Panama");
        p.displayResult();
    }
}
