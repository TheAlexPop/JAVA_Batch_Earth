package assignment4CoreJava;

import java.util.*;
public class assignment4_07CoreJava  {

	public static void main(String args[]){
	   ArrayList<String> listofcountries = new ArrayList<String>();
	   listofcountries.add("Denmark");
	   listofcountries.add("Romania");
	   listofcountries.add("Switzerland");
	   listofcountries.add("Belgium");
	   listofcountries.add("Sweden");
	   listofcountries.add("Canada");

	   System.out.println("Before Sorting:");
	   for(String counter: listofcountries){
			System.out.println(counter);
		}

	   Collections.sort(listofcountries);

	   System.out.println("After Sorting:");
	   for(String counter: listofcountries){
			System.out.println(counter);
		}
	}
}