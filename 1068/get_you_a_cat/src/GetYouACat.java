
// This program prints statements.

public class GetYouACat {

	public static void main(String[] args) {
		
		verseOne();
		catSound();
		verseTwo();
		henSound();
		verseThree();
		duckSound();
		verseFour();
		gooseSound();	
		verseFive();
		sheepSound();
		verseSix();
		wolfSound();

	}
		
	// Printing Verse One
	public static void verseOne() {
		
		System.out.println("Bought me a cat and the cat pleased me,");
		System.out.println("I fed my cat under yonder tree.");
		
	}
	
	// Printing Verse Two
	public static void verseTwo() {
		
		System.out.println("Bought me a hen and the hen pleased me,");
		System.out.println("I fed my hen under yonder tree.");
		
	}
	
	// Printing Verse Three
	public static void verseThree() {
		
		System.out.println("Bought me a duck and the duck pleased me,");
		System.out.println("I fed my duck under yonder tree.");

	}
	
	// Printing Verse Four
	public static void verseFour() {
		
		System.out.println("Bought me a goose and the goose pleased me,");
		System.out.println("I fed my goose under yonder tree.");
		
	}
	
	// Printing Verse Five
	public static void verseFive() {
		
		System.out.println("Bought me a sheep and the sheep pleased me,");
		System.out.println("I fed my sheep under yonder tree.");
		
	}
	
	// Printing Verse Six
	public static void verseSix() {
		System.out.println("Bought me a wolf and the wolf pleased me,");
		System.out.println("I fed my wolf under yonder tree.");

	}

	
	// Printing Cat Sound
	public static void catSound() {
			
		System.out.println("Cat goes fiddle-i-fee.");
		System.out.println();
	
	}
	
	// Printing Hen Sound
	public static void henSound() {
		
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
		catSound();
	}
	
	// Printing Duck Sound
	public static void duckSound() {
		
		System.out.println("Duck goes quack, quack,");
		henSound();		
		
	}
	
	// Printing Goose Sound
	public static void gooseSound() {
		
		System.out.println("Goose goes hissy, hissy,");
		duckSound();
		
	}

	// Printing Sheep Sound
	public static void sheepSound() {
		
		System.out.println("Sheep goes baa, baa,");
		gooseSound();

	}
	
	// Printing Wolf Sound
	public static void wolfSound() {
			
		System.out.println("Wolf goes howl, howl,");
		sheepSound();
			
	}
	
}
