package assignment2CoreJava;

import java.util.Scanner;
class assignment2_05CoreJava
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");

      @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);

      num = in.nextInt();

      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of input number is: "+reversenum);
   }
}