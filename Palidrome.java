package test;

	import java.util.Scanner;
	// check given string palidrome or not
public class Palidrome{
	   public static void main(String args[]) {
	      String str;
	       String rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a word:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 // here the condition the enterded word is palidrome or not
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println("entered word is a palindrome");
	      else
	         System.out.println("enterded word is not a palindrome");
	 
	   }
	}
	