public class PersonUser{
	public static void main(String[] args){
		Person.metro = new PublicTransport();  // Static object is initialized like this
		Person p1 = new Person("Sam");
		Person p2 = new Person("Ram");
		Person p3 = new Person("John");
	}
}