package assigment1CoreJava;

import java.util.Scanner;
public class assignment1_04CoreJava {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year: ");
      try (Scanner sc = new Scanner(System.in)) {
		year = sc.nextInt();
	}
      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("It is a leap year");
      else
         System.out.println("It is not a leap year");
   }
}