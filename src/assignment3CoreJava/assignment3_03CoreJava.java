package assignment3CoreJava;

class assignment3_03CoreJava {
	  public static void main(String[] args) {
	    // create a string
	    String txt = "A brown fox ran away fast";
	    String str1 = "brown";

	    boolean result = txt.contains(str1);
	    if(result) {
	      System.out.println(str1 + " is present in the string" + " '" + txt + "'");
	    }
	    else {
	      System.out.println(str1 + " is not present in the string" + " '" + txt + "'");
	    }
	  }
	}