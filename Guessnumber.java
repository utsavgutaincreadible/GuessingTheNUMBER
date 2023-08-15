import java.util.Scanner;

public class GuessNumber {

	// number guessing game
	public static void
	guessingNumberGame()
	{
		try (Scanner sc = new Scanner(System.in)) {
			// Generate the numbers
			int number = 1 + (int)(100* Math.random());

			int K = 5;

			int N, guess;

			System.out.println("Enter any number between 1 to 100");
				
			System.out.println("Guess the number within 5 trials");
			   
			System.out.println("****************");
			int k=5;

			for (N = 0; N < K; N++) {

				System.out.println(
					"Guess the number:");

				// Take input for guessing
				guess = sc.nextInt();

				// If the number is guessed
				if (number == guess) {
					System.out.println(
						"Congratulations!"
						+ " You guessed the number.");
						break;

				}
				else if (number > guess
						&& N != K - 1) {
					System.out.println(
						"The number is "
						+ "greater than " + guess);
				}
				else if (number < guess
						&& N != K - 1) {
					System.out.println(
						"The number is"
						+ " less than " + guess);
				}
			}

			if (N == K) {
				System.out.println(
					"You have exhausted"
					+ " 5 trials.");

				System.out.println(
					"The number was " + number);
			}
		}
	}

	public static void
	main(String arg[])
	{

		// Function Call
		guessingNumberGame();
	}
}
