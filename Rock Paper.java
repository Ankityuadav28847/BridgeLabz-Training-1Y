import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int userWins = 0, computerWins = 0, totalGames = 5;
        
        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter (1=Rock, 2=Paper, 3=Scissors): ");
            int user = sc.nextInt();
            int computer = rand.nextInt(3) + 1;
            
            String result = getWinner(user, computer);
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) computerWins++;
            System.out.println("Computer chose: " + computer + ", Result: " + result);
        }
        
        System.out.println("User wins: " + userWins + "/" + totalGames);
        System.out.println("Computer wins: " + computerWins + "/" + totalGames);
        System.out.println("Winner: " + getOverallWinner(userWins, computerWins));
        sc.close();
    }
    
    static String getWinner(int user, int computer) {
        if (user == computer) return "Tie";
        if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) 
            return "User";
        return "Computer";
    }
    
    static String getOverallWinner(int user, int comp) {
        if (user > comp) return "User";
        if (comp > user) return "Computer";
        return "Tie";
    }
}
