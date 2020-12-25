
package Test;

public class MultipleChoiceQuestion extends Question {
	
	private String [] possibleAnswers;
	private String correctAnswer;
	
	public MultipleChoiceQuestion(int qPoints, int qDifficulty, int qAnswerSpace, String qText, 
			String [] qPossibleAnswers, String qCorrectAnswers) {
		super(qPoints, qDifficulty, qAnswerSpace, qText);
		possibleAnswers = qPossibleAnswers;
		correctAnswer = qCorrectAnswers;
	}
	
	public void setCorrectAnswer(String qCorrectAnswer) {
		correctAnswer = qCorrectAnswer;

	}
	
	public void setPossibleAnswers(String [] qPossibleAnswers) {
		possibleAnswers = qPossibleAnswers;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public String [] getPossibleAnswers() {
		return possibleAnswers;
	}
	
	public String toStringQ() {
		
		String s = " ";
		String chooseAnswers = "";
		int index = 0;
		
		for(String opt: getPossibleAnswers()) {
		chooseAnswers = chooseAnswers + (++index) + ". " + opt + "\n";
		}
	  
		for(int i = 0; i < super.getAnswerSpace(); i++) {
			s = "-";
		}
	  
		return (super.getQuestionText()
				+"\n\n Question points: " + super.getPoints() + 
				"\n Question difficulty: " + super.getDifficulty()
				+ "\n\n\n" + chooseAnswers + "\n" + s);
	}
	  
	public String toStringA() {
		String options = "";
		int index = 0;
		
		for(String opt: getPossibleAnswers()) {
			if(opt.equals(getCorrectAnswer())) {
				options += (++index) + ". **** " + opt + " ****" + "\n";
			}
			else {
				options += (++index) + ". " + opt + "\n";
			}
		}
	  
	return (super.getQuestionText() + "\n" + options);
	
	}

}
