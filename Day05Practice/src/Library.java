import java.util.ArrayList;
import java.util.List;

public class Library<T extends LibraryItem> {
	private List<T> items = new ArrayList<T>();
	
	public void add(T b){
		items.add(b);
		System.out.println("Adding book");
	}
	public void remove(T b){
		System.out.println("Removing book");
	}
}
