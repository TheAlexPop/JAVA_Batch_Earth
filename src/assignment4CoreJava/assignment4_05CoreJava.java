package assignment4CoreJava;

import java.util.*;
public class assignment4_05CoreJava {
   public static void main(String args[]) {
      Set<Integer> hs = new HashSet<Integer>();
      hs.add(31);
      hs.add(24);
      hs.add(16);
      hs.add(21);
      hs.add(10);

      System.out.println("Elements in set = "+hs);
      System.out.println("Copying all elements...");
      Object[] obArr = hs.toArray();
      for (Object ob : obArr)
      System.out.println(ob);
   }
}