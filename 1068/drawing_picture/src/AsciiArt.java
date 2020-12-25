

public class AsciiArt {

    public static final int SIZE = 10;
    public static final String LETTER = "I";
    public static final String BLANK = ".";
    
        
	public static void main(String[] args) {

		line();
		upperPart();
		upperPart();
		bottomPart();
		upperPart();
		bottomPart();
		bottomPart();
		line();

	}
	
	// Drawing line using doubly nested loop
	
	public static void line() {	
		System.out.print("I");
		for (int x = 0; x == (SIZE - SIZE); x++) {
			for (int y = 0; y == x; y++) {
				for (int z = 0; z <= (5 * SIZE + 4); z++) {
					System.out.print("I");
				}
				
			}
			
			System.out.println("I");
		}
		
	}
	
	// Drawing the upper part of the structure using nested loop.
	
	public static void upperPart() {
		for (int x = 0; x <= SIZE ; x++) {
			System.out.print("I");
			for (int y = 0; y <= x + SIZE; y++) {
				System.out.print(LETTER);
			}
			for (int z = 0 ; z <= SIZE; z++) {
				System.out.print(BLANK);
			}

			for (int z = SIZE; z >= x; z--) {
				System.out.print(BLANK);
			}
			
			for (int z = SIZE; z >= x; z--) {
				System.out.print(BLANK);
			}
			
			for (int k = 0; k <= x + SIZE; k++) {
				System.out.print(LETTER);
			}
			
			System.out.println("I");
			
		}
		
	}
	
	// Drawing the bottom part of the structure using nested loop.
	
	public static void bottomPart() {
		for (int x = SIZE; x >= 0; x--) {
			System.out.print("I");
			for (int y = 0; y <= x + SIZE ; y++) {
				System.out.print(LETTER);
			}
			for (int z = 0 ; z <= SIZE; z++) {
				System.out.print(BLANK);
			}

			for (int z = SIZE ; z >= x; z--) {
				System.out.print(BLANK);
			}
			
			for (int z = SIZE ; z >= x; z--) {
				System.out.print(BLANK);
			}
			
			for (int k = 0; k <= x + SIZE; k++) {
				System.out.print(LETTER);
			}
			
			System.out.println("I");
				
		}
		
	}
	
}
