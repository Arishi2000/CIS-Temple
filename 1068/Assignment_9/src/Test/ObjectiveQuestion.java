
// Instructor: Dodge Hill
// Assignment 9, Test Papers Assignment.

package Test;

public class ObjectiveQuestion extends Question {
	
	private String correctAnswer;

	public ObjectiveQuestion(int qPoints, int qDifficulty, int qAnswerSpace, String qText, String qCorrectAnswer) {
		super(qPoints, qDifficulty, qAnswerSpace, qText);
		correctAnswer = qCorrectAnswer;
		
	}
	
	public void setCorrectAnswer(String qCorrectAnswer) {
		correctAnswer = qCorrectAnswer;

	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public String toStringQ() {
		String blank = " ";
		for(int i = 0; i < super.getAnswerSpace(); i++) {
		blank = "\n                 \n\n";
		}
		return (super.getQuestionText()
		+ "\n\n Question points: " + super.getPoints() + "\n Question difficulty: " + super.getDifficulty()
		+ "\n" + blank + "\n");
	}
	  
	public String toStringA() {
		return (super.getQuestionText()+  "\nCorrect answer: " + 
		getCorrectAnswer() + "\n\n");
	}
	
}
