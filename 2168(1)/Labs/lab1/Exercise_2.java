import java.net.*;
import java.io.*;

/**  This class provides a main function to read five lines of a company
 *   Web page and prints them in reverse order, given the name of a company.
 */

class Exercise_2 {

  //   Prompts the user for the name X of a company (a single string), opens
//   the Web site corresponding to www.X.com, and prints the first five lines
//   of the Web page in reverse order.
  public static void main(String[] arg) throws Exception {

    BufferedReader keyoabrd;
    String inputLine;

    keyoabrd = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        // Make sure the line is printed immediately. 
    inputLine = keyoabrd.readLine();

    // YOUR CODE HERE

    String webName = "https://www."+inputLine+".com";
    URL url = new URL(webName);

    BufferedReader BR = new BufferedReader(new InputStreamReader(url.openStream()));

    int total_lines = 4;
    String store_v[]= new String[5];

    while (total_lines>=0) // to store the lines retrieved in string array above
    {
      store_v[total_lines]= BR.readLine(); // the lines in store_v array in reverse indexing that is
      total_lines-=1;
    }
    int lines = 0;

    //printing the withdrawn lines that are stored in reversed order in store_v array

    while (lines<5)
    {
      System.out.println(store_v[lines]);
      lines+=1;
    }
  }
  }

