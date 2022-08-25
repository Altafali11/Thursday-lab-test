package test;
 class Student{
	private String name;
	protected int id;
	double grade;
	
	public void setName(String n){
		this.name = n;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public Boolean IsPassed(double grade){
		return null;
	}
}
class Undergrad extends Student{
	public Boolean IsPassed(double grade){
		if(grade<60.0)
			return true;
		return false;
	}
}
class Grad extends Student{
	public Boolean isPassed(double grade){
		if(grade<=75.0)
			return true;
		return false;
	}
}

public class test{
	public static void main(String args[]){
		// undergrad student
		Undergrad ug = new Undergrad();
		ug.setName("Sam");
		ug.setId(19);
		ug.grade = 60.0;
		System.out.println("An undergrade student  NAME : " +ug.getName());
		System.out.println("ID :" + ug.getId()) ;
		System.out.println("Grade:" + ug.grade);
		if(ug.IsPassed(ug.grade))
			System.out.println("You passed this test");
		else
			System.out.println("work hard for next time");


		// Grad student
		Grad g = new Grad();
		g.setName("Altaf Ali");
		g.setId(18);
		g.grade=76.8;
		System.out.println("A Grade student  NAME : " +g.getName());
		System.out.println("ID :" + g.getId()) ;
		System.out.println("Grade:" + g.grade);
		if(ug.IsPassed(ug.grade))
			System.out.println("You passed this test with distinction");	
		else
			System.out.println("paased with distinction");
	}
}         
		



	
	
	
		
