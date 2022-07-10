package assignment2CoreJava;

import java.util.Scanner;  
public class assignment2_04CoreJava   
{  
public static void main(String args[])  
{  
int number, digit, sum = 0;  
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = sc.nextInt();  
while(number > 0)  
{  
  
digit = number % 10;  
sum = sum + digit;  
number = number / 10;  
}  
 
System.out.println("Sum of Digits: "+sum);  
}  
}  