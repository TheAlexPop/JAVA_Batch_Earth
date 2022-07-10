package assignment4CoreJava;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class assignment4_04CoreJava {
   public static void main(String args[]){
      Map<Integer, String> myMap = new HashMap<>();
      myMap.put(1, "Marco van Basten");
      myMap.put(2, "Tomas Brolin");
      myMap.put(3, "Alessandro Melli");
      myMap.put(4, "Luc Nilis");

      ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
      ArrayList<String> valueList = new ArrayList<String>(myMap.values());

      System.out.println("contents of the list holding keys the map :"+keyList);
      System.out.println("contents of the list holding values of the map :"+valueList);
   }
}