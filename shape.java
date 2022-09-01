abstract class shape{
	private String color;
	private boolean filled;
	public  shape(){
		this.color = "green" ;
		this.filled= true;
	  }
	public shape(String color,boolean filled) {
		this.color= color;
		this.filled= true;
	}
	
	 public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return color+ filled;
	}
	public abstract double getArea(); 
		
	}
		 

class Circle1 extends shape{ 
	
	public double getArea() {
		return 0;
		
	}
	}
class Rectangle1 extends shape{
	int length;
	int width;
	Rectangle1(int length,int width){
		this.length= length;
		this.width= width;
	}
	public double getArea()	{
		return 0;
	}
}
 class Square1 extends Rectangle1{
	Square1(){
		super(5,5);
		
	}
 }
public class Thursday_test {

	public static void main(String[] args) {
	//  shape sp  = new shape(); //gives error because we cannot create object of abstclass without inherit subclass from it 
       Square1 sq = new Square1();
       if(sq.length==sq.width) {
    	   System.out.println("the rectangle class is square");
       }
	}
}

