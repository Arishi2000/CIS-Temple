

// This program allows the user to play the two-player game of Havsta.

import java.util.Scanner;
import java.util.Random;

public class Game {
	
	public static final int MIN = 1;
    public static final int MAX = 5;
    public static final int Applaro = 1;
    public static final int Svartra = 2;
    public static final int Tunholmen = 3;
    public static final int Godafton = 4;

	public static void main(String[] args) {
		
		gameRules();
		Random rand = new Random();
		Scanner console = new Scanner(System.in);
		
		System.out.print("\n- Would you like play a round? Enter y or n: ");
		String playGame = console.next();
		
		if (playGame.equals("n")) {
			System.out.println("\nProgram Ends");
		}
		
		while (!playGame.equals("n")) {
			int userMove = 0;
			System.out.print("\nEnter: 1 to choose Applaro.\t" +
					"2 to choose Svartrå.\t" + 
					"3 to choose Tunholmen.\t" + 
					"4 to choose Godafton." + 
					"\n\nPlease Enter a number for your move: ");
			userMove = console.nextInt();
			
			int computerMove = rand.nextInt(MAX-MIN) + MIN;
			
	// Printing Player and computer moves
			
			if (userMove == 1) {
				System.out.println("\nYou chose Applaro"); 
			} if (computerMove == 1) {
				System.out.println("\nComputer chose Applaro");
			} if (userMove == 2) {
				System.out.println("\nYou chose Svartra");
			} if (computerMove == 2) {
				System.out.println("\nComputer chose Svartra");
			} if (userMove == 3) {
				System.out.println("\nYou chose Tunholmen");
			} if (computerMove == 3) {
				System.out.println("\nComputer chose Tunholmen");
			} if (userMove == 4) {
				System.out.println("\nYou chose Godafton");
			} if (computerMove == 4) {
				System.out.println("\nComputer chose Godafton");
			}
			
	// Printing all possibilities

			if (computerMove == Applaro && (userMove == Svartra ||
				userMove == Tunholmen)) {
				System.out.println("\nApplaro beats Svartrå and Tunholmen");
				System.out.print("\nComputer wins\n\n");
				
			} else if (userMove == Applaro && (computerMove == Svartra ||
				computerMove == Tunholmen)) {
				System.out.println("\nApplaro beats Svartrå and Tunholmen");
				System.out.print("\nYou won!\n\n");
				
			} else if (computerMove == Svartra && (userMove == Tunholmen)) {
				System.out.println("\nSvartrå beats Tunholmen");
				System.out.print("\nComputer wins\n\n");
				
			} else if (userMove == Svartra && (computerMove == Tunholmen)) {
				System.out.println("\nSvartrå beats Tunholmen");
				System.out.print("\nYou won!\n\n");
				
			} else if (computerMove == Tunholmen && (userMove == Godafton)) {
				System.out.println("\nTunholmen beats Godafton");
				System.out.print("\nComputer wins\n\n");
				
			} else if (userMove == Tunholmen && (computerMove == Godafton)) {
				System.out.println("\nTunholmen beats Godafton");
				System.out.print("\nYou won!\n\n");
				
			} else if (computerMove == Godafton && (userMove == Applaro ||
				userMove == Svartra)) {
				System.out.println("\nGodafton beats Applaro and Svartrå");
				System.out.print("\nComputer wins\n\n");
				
			} else if (userMove == Godafton && (computerMove == Applaro ||
				computerMove == Svartra)) {
				System.out.println("\nGodafton beats Applaro and Svartrå");
				System.out.print("\nYou won!\n\n");
				
			} else if (computerMove == userMove) {
				System.out.println("\nThe computer wins in the event of a tie");
				System.out.print("\nComputer wins\n\n");
			}
			
			System.out.print("- Would you like to play another round? ");
			playGame = console.next();
			if (playGame.equals("n")) {
			System.out.println("\nProgram Ends");
			console.close();

		}
				
		}
		
	}
		
	
	
	// Game Rules
	
	public static void gameRules() {
		
		System.out.println("\n*** RULES ***\n" + 
				"\n* Applaro beats Svartrå and Tunholmen\n" + 
				"* Svartrå beats Tunholmen\n" + 
				"* Tunholmen beats Godafton\n" + 
				"* Godafton beats Applaro and Svartrå\n" + 
				"* The computer wins in the event of a tie\n");	
		
	}
	
}
