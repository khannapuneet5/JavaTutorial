public class PersonUser{
	public static void main(String[] args){
		Address add = new Address();
		Person person1 = new Person("Puneet", 20, "Powai", "Mumbai", "India");
		person1.address = add;
		Person person2 = new Person("Alok", 24, "Goregaon", "Mumbai", "India");
		Person person3 = new Person("Jam", 22, "Koramangla", "Bangalore", "India");
		
		person1.sleep();
		person2.work();
		person3.eat();
		person1.printAddress();
	}
}