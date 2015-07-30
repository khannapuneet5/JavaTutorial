
public class ThreadMain {

	public static void main(String[] args) {
		BasicThreadExample basicThreadExample = new BasicThreadExample();
		System.out.println("Calling doSomething in " + Thread.currentThread().getName() + " thread");
		basicThreadExample.doSomething();
	}

}
