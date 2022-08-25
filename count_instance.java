package test;

// total no of instance 
public class Circle {
      public int radius;
      public float center;
      static int count;
  // creating a  constructor    
     public Circle() {
     System.out.println("i am non circle constructor");   
     }	
    // creating a constructor with given  parameter 
	public Circle(int r,float c) {
		this.radius=r;
		this.center=c;
		count++;
		
	}	
	// creating a method 
 	public void show() {
		System.out.println(+center+radius);
	     count++;
	}

	public static void main(String[] args) {
		Circle c = new Circle(55,45f);
		Circle c1= new Circle(25,55f);
		c.show();
		c1.show();
		Circle c2 = new Circle();
		System.out.println("total no of instance"+Circle.count);
		
	}
     
}
