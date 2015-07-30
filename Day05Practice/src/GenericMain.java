
public class GenericMain {

	public static void main(String[] args) {
//		Library lib = new Library();
//		Book b = new Book();
//		lib.addBook(b);
//		lib.removeBook(b);
		/*Library<String> strings = new Library<>();
		Library<Integer> numbers = new Library<>();
		*/ //This will not work if Library generic class extends LibraryItem interface
		Library<Book> books = new Library<>();
		books.add(new Book());
		books.remove(new Book());
		
		Library<CD> cds = new Library<>();
		cds.add(new CD());
		cds.remove(new CD());
		
		Library<DVD> dvds = new Library<>();
		dvds.add(new DVD());
		dvds.remove(new DVD());
		
	}

}
