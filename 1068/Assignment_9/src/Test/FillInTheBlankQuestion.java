

package Test;

public class FillInTheBlankQuestion extends Question {
	
	private String correctAnswer;

	public FillInTheBlankQuestion(int qPoints, int qDifficulty, 
			int qAnswerSpace, String qText, String qCorrectAnswer) {
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
		String blank = "";
	
		for(int i = 0; i < super.getAnswerSpace(); i++) {
			blank = blank + "_";
		}
		return ("Please write your answer in the following blank" + 
		"\n\n Question points: " + super.getPoints() + "\n Question difficulty: "  
				+ super.getDifficulty() + "\n\n\n\n" + blank
				+ super.getQuestionText() + " " + " \n\n\n\n");
	}
	  
	public String toStringA() {
		return ("\n"+ "____" + getCorrectAnswer() + "____ " + super.getQuestionText() + "\n\n\n\n");
	}
	
}
