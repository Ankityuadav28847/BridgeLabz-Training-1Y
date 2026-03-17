import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String input = sc.nextLine();
        try {
            int num = parseNumber(input);
            System.out.println("Parsed: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
        sc.close();
    }
    
    static int parseNumber(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}
