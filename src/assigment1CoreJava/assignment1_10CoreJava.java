package assigment1CoreJava;

public class assignment1_10CoreJava
{
  public static void printPyramid(int n)
 {
	  System.out.println("  Triangle Array");
	  System.out.println(" ");
          for (int i=0; i<n; i++)
     {
         for (int j=n-i; j>1; j--)
         {
             System.out.print(" ");
         }
         for (int j=0; j<=i; j++ )
         {
             
             System.out.print("0 ");
         }
         System.out.println();
         System.out.println();
     }
 }
  
 public static void main(String args[])
 {
     int n = 10;
     printPyramid(n);
 }
}