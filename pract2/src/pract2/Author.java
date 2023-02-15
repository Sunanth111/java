package pract2;

public class Author {

	 String authorName;
	 int authorAge; 

	public Author(String string, int i) {
		// TODO Auto-generated constructor stub
	}

public class Book {
	String BookName;
	int BookId;
	Author author=new Author();
	
	public Book(int BookId,String BookName,Author author) {
		this.BookId=BookId;
		this.BookName=BookName;
		this.author=author;
	}
	
	public void showDetails(){
		System.out.println("BookID"+BookId+" "+"BOOKName"+BookName);
		System.out.println("AuthorName"+author.authorName+" "+"AothorAge"+author.authorAge);
	}
	
	
	public static void main(String[] args) {
		Author author=new Author("Chetan",40);
		Book book=new Book(1,"halfgirlfriend", author);
		book.showDetails();

	}


}
}
