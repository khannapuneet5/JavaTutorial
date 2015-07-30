
public class BasicThreadExample {
	private Thread kitchenThread;
	private Thread bedroomThread;
	
	public void doSomething(){
		kitchenThread = new Thread(new Runnable(){
			public void run(){
				for (int i=0; i<10; i++){
					System.out.println("Cooking in " + Thread.currentThread().getName() + " thread");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}, "Kitchen");
		bedroomThread = new Thread(new Runnable(){
			public void run(){
				for (int i=0; i<10; i++){
					System.out.println("Sleeping in " + Thread.currentThread().getName() + " thread");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}, "Bedroom");
		
		kitchenThread.start();
		bedroomThread.start();
	}
}
