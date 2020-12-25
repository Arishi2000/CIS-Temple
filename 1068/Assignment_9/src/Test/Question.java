

package Test;

public class Question {
	
	private static final int MIN_DIFFICULTY = 1;
	private static final int MAX_DIFFICULTY = 10;
	
	private int points;
	private int difficulty ;
	private int answerSpace;
	private String questionText;

	public Question(int qPoints, int qDifficulty, int qAnswerSpace, String qText) {
		
		points = qPoints;
		difficulty = qDifficulty;
		answerSpace = qAnswerSpace;
		questionText = qText;
		
		if (difficulty < MIN_DIFFICULTY || difficulty > MAX_DIFFICULTY) {
			System.out.println("\nDifficulty should be between" + MIN_DIFFICULTY + " and " + MAX_DIFFICULTY);
		
		}
		
		else {
			difficulty = qDifficulty;

		}
		
	}
	
	public void setPoints(int qPoints) {
		points = qPoints;
	}
	
	public void setDifficulty(int qDifficulty) {
		difficulty = qDifficulty;
	}

	public void setAnswerSpace(int qAnswerSpace) {
		answerSpace = qAnswerSpace;
	}
	
	public void setQuestionText(String qText) {
		questionText = qText;
	}
	
	public int getPoints() {
		return points;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public int getAnswerSpace() {
		return answerSpace;
	}
	
	public String getQuestionText() {
		return questionText;
	}
	
	public String toString() {
		
		String blank = " ";
		for(int i = 0; i < getAnswerSpace(); i++) {
		blank = "\n\n";
		}
		return (getQuestionText() + "\n\n Question points: " + getPoints() + ",\n Question difficulty: " + getDifficulty()
		+ " " + "\n\n\n" + blank);
		
	}
	
	
}
