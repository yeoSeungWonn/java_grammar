package java_grammar;

import java.util.*;

class Book{
	
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class P_156 {

	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scan.next();
			System.out.print("저자>>");
			String author = scan.next();
			book[i] = new Book(title, author);
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.print("("+book[i].title+", "+book[i].author+")");
		}
		
		scan.close();
		System.out.print("\n");
	}

}
