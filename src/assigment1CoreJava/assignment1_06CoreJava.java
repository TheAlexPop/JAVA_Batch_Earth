package assigment1CoreJava;

import java.util.Scanner;
class assignment1_06CoreJava {
	
   private static Scanner scanner;

public static void main(String args[]) {   
      scanner = new Scanner(System.in);

      System.out.println("Enter the width of the triangle: ");
      double base = scanner.nextDouble();

      System.out.println("Enter the height of the triangle: ");
      double height = scanner.nextDouble();

      double area = (base* height)/2;
      System.out.println("Area of Triangle is: " + area);      
   }
}