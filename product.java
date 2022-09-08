package test;
// program to throw a user defined exception
import java.util.Scanner;

class MyEXception extends Exception {

	public MyEXception(String message) {// constructor 
		super(message);
		
	}
	}
public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight");
	  int weight = sc.nextInt();
	  if (weight <100) {
		  try {
			  throw new MyEXception("Invalid product");
		  }
		  catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
	  }
	  else{
		  System.out.println("Right product");
	  }
	 
}
}
