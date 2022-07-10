package assignment3CoreJava;

public class assignment3_05CoreJava {
    public static void main(String args[]) {
        try {
            int a = Integer.parseInt("1a");
            System.out.println(a);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input");
        }
        System.out.println("Execution continues...");
    }
}