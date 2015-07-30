import java.util.ArrayList;
import java.util.List;

public class Family {

	public static void main(String[] args) {
		Person john = new Person("John", 60);
		john.setParent(new Person("Joe", 90));
		john.setSpouse(new Person("Kim", 56));
		
		List<Person> children = new ArrayList<Person>();
		children.add(new Person("jake", 35));
		
		Workshop artOfLiving = new Workshop("ArtOfLiving", 90);
		john.registerToWorkshop();
	}

}
