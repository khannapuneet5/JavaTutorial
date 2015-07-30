public class Person2 {
	private Hobby guitar;
	private Hobby cricket;
	
	public Person2(){
		guitar = new Hobby(){
			public void doSomething(){
				System.out.println("Ding Ding");
			}
		};
		cricket = new Hobby(){
			public void doSomething(){
				System.out.println("Four six");
			}
		};
	}
	
	public Hobby getGuitar() {
		return guitar;
	}
	public Hobby getCricket() {
		return cricket;
	}
}
