package ch7java6thedition;
import java.util.ArrayList;
/**
 * 18. Trivia Game
 * 
 * In this programming challenge, you will create a simple trivia game
 * for two players. The program will work like this:
 * 
 * - Starting with player 1, each player gets a turn at answering 5
 *   trivia questions. (There are 10 questions, 5 for each player.)
 *   When a question is displayed, four possible answers are also 
 *   displayed. Only one of the answers is correct, and if the player 
 *   chooses the correct answer, he or she earns a point. 
 * - After answers have been selected for all the questions, the program
 *   displays the number of points earned by each player and declares the
 *   player with the highest number of points the winner.
 * 
 * @author craig
 * 1-21-21
 * 
 */
public class TriviaGame {
	private ArrayList<String> answers= new ArrayList<>(4);
	private int answerNumber;
	private String question;

	public TriviaGame() {

	}

	public void setAnswers(String answer1, String answer2, String answer3, String answer4) {
		answers.add(0, answer1);
		answers.add(1, answer2);
		answers.add(2, answer3);
		answers.add(3, answer4);
	}

	public void setAnswerNumber(int answerNumber) {
		this.answerNumber = answerNumber;
	}

	public void setQuestion(String question) {
		this.question = question;	
	}

	public ArrayList getAnswers() {
		return answers;
	}

	public int getAnswerNumber() {
		return answerNumber;
	}

	public String getQuestion() {
		return question;
	}

	public String toString(int index) {
		return this.getQuestion() + "\n" 
			+ this.getAnswers() + "\n"; 
	}
}
