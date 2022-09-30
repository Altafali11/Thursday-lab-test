package test;
import java.util.Scanner;
// Code written by Altaf Ali
// Program to search course  
public class CourseSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Course: ");
		int noOfCourse = sc.nextInt();
		String[] courseName = new String[noOfCourse];
		
		if(noOfCourse <= 0) {
			System.out.println("Invalid Range");
		}
		else{
			System.out.print("Enter Name of Courses: ");
			for(int i = 0; i < noOfCourse; i++) {
				courseName[i] = sc.next();
			}
			
			String s ="";
			for(String n : courseName) {
				s += n;
			}
			char[] c = s.toCharArray();
			

			System.out.print("Enter the Course to be Searched: ");
			String searchCourse = sc.next();
			
			if(new String(c).contains(searchCourse)){
				System.out.println(searchCourse+" is available");
			}
			else {
				System.out.println(searchCourse+" is not available");
			}
		}

	}
}
