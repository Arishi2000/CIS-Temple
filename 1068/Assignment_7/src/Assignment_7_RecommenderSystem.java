import java.util.*;
import java.io.*;

public class Assignment_7_RecommenderSystem {
	public static double[] similarity;
	public static int[] UserInput;
	public static String[] Names;
	public static int[][] Ratings;
	public static double [] rank;

	public static void main(String[] args) throws FileNotFoundException {
		
		Names = books("books");
		Ratings = getRatings("ratings");
		gettinginput();
		getSimilar();
		weightedaverage();
		RecommendedBook();
		
	}
	
	public static String [] books(String string)throws FileNotFoundException {
		Scanner in1 =  new Scanner(new File("/Users/alaagaroot/Desktop/Java/CIS_1068/Assignment_7/src/bookNames.txt"));
		
		String[] books = new String [20];
		
		while (in1.hasNextLine())
			
		{
			for (int i = 0; i < books.length; i++)
			{
				 books [i] = in1.nextLine(); 
			}
		}
		in1.close();
		return books;
	}
	
	public static int[][] getRatings(String fileName) throws FileNotFoundException {

		int [][] ratings = new int[30][20];

	    Scanner scan = new Scanner(new File("/Users/alaagaroot/Desktop/Java/CIS_1068/Assignment_7/src/ratings.txt"));
	    int j=0;
	    while(scan.hasNextLine() && j < ratings.length)
	    {
	    	for(int i=0; i < 20; i++)
	        {
	    		ratings[j][i] = scan.nextInt();

	    	}
	        j++;
	    }       	
			scan.close();
			
		return ratings;
	}

	public static void gettinginput() throws FileNotFoundException {
		int[]UserInput = new int[20];
		String [] books = books("books");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a rating (between 1 and 5, or -1 if u haven't read it) for each book.\n");
		System.out.println();

		for (int i = 0; i < books.length; i++) {
		    System.out.print("Enter ratings for "+ books[i] + " : ");
			System.out.println();
			UserInput[i] = sc.nextInt();
			
			 if (UserInput[i] > 5 || (UserInput[i] < 0 && UserInput[i] != -1)) {
				 System.out.println("Enter a rating (between 1 and 5, or -1 if u haven't read it) \n");
                 i--;
			 } 
		}
		sc.close();
	}
	

	public static void getSimilar() {
		similarity = new double[Ratings.length];
		      
	       double homeboy = 0.0;
	       for (int i = 0; i < Names.length; i++) {
	           if (UserInput[i] != -1) {
	               homeboy += (UserInput[i] * UserInput[i]);
	           }
	       }
	       homeboy = Math.sqrt(homeboy);

	       for (int i=0; i<Ratings.length; i++) {
	           double ext = 0.0;
	           double both = 0.0;
	          
	           for (int j=0; j < Names.length; j++) {
	               if (Ratings[i][j] != -1) {
	                   ext += (Ratings[i][j] * Ratings[i][j]);
	                  
	                   if (UserInput[j] != -1) {
	                       both += Ratings[i][j] * UserInput[j];
	                   }
	               }
	           }
	           ext = Math.sqrt(ext);
	           similarity[i] = both/(homeboy * ext);
	       }
	}

	public static void RecommendedBook() {
	       double maxRatings = -1;
	       int maxIndex = -1;
	       for (int i = 0; i < rank.length; i++) {
	           if (maxRatings < rank[i] && UserInput[i] == -1) {
	               maxIndex = i;	               
	               maxRatings = rank[i];	               	               
		       }
	       }	        
	       System.out.println("Recommended book is : "+ Names[maxIndex]);
	}
	public static void weightedaverage() {
		rank = new double[Names.length];
	    for (int i = 0; i < Names.length; i++) {
	        double totalWeight = 0.0;
	        for (int j = 0; j < Ratings.length; j++){
	            if (Ratings[j][i] != -1) {
	            	rank[i] += similarity[j] * Ratings[j][i];
	                totalWeight += similarity[j];
	            }
	        }
	        rank[i] = rank[i]; 
	    }
	   }
	
	
	
	

}
