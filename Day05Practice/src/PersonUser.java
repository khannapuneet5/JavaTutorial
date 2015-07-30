
public class PersonUser {

	public static void main(String[] args) {
		Person person = new Person();
		Hobby cricketer = person.getCricket();
		Hobby guitarist = person.getGuitar();
		cricketer.doSomething();
		guitarist.doSomething();
		
		
		Person2 person2 = new Person2();
		Hobby cricketer2 = person2.getCricket();
		Hobby guitarist2 = person2.getGuitar();
		cricketer2.doSomething();
		guitarist2.doSomething();
	}

}
