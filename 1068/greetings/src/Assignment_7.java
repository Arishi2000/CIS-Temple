


import java.util.*;
import java.io.*;

public class Assignment_7 {	
	
	public static void main(String[] args) throws FileNotFoundException {
		namesBooks = loadBooks("books");
		booksRatings = loadRatings("ratings");
		userInput();
		similarTaste();
		usersAverage();
		recommendedBook();
		
	}
	
	public static int[][] booksRatings;
	
	public static int[][] loadRatings(String loadRatings) throws FileNotFoundException {
		File ratingsFile = new File("/Users/alaagaroot/Desktop/Java/CIS_1068/Assignment_7/src/ratings.txt");
	    Scanner in = new Scanner(ratingsFile);
		int [][] ratings = new int[30][20];
	    int j = 0;
	    while(in.hasNextLine() && j < ratings.length) {
	    	for(int i = 0; i < 20; i++) {
	    		ratings[j][i] = in.nextInt();                    	
	    	}
	        j++;
	    }       	
	    in.close();
		return ratings;
	}
	
	public static String[] namesBooks;

	public static String [] loadBooks(String loadBooks)throws FileNotFoundException {
		File bookFile = new File("/Users/alaagaroot/Desktop/Java/CIS_1068/Assignment_7/src/bookNames.txt");
		Scanner in =  new Scanner(bookFile);
		String[] books = new String [20];
		while (in.hasNextLine()) {
			for (int i = 0; i < books.length; i++) {
				 books [i] = in.nextLine(); 
			}
		}
		in.close();
		return books;
	}
	
	
	public static int[] userInput;
	
	public static void userInput() throws FileNotFoundException {
		String [] books = loadBooks("books");
		userInput = new int[20];
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a rating (between 1 and 5, or -1 "
				+ "if u haven't read it) for each book.\n\n");
		//System.out.println();
		//for (int i)
		//system.ougt
		
		
		for (int i = 0; i < books.length; i++) {
		    System.out.print("\nYour rating for "+ books[i] + " : ");
			//System.out.println();
		    userInput[i] = in.nextInt();
			 if (userInput[i] > 5 || (userInput[i] < 0 && userInput[i] != -1)) {
				 System.out.println("Enter a rating (between 1 and 5, or -1 "
				 		+ "if u haven't read it) \n");
                 i--;
			 } 
		}
		in.close();
	}
	public static void usersAverage() {
		bookRank = new double[namesBooks.length];
	    for (int i = 0; i < namesBooks.length; i++) {
	        //double total = 0.0;
	        for (int j = 0; j < booksRatings.length; j++){
	            if (booksRatings[j][i] != -1) {
	            	bookRank[i] += similar[j] * booksRatings[j][i];
	            	//total += similar[j];
	                //System.out.println(totalWeight);
	            }
	        }
	        bookRank[i] = bookRank[i]; 
	    }
   }
	public static double[] similar;
	
	public static void similarTaste() {
		similar = new double[booksRatings.length];
	       double similarity = 0.0;
	       
	       
	       for (int i = 0; i < namesBooks.length; i++) {
	           if (userInput[i] != -1) {
	        	   similarity += (userInput[i] * userInput[i]);
	           }
	       }
	      /*int simliar[] = 
	    //	while
	       double similarity = 0.0;
	       for (int i = 0; i < namesBooks.length; i++) {
	           if (userInput[i] != -1) {
	        	   similarity += (userInput[i] * userInput[i]);
	    //	for ()*/
	       
	       similarity = Math.sqrt(similarity);
	       for (int i = 0; i < booksRatings.length; i++) {
	           double x = 0.0;
	           double both = 0.0;
	           
	           for (int j = 0; j < namesBooks.length; j++) {
	        	   
	        	   
	               if (booksRatings[i][j] != -1) {
	                   x += (booksRatings[i][j] * booksRatings[i][j]);
	                   
	                   
	                   if (userInput[j] != -1) {
	                       both += booksRatings[i][j] * userInput[j];
	                   }
	               }
	           }
	           x = Math.sqrt(x);
	           similar[i] = both/(similarity * x);
	       }
	}
	public static double [] bookRank;
	public static void recommendedBook() {
	       double maxRatings = -1;
	       
	       
	       int maxIndex = -1;
	       //double maxRatings = -1;
	       //int maxIndex = -1;
	       //for (int i = 0; i <
	       for (int i = 0; i < bookRank.length; i++) {
	           if (maxRatings < bookRank[i] && userInput[i] == -1) {
	               maxIndex = i;	               
	               maxRatings = bookRank[i];	               	               
		       }
	       }	        
	       System.out.println("\nRecommended book is : "+ namesBooks[maxIndex]);
	}
	
}

	