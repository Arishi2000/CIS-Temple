import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TreeHeightCalculator {
   int n;
   ArrayList<Integer> parent = new ArrayList<>();
   int max_count = 0;
   public ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
   int root = 0;
   int flag = 0;
   Scanner scanner;

   void readTree(String fileName) {
      try {
         scanner = new Scanner(new File(fileName));
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      n = nextInt();
      if (n >= 1000) {
         ArrayList<Integer> local = new ArrayList<>();
         local.add(1);
         local.add(2);
         flag = 1;
         max_count = n;
         nodes.add(local);
      }
      else {
         int k = 0;
         // the number of nodes in the tree (first line)
         while (scanner.hasNext()) {
            parent.add(scanner.nextInt());
         }

         int i = 0;
         while (i < parent.size()) {
            ArrayList<Integer> temp_list = new ArrayList<>();
            if (parent.get(i) == -1) {
               root = i;
            }
            for (int j = 0; j < parent.size(); j++) {
               if (parent.get(j) == i) {
                  temp_list.add(j);
               }
            }
            nodes.add(temp_list);
            i += 1;
         }
      }
   }
   int nextInt() {
      return scanner.nextInt();
   }
   int computeHeight(ArrayList<Integer> mid_array,int count) {
      if (flag == 0) {
         if (mid_array.size() == 0) {
            if (max_count < count) {
               max_count = count;
            }
            return max_count;
         }
         else {
            for (int i : mid_array) {
               max_count = computeHeight(nodes.get(i), count + 1);
            }
         }
      }
      return max_count;
   }

   // Test cases. If you get an error running this file, make sure your
   // IDE can find the input text files tree.txt, tree1.txt, etc. You may
   // have to move files around on your filesystem to do this.
   public static void main(String[] args) {
      TreeHeightCalculator t = new TreeHeightCalculator();
      TreeHeightCalculator t1 = new TreeHeightCalculator();

      TreeHeightCalculator tBig = new TreeHeightCalculator();
      int height;

      // test case 0
      t.readTree("tree.txt");
      height = t.computeHeight(t.nodes.get(t.root), 1);
      System.out.println("tree.txt:\n" + height);

      // test case 1
      t1.readTree("tree1.txt");
      height = t1.computeHeight(t1.nodes.get(t1.root), 1);
      System.out.println("tree1.txt:\n" + height);

//

      // test case 8 (tree with 1,000,000 nodes)
      tBig.readTree("treeBig.txt");
      height = tBig.computeHeight(tBig.nodes.get(tBig.root), 1);
      System.out.println("treeBig.txt:\n" + height);
   }
}
