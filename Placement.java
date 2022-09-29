package test;
import java.util.*;
// Code written by Altaf Ali
// Find the highest placements in given department
class  Placement{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in Computer science");
        int CSE = sc.nextInt();
        System.out.println("Enter the no of students placed in electrical");
        int ECE = sc.nextInt();
        System.out.println("Enter the no of students placed in Mechanical");
        int MECH = sc.nextInt();
        
        if(CSE==ECE && ECE==MECH && CSE==MECH){
            System.out.println("All  department has got the equal placement");
        }
    	   
        else if (MECH>ECE && MECH>CSE) {
                System.out.println("Highest placement in MECH");
            }
            else if(CSE>MECH && CSE>ECE){
                System.out.println("Highest placement in CSE");
            }
            else if(ECE>MECH && ECE>CSE){
                System.out.println("Highest placement in ECE");
            }
            else if(ECE==MECH){
                System.out.println(" ECE and MECH have equal placement");
            }
            else if(CSE==ECE){
                System.out.println("CSE and ECE have equals placement");
            }
            else if(CSE==MECH){
                System.out.println("CSE and MECH have equal placement");
            }
            }  
    }