package assignment3CoreJava;

class assignment3_06CoreJava{  
	   void method1() throws ArithmeticException{  
		throw new ArithmeticException("Calculation error"); 
	   }  
	   void method2() throws ArithmeticException{  
		method1();  
	   }  
	   void method3(){  
		try{  
		   method2();  
		}
		catch(ArithmeticException e){
		   System.out.println("ArithmeticException successfully handled");
		}  
	   }  
	   public static void main(String args[]){  
		assignment3_06CoreJava obj=new assignment3_06CoreJava();  
		obj.method3();  
		System.out.println("This is the end");  
	   }  
	}