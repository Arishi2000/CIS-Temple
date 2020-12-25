

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Random;

public class hangmanGame {
	
	public static final int RAND_MIN = 3;
	public static final int RAND_MAX = 9;
	public static final int MAX_GUESSES = 15;

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> dictionary = new ArrayList<String>();
		
		File dictionaryFile = new File("/Users/alaagaroot/Desktop/Java/CIS_1068/Assignment_10/src/dictionary.txt");
		
		Scanner readFile = new Scanner(dictionaryFile);
		
		while (readFile.hasNextLine()) {
			
			String word = readFile.next();	
			
			dictionary.add(word);
			
		}
		
		
		readFile.close();
		
		
		boolean wordChosen = false;
		
		String choosingWord = "";
		
		String resWord = "";

		Random rand = new Random();

		int randLength = rand.nextInt((RAND_MAX - RAND_MIN) + 1) + RAND_MIN;

		System.out.println("\nThe Length of the word is: " + randLength + " letters\n\n" );
		
		for (int i = 0; i < dictionary.size(); i++) {
			
			if(dictionary.get(i).length()!= randLength) {
				
				dictionary.remove(i);
				
				i = i - 1;
				
			}
			
		}
		
		Scanner in = new Scanner(System.in);

		int countGuess = MAX_GUESSES;

		while(countGuess > 0) {
			
			System.out.println( "\nThe chosen letter is " + wordChosen + ". \n\nFind the true ward below!\n\n");
			//System.out.println(9 % 9);
			//int c = 0;
			for (int word = 0; word < dictionary.size(); word++) {
				
				if (word % 8 == 0 ) {
				System.out.println("\n");

					//System.out.println(word + 1 + " " + dictionary.get(word) + "\n------------");

			}
				System.out.print(" - " + dictionary.get(word));

			}
			countGuess = countGuess - 1 ;
			
			System.out.print( "\n\nPlease enter a letter: " );
			
			String letter = in.nextLine();
			
			if (wordChosen == false) {
				
			int countingSameLetter = 0;
			
				for (int i = 0; i < dictionary.size(); i++) {
					
					if(dictionary.get(i).indexOf(letter.charAt(0)) != -1) {
						
						countingSameLetter = countingSameLetter + 1;
						
					}
					
				}
			
				if(countingSameLetter != dictionary.size()) {
					
					for (int i = 0; i < dictionary.size(); i++) {
						
						if(dictionary.get(i).indexOf(letter.charAt(0)) != -1) {
							
							dictionary.remove(i);
							
							i = i - 1;

						}

					}

				} else {

					choosingWord = dictionary.get(0);
					
					resWord = choosingWord;
					
					wordChosen = true;
					
					choosingWord = choosingWord.replace(letter.charAt(0)+ "","");
					
					if(choosingWord == "") {
							
					System.out.println( "you've cracked the word: " + choosingWord + 	
					" in Guesses:" + (MAX_GUESSES - countGuess));
						
					return;
						
					}
						
				}
				
				
			}  else {
				
				if(choosingWord.length() == 0) {
 
					System.out.println( "you've cracked the word: " + resWord + 		
					" in Guesses:" + (MAX_GUESSES - countGuess));
					return;
				}

			}

		}
		
		System.out.println( "No guesses left,the word is: " + resWord);
		
	}

}