package assignment4CoreJava;

import java.util.*;
class assignment4_01CoreJava {
  
    public static void countDuplicateCharacters(String str)
    {
        Map<Character, Integer> map
            = new HashMap<Character, Integer>();
  
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {  
                map.put(c, 1);
            }
        }
  
        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
  
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                                   + " : "
                                   + entry.getValue());
            }
        }
    }

    public static void
    main(String args[])
    {
        String str = "this is my assignment number four underline zero one";
        countDuplicateCharacters(str);
    }
}