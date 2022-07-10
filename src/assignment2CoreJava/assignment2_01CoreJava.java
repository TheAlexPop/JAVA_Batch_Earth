package assignment2CoreJava;

public class assignment2_01CoreJava {


public static void main(String[] args) {
    double[] arr = {12.1,13,17,15.1,14.6};
    double total = 0;

    for(int i=0; i<arr.length; i++){
    	total = total + arr[i];
    }


    double average = total / arr.length;
    
    System.out.format("The average is: %.2f", average);
}
}