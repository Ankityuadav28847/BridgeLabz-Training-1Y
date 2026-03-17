import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] ages = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age for student " + (i+1) + ": ");
            int age = sc.nextInt();
            ages[i][0] = age;
            ages[i][1] = validateAge(age) ? 1 : 0;
        }
        
        System.out.println("Valid ages:");
        for (int i = 0; i < n; i++) {
            if (ages[i][1] == 1) {
                System.out.println("Student " + (i+1) + ": " + ages[i][0]);
            }
        }
        sc.close();
    }
    
    static boolean validateAge(int age) {
        return age >= 18;
    }
}
