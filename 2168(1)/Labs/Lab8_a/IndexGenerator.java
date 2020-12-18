import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class IndexGenerator {

   // Tree that stores the index
   private final TreeSet<String> index;

   // Constructor
   public IndexGenerator() { index = new TreeSet<>(); }

   // Reads each word in the input file and store it
   // in an index along with its line number.
   public void buildTree(Scanner scanner) {
      int lineNum = 0;  // line number
      StringTokenizer st;
      String token;
      // while scanner still has another line to read,
      //   increment the line number;
      //   create a StringTokenizer object with the current line as input
      //   while the StringTokenizer still has more tokens to process,
      //      get that token
      //      add that token concatenated with the current line number to index

      while(scanner.hasNextLine()){ //run till scanner has next line
         lineNum++;     //increment line num
         st = new StringTokenizer(scanner.nextLine()); //Create new string tokenizer
         //allows to break strings into tokens
         //tokens are keywords, identifiers, constants, special symbols, operators
         while (st.hasMoreTokens()) { //has more tokens
            token = st.nextToken(); //get that token
            index.add(String.format("%-17s %s", token, lineNum)); //add it to its index
         }
      }
   }

   // Perform an inorder traversal of the tree
   // and display its nodes to the standard output
   public void showIndex() {
      for(String s:index)
         System.out.println(s);
      // TreeSet will be inorder traversed by default, so simply use the enhanced for loop here to
      // loop through the index tree and print each element.
   }

   public static void main(String[] args) throws FileNotFoundException {

      Scanner scanner = new Scanner(new FileInputStream("tinyTale.txt"));
      // uncomment the following line when you are ready to read the larger file
      // Scanner scanner = new Scanner(new FileInputStream("tale.txt"));

      // The following while loop simply reads the input file and
      // displays each line of the file on your screen. Once you've
      // ensured that this program can read the input correctly, you
      // can DELETE OR COMMENT OUT the while loop on the next line.
      while (scanner.hasNextLine()) System.out.println(scanner.nextLine());


      // Once you've implemented and tested the methods in IndexGenerator,
      // the following lines will produce output (initially they don't do anything).
      Scanner scan = new Scanner(new FileInputStream("tinyTale.txt"));

      IndexGenerator index = new IndexGenerator();
      // a new IndexGenerator instance

      index.buildTree(scan);
      // build a binary search tree

      index.showIndex();
      // display the tree nodes
   }
}