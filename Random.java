package test;
import java.util.Random;

class Square extends Thread{
int a;
Square(int n){

 a = n;
 }
 public void run(){
 int sqr = a * a;
 System.out.println("Square of " + a + " = " + sqr );

 }
}

class Cube extends Thread{
int b;
 Cube(int n){
	 b = n;
	 }
 public void run(){
 int cub = b * b * b;
 System.out.println("Cube of " + b + " = " + cub );
 }
}
class Number extends Thread{
public void run(){
 Random random = new Random();

 for(int i =0; i<5; i++){
 int randomInteger = random.nextInt(100);
 System.out.println("Random Integer generated : " + randomInteger);
 Square s = new Square(randomInteger);
 s.start();
 Cube c = new Cube(randomInteger);
 c.start();
 try
 {
 Thread.sleep(1000);
}
 catch (InterruptedException ex) {
 System.out.println(ex);

}

 }

 }

}

public class Pr1 {
 public static void main(String args[]){
 Number n = new Number();
 n.start();
 }

}
