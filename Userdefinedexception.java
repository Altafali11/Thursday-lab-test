package test;
// code written by altaf ali
// program to deposit and withdraw money 
import java.util.Scanner;

class UserDefinedException  extends Exception{
    public UserDefinedException(String message) {// constructor
        super(message);
    }
}
public class Myaccount {
	public static int balance(int balance) {
	return balance;
	}
   public static  int deposit (int d) {
	return balance(1000)+d;
   }

    public static void main(String[] args) {
    	  System.out.println("enter the amount TO Deposit");
     Scanner sc = new Scanner(System.in);
     int d = sc.nextInt();
 	Myaccount ma  = new Myaccount();
	ma.deposit(d);
	System.out.println("available balance is " + deposit(d));
     System.out.println("enter the amount TO Withdraw");
     
     int n = sc.nextInt();
     try {
         if (balance(1000) < n) {
             throw new UserDefinedException("Insufficient fund");
         } else {
             System.out.println("transaction succesfull");
         }
     }
         catch(UserDefinedException ud){
             System.out.println(ud);
     }
    }
}

