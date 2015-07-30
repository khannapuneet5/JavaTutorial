
public class Dog {
	private Thread wagTail;
	private Thread walk;
	private boolean awake = true;
	
	public void wakeUp(){
		awake = true;
		wagTail = new Thread(new Runnable(){
			public void run(){
				while(awake){
					System.out.println("Dog is walking");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		walk = new Thread(new Runnable(){
			public void run(){
				while(awake){
					System.out.println("Dog is wagging tail");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		wagTail.start();
		walk.start();
	}
	
	public void goToSleep(){
		awake = false;
	}

	public boolean isAwake() {
		return awake;
	}
}
