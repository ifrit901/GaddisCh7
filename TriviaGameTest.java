package ch7java6thedition;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * This program tests the TriviaGame class.
 * 
 * @author craig
 * 1-25-21
 * 5:50am
 * 
 */
public class TriviaGameTest {
	public static void main(String[]args) {
		int answerNumber;
		int player1Total = 0;
		int player2Total = 0;

		TriviaGame tg1 = new TriviaGame();
		TriviaGame tg2 = new TriviaGame();
		TriviaGame tg3 = new TriviaGame();
		TriviaGame tg4 = new TriviaGame();
		TriviaGame tg5 = new TriviaGame();
		TriviaGame tg6 = new TriviaGame();
		TriviaGame tg7 = new TriviaGame();
		TriviaGame tg8 = new TriviaGame();
		TriviaGame tg9 = new TriviaGame();
		TriviaGame tg10 = new TriviaGame();

		// Put all the objects in an ArrayList so they can be looped
		ArrayList<TriviaGame>quizQuestionsPlayer1 = new ArrayList<>(5);
		ArrayList<TriviaGame>quizQuestionsPlayer2 = new ArrayList<>(5);

		// Question object 1
		tg1.setQuestion("What is the capital of Tennessee?");
		tg1.setAnswers("1 = Memphis", "2 = Knoxville", "3 = Nashville", "4 = Jackson");
		tg1.setAnswerNumber(2);
		quizQuestionsPlayer1.add(tg1);

		// Question object 2
		tg2.setQuestion("What is the capital of Illinois?");
		tg2.setAnswers("1 = Peoria", "2 = Springfield", "3 = Rockford", "4 = Chicago");
		tg2.setAnswerNumber(2);
		quizQuestionsPlayer1.add(tg2);

		// Question object 3
		tg3.setQuestion("What is the capital of Colorado?");
		tg3.setAnswers("1 = Denver", "2 = Aspen", "3 = Boulder", "4 = Colorado Springs");
		tg3.setAnswerNumber(1);
		quizQuestionsPlayer1.add(tg3);
		
		// Question object 4
		tg4.setQuestion("What is the capital of Texas?");
		tg4.setAnswers("1 = Houston", "2 = Dallas", "3 = Fort Worth", "4 = Austin");
		tg4.setAnswerNumber(4);
		quizQuestionsPlayer1.add(tg4);

		// Question object 5
		tg5.setQuestion("What is the capital of California?");
		tg5.setAnswers("1 = Los Angeles", "2 = San Fransisco", "3 = Sacramento", "4 = Oakland");
		tg5.setAnswerNumber(3);
		quizQuestionsPlayer1.add(tg5);

		// Question object 6
		tg6.setQuestion("What is the capital of North Dakota?");
		tg6.setAnswers("1 = Bismark", "2 = Fargo", "3 = Minot", "4 = Williston");
		tg6.setAnswerNumber(1);
		quizQuestionsPlayer2.add(tg6);

		// Question object 7
		tg7.setQuestion("What is the capital of Oaklahoma?");
		tg7.setAnswers("1 = Tulsa", "2 = Edmond", "3 = Broken Arrow", "4 = Oaklahoma City");
		tg7.setAnswerNumber(4);
		quizQuestionsPlayer2.add(tg7);

		// Question object 8
		tg8.setQuestion("What is the capital of Florida?");
		tg8.setAnswers("1 = Jacksonville", "2 = Tallahassee", "3 = Miami", "4 = Pensacola");
		tg8.setAnswerNumber(1);
		quizQuestionsPlayer2.add(tg8);

		// Question object 9
		tg9.setQuestion("What is the capital of Mississippi?");
		tg9.setAnswers("1 = Jackson", "2 = Hattiesburg", "3 = Tupelo", "4 = Oxford");
		tg9.setAnswerNumber(1);
		quizQuestionsPlayer2.add(tg9);

		// Question object 10
		tg10.setQuestion("What is the capital of Virginia?");
		tg10.setAnswers("1 = Norfolk", "2 = Roanoke", "3 = Alexandria", "4 = Richmond");
		tg10.setAnswerNumber(4);
		quizQuestionsPlayer2.add(tg10);

		
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < quizQuestionsPlayer1.size(); i++) {
			System.out.println(quizQuestionsPlayer1.get(i).getQuestion());
			System.out.println(quizQuestionsPlayer1.get(i).getAnswers());
			answerNumber = input.nextInt();
			

			if(answerNumber == quizQuestionsPlayer1.get(i).getAnswerNumber()) {
				System.out.println("That's correct!");
				player1Total += 1;
			}
			else
				System.out.println("Sorry, that's incorrect :(");
		}

		System.out.println("Now it's Player 2's turn.");

		for(int i = 0; i < quizQuestionsPlayer2.size(); i++) {
			System.out.println(quizQuestionsPlayer2.get(i).getQuestion());
			System.out.println(quizQuestionsPlayer2.get(i).getAnswers());
			answerNumber = input.nextInt();

			if(answerNumber == quizQuestionsPlayer2.get(i).getAnswerNumber()) {
				System.out.println("That's correct!");
				player2Total += 1;
			}
			else
				System.out.println("Sorry, that's incorrect :(");
		}

		if(player1Total > player2Total) {
			System.out.println("Player 1 total: " + player1Total);
			System.out.println("Player 2 total: " + player2Total);
			System.out.println("Player 1 wins!");
		}
		else if(player2Total > player1Total) {
			System.out.println("Player 1 total: " + player1Total);
			System.out.println("Player 2 total: " + player2Total);
			System.out.println("Player 2 wins!");
		}
		else if(player2Total == player1Total) {
			System.out.println("Player 1 total: " + player1Total);
			System.out.println("Player 2 total: " + player2Total);
			System.out.println("It's a tie!");
		}
		else
			System.out.println("Something went wrong...");
	}		
}
