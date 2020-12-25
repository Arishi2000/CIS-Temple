
package Test;

import java.util.ArrayList;

public class Test {
	
	private ArrayList<Question> question;

	private ArrayList<ObjectiveQuestion> objectiveQuestions;

	private ArrayList<FillInTheBlankQuestion> fillInTheBlankQuestions;

	private ArrayList<MultipleChoiceQuestion> multipleChoiceQuestions;

  
	public Test() {
	
	question = new ArrayList<>();
	objectiveQuestions = new ArrayList<>();
	fillInTheBlankQuestions = new ArrayList<>();
	multipleChoiceQuestions = new ArrayList<>();

	}
  
	public Test(ArrayList<Question> questionTest,
		ArrayList<ObjectiveQuestion> objectiveQuestionsTest, 
		ArrayList<FillInTheBlankQuestion> fillInTheBlankQuestionsTest,
		ArrayList<MultipleChoiceQuestion> multipleChoiceQuestionsTest) {
	
		question = questionTest;
		objectiveQuestions = objectiveQuestionsTest;
		fillInTheBlankQuestions = fillInTheBlankQuestionsTest;
		multipleChoiceQuestions = multipleChoiceQuestionsTest;
	
	}

	public void setQuestion(ArrayList<Question> questionTest) {
		question = questionTest;
	}

	public void setObjectiveQuestions(ArrayList<ObjectiveQuestion> objectiveQuestionsTest) {
		objectiveQuestions = objectiveQuestionsTest;
	}	
	
	public void setFillInTheBlankQuestions(ArrayList<FillInTheBlankQuestion> fillInTheBlankQuestionsTest) {
		fillInTheBlankQuestions = fillInTheBlankQuestionsTest;
	}
	
	public void setMultipleChoiceQuestions(ArrayList<MultipleChoiceQuestion> multipleChoiceQuestionsTest) {
		multipleChoiceQuestions = multipleChoiceQuestionsTest;	
	}

	public ArrayList<Question> getQuestion() {

		return question;
	}
	
	public ArrayList<ObjectiveQuestion> getObjectiveQuestions() {

		return objectiveQuestions;
	}

	public ArrayList<FillInTheBlankQuestion> getFillInTheBlankQuestions() {

		return fillInTheBlankQuestions;
	}
	
	public ArrayList<MultipleChoiceQuestion> getMultipleChoiceQuestions() {
		return multipleChoiceQuestions;
	}
  
	public String toStringQuestions() {
		String testQuestions = "";
		
		for(Question qTest: question) {
			testQuestions = testQuestions + qTest.toString() + "\n";
		}

		for(ObjectiveQuestion objectiveTest: objectiveQuestions) {
			testQuestions = testQuestions + objectiveTest.toStringQ() + "\n";
		}

		for(FillInTheBlankQuestion fillBlankTest: fillInTheBlankQuestions) {
			testQuestions = testQuestions + fillBlankTest.toStringQ() + "\n";
		}
		
		for(MultipleChoiceQuestion multipleChoiceTest: multipleChoiceQuestions) {
			testQuestions = testQuestions + multipleChoiceTest.toStringQ() + "\n";
		}

		return testQuestions;
	}
  
	public String toStringAnswers() {
		String testAnswers = " ";
		for(ObjectiveQuestion objectiveTest: objectiveQuestions) {
			testAnswers = testAnswers + objectiveTest.toStringA()+ "\n\n";
		}
		
		for(FillInTheBlankQuestion fillBlankTest: fillInTheBlankQuestions) {
			testAnswers = testAnswers + fillBlankTest.toStringA()+ "\n";
		}
		
		for(MultipleChoiceQuestion multipleChoiceTest: multipleChoiceQuestions) {
			testAnswers = testAnswers + multipleChoiceTest.toStringA()+ "\n\n";
		}
		
		return testAnswers;
	}
	
	private int total;
	public int totalPoints() {
		total = 0;
		
		for (Question qTest: question) {
			total = total + qTest.getPoints();
		}

		for(ObjectiveQuestion objectiveTest: objectiveQuestions) {
			total = total +  objectiveTest.getPoints();
		}
		
		for(FillInTheBlankQuestion fillBlankTest: fillInTheBlankQuestions) {
			total = total + fillBlankTest.getPoints();
		}
		
		for(MultipleChoiceQuestion multipleChoiceTest: multipleChoiceQuestions) {
			total = total + multipleChoiceTest.getPoints();
		}
		
		return total;
	}
	
	
}