package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Book{
	String id;
	String title;
	String Authorname;
	String category;
	float price;
	
	// parameterized constructor 
	public Book(String id, String title, String Authorname, String category, float price) {
		super();
		this.id = id;
		this.title = title;
		this.Authorname = Authorname;
		this.category = category;
		this.price = price;
	}
	void show()
	{
		System.out.println(id +" " +Authorname +" " +category +" " + price);
	}
	
	
	
}
public class BookStore {
	public static void main(String[] args) {
		Book b = new Book("HG", "Half girlfriend", "Chetan bhagat","A",499f );
		Book b1 = new Book("RV2020", "Revolution 2020", "Chetan bhagat","A",555f );
		Book b2 = new Book("HPCS", "Harry potter ", "Jk Rowling","A",1000f );
		b.show();
		b1.show();
		b2.show();
		
		
	// 	add() method 
		List<Book>booklist= new ArrayList<Book>();
		booklist.add(b);
		booklist.add(b1);
		booklist.add(b2);
		
	//	method to search book by author name
		List<String>search =booklist.stream().map(p1 -> p1.Authorname).collect(Collectors.toList());
  		System.out.println("author name are :- "+search);
}
}
