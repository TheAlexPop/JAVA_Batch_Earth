package assignment4CoreJava;

import java.util.TreeSet;
public class assignment4_06CoreJava {
   public static void main(String[] args) {
      TreeSet<Integer> treeSet = new TreeSet<Integer>();
      treeSet.add(1);
      treeSet.add(30);
      treeSet.add(10000);
      treeSet.add(20);
      treeSet.add(60);
      treeSet.add(90);
      treeSet.add(80);
      treeSet.add(40);
      treeSet.add(50);
      treeSet.add(70);
      System.out.println("TreeSet Lowest value = " + treeSet.first());
      System.out.println("TreeSet Highest value = " + treeSet.last());
   }
}