package assigment1CoreJava;

public class assignment1_05CoreJava {
 
		public static void main(String[] args)   
		{  
		int ct=0,n=0,i=1,j=1;  
		while(n<10)  
		{  
		j=1;  
		ct=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		ct++;  
		j++;   
		}  
		if(ct==2)  
		{  
		System.out.printf("%d ",i);  
		n++;  
		}  
		i++;  
		}  
		}  
		}  
