package assignment4CoreJava;

import java.util.*;

public class assignment4_03CoreJava {
    public static void main(String[] args)
    {
        HashMap<Integer, String>
            map = new HashMap<>();
  
        map.put(1, "Varadero");
        map.put(2, "Cancun");
        map.put(null, "Montreal");
  
        int keyToBeChecked = 2;
        System.out.println("HashMap: " + map);
        boolean isKeyPresent = map.containsKey(keyToBeChecked);
        System.out.println("Does key "
                           + keyToBeChecked
                           + " exists: "
                           + isKeyPresent);
    }
}