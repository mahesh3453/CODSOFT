import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continueGame = true;
		int totalScore = 0;
		int roundsPlayed = 0;
		int roundsWon = 0;
		
		System.out.println("==== Welcome to Guess The Number Game ====");
		
		while(continueGame) {
			roundsPlayed++;
			int currentRoundScore = playRound(sc);
			totalScore+=currentRoundScore;
			
			if(currentRoundScore > 0) {
				roundsWon++;
			}
			
			System.out.print("\nPlay another round? (y/n): ");
            char option = sc.next().charAt(0);
            
            if(option != 'y' && option != 'Y') {
            		continueGame = false;
            }
		}
		    //Game Summary
		    System.out.println("\n===== Game Summary =====");
        System.out.println("Rounds Played : " + roundsPlayed);
        System.out.println("Rounds Won    : " + roundsWon);
        System.out.println("Total Score   : " + totalScore);

        sc.close();
	}
	
	//Method to play one round
	public static int playRound(Scanner sc) {
		int randomNumber = (int)(Math.random()*100)+1;
		int attempts = 5;
		int tries = 0;
		System.out.println("\nNew Game Started!");
	    System.out.println("Guess the number between 1 and 100.");
	    System.out.println("Maximum attempts: " + attempts);
	    while(tries < attempts) {
	    		System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            tries++;
            if(userGuess == randomNumber) {
            		System.out.println("Nice! You guessed it right.");
            		
            		//Score Calculation
            		return (attempts - tries + 1) * 20;
            }
            
            if (userGuess > randomNumber) {
                System.out.println("Hint: Your guess is higher than the number.");
            } else {
                System.out.println("Hint: Your guess is lower than the number.");
            }
            
            System.out.println("Remaining attempts: " + (attempts - tries));
	    }
	    System.out.println("Round Over! Correct number was: " + randomNumber);
      return 0;
	}
}
