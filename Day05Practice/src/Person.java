
public class Person{
	private Hobby guitar;
	private Hobby cricket;
	
	public Person(){
		guitar = new PlayGuitar();
		cricket = new PlayCricket();
	}
	
	public Hobby getGuitar() {
		return guitar;
	}
	public Hobby getCricket() {
		return cricket;
	}

	private class PlayCricket implements Hobby{
		public void doSomething() {
			System.out.println("Playing cricket");	
		}
	}
	private class PlayGuitar implements Hobby{
		public void doSomething() {
			System.out.println("Playing guitar");	
		}
	}
	
}
