import java.util.Scanner;
// display the cube of given numbers
public class Cube {
    public static void main(String[] args) {

        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Number is: " + i + " and cube of "  + i + " is: " + (i*i*i));
        }
    }
}
