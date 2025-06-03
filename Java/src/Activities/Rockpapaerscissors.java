package Activities;
import java.util.Random;

public class Rockpapaerscissors {

    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        // Randomly select choices
        int playerChoiceIndex = random.nextInt(3);
        int computerChoiceIndex = random.nextInt(3);

        String playerChoice = choices[playerChoiceIndex];
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("Player chooses: " + playerChoice);
        System.out.println("Computer chooses: " + computerChoice);

        // Determine the winner
        if (playerChoiceIndex == computerChoiceIndex) {
            System.out.println("It's a tie!");
        } else if ((playerChoiceIndex == 0 && computerChoiceIndex == 2) || // Rock beats Scissors
                   (playerChoiceIndex == 1 && computerChoiceIndex == 0) || // Paper beats Rock
                   (playerChoiceIndex == 2 && computerChoiceIndex == 1)) { // Scissors beats Paper
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
