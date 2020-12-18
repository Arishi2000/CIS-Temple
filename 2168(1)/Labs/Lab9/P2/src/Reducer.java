import java.util.HashMap;
import java.util.Map;

public class Reducer {

   public HashMap<String, Integer> reduce(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
      // initializing a new HashMap contains reduced
      HashMap<String, Integer> reduced = new HashMap<>();
      // iterating through the first map
      for (String key : map1.keySet()) {
         int otherCount = 0;
         // checking if map2 contains key then we initialize otherCount to map2.get(key)
         if(map2.containsKey(key))
            otherCount = map2.get(key);
         
         reduced.put(key, map1.get(key) + otherCount);
      }
      // iterating through the second map
      for (String key : map2.keySet()) {
         // checking if map1 does not contains key then we put the key with the key of map2s
         if(!map1.containsKey(key))
            reduced.put(key, map2.get(key));
      }

      return reduced;
   }

   public static void main(String[] args) {

      Mapper mapper1 = new Mapper("tiny1.txt");
      HashMap<String, Integer> map1 = mapper1.getWordcount();
      System.out.println(map1);

      Mapper mapper2 = new Mapper("tiny2.txt");
      HashMap<String, Integer> map2 = mapper2.getWordcount();
      System.out.println(map2);

      HashMap<String, Integer> map = new Reducer().reduce(map1, map2);
      System.out.println(map);
      System.out.println(new Mapper("tinyTale.txt").getWordcount());
   }
}

