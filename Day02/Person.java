public class Person{
	private String name;
	private static PublicTransport metro;
	// static means shared among all objects of that class


	public Person(String theName){
		name = theName;
	}
	// static variables can be accessed via static methods
	public static PublicTransport getMetro(){
		return metro;
	}

	public static void setMetro(PublicTransport pt){
		metro = pt;
	}

}

class PublicTransport{

}