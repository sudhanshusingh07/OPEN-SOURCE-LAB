import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        guessingNumberGame();
    }

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random()); // Generate a random number between 1 and 100
        int K = 5; // Number of trials
        int i, guess;

        System.out.println("A number is chosen between 1 to 100.");
        System.out.println("Guess the number within 5 trials.");

        for (i = 0; i < K; i++) {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (number > guess && i != K - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != K - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You have exhausted " + K + " trials.");
            System.out.println("The number was " + number);
        }
    }
}
