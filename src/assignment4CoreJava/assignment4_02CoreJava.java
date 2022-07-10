package assignment4CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class assignment4_02CoreJava {  
    public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("Romania");  
        l.add("Canada");  
        l.add("Belgium");  
        l.add("Switzerland"); 
        l.add("Sweden"); 
        l.add("Denmark"); 
        System.out.println("Before Reversing");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  
    }  
}  