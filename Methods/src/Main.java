public class Main {
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your final score was " + highScore);

		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		System.out.println("\nChallenge!: \n");

		//Create a method called displayHighScorePosition
		//it should a players name as a parameter, and a 2nd parameter as a position in the high score table
		//You should display the players name along with a message like " managed to get into position " and the position they got
		//and a further message " on the high score table".
		//
		//Create a 2nd method called calculateHighScorePosition
		//it should be sent one argument only, the player score
		//it should return an int
		// the return data should be
		// 1 if the score is > 1000
		// 2 if the score is > 500 and < 1000
		// 3 if the score is > 100 and < 500
		// 4 in all other cases
		// call both methods and display the results of the following
		// a score of 1500, 900, 400, and 50

		int position = calculateHighScorePosition(1001);
		displayHighScorePosition("Andrea", position);

		position = calculateHighScorePosition(777);
		displayHighScorePosition("Samuel", position);

		position = calculateHighScorePosition(222);
		displayHighScorePosition("Sofia", position);

		position = calculateHighScorePosition(88);
		displayHighScorePosition("Matias", position);
	}

	public static void displayHighScorePosition(String playersName, int position) {
		System.out.println(playersName + " managed to get into position " + position + " on the high score table");
	}

	public static int calculateHighScorePosition(int score) {
		if(score >= 1000) {
			return 1;
		} else if (score >= 500) {
			return 2;
		} else if (score >= 100) {
			return 3;
		} else return 4;
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
}
