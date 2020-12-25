

package Test;

import java.util.ArrayList;

public class Driver {
  
	public static void main(String[] args){
		
		ObjectiveQuestion objectiveQuestion = new ObjectiveQuestion(
				10, 6, 3, "How much wood would a woodchuck chuck if a woodchuck "
						+ "could chuck wood?", "Wood");
		
		ObjectiveQuestion objectiveQuestion2 = new ObjectiveQuestion (10, 4, 3,
				"How many times Italy won the world Cup? ", "4 times");
  
		ObjectiveQuestion objectiveQuestion3 = new ObjectiveQuestion (10, 9, 4,
				"what is the current population of the world", "7.53 billion");
		
		FillInTheBlankQuestion fillBlank = new FillInTheBlankQuestion(10, 4, 7, 
				" was the 16th US President.", "Abraham Lincoln");
		
		FillInTheBlankQuestion fillBlank2 = new FillInTheBlankQuestion(8, 4, 7, 
				" won its first World Cup title, defeating Netherlands in the "
				+ "final of the 2010 tournament", "Spain");
		
		FillInTheBlankQuestion fillBlank3 = new FillInTheBlankQuestion(20, 4, 7, 
				" m / s is the speed of light", "299 792 458");
  
		String[] possibleAnswers = {"Peter Griffin", "Scooby Doo", 
				"Spongebob Squarepants", "Eric Cartman"};
  
		MultipleChoiceQuestion multipleChoice = new MultipleChoiceQuestion(
			10, 5, 4, "Who lives in a pineapple under the sea", 
			possibleAnswers, "Spongebob Squarepants");
		
		String[] possibleAnswers2 = {"Steve Jobs", "Mark Zuckerberg", 
				"Bill Gates", "Donald Trump"};
		
		MultipleChoiceQuestion multipleChoice2 = new MultipleChoiceQuestion(
				10, 5, 4, "The CEO of Apple company who died in 2010", 
				possibleAnswers2, "Steve Jobs");
		
		String[] possibleAnswers3 = {"June 29, 2010", "Nov 05, 2012", 
				"Feb 14, 1998", "June 29, 2007"};
		
		MultipleChoiceQuestion multipleChoice3 = new MultipleChoiceQuestion(
				12, 5, 4, "The first iPhone was released in ", 
				possibleAnswers3, "June 29, 2007");
 
		ArrayList<Question> questionTest = new ArrayList<>();
		
		ArrayList<ObjectiveQuestion> objictiveTest = new ArrayList<>();
		
		ArrayList<FillInTheBlankQuestion> fillBlankTest = new ArrayList<>();
		
		ArrayList<MultipleChoiceQuestion> multipleChoiceTest = new ArrayList<>();
		
		objictiveTest.add(objectiveQuestion);
		objictiveTest.add(objectiveQuestion2);
		objictiveTest.add(objectiveQuestion3);
		
		fillBlankTest.add(fillBlank);
		fillBlankTest.add(fillBlank2);
		fillBlankTest.add(fillBlank3);

		multipleChoiceTest.add(multipleChoice);
		multipleChoiceTest.add(multipleChoice2);
		multipleChoiceTest.add(multipleChoice3);

  
		Test test = new Test(questionTest, objictiveTest, fillBlankTest, multipleChoiceTest);
		System.out.println("\nTest \n\nTotal Points: " + test.totalPoints() + 
				"\n\nPlease answer the following questions:\n");
		System.out.println(test.toStringQuestions() + "\n\nAnswers key\n\n\n" + 
				test.toStringAnswers() + "\n");
	}
	
}