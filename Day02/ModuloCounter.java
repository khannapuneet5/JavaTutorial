public class ModuloCounter{
	private int counter;
	private int limit;
	private static int countOfObjects;
	public ModuloCounter(){
		this.counter = 0;
		this.countOfObjects++;
	}
	public void setLimit(int theLimit){
		this.limit = theLimit - 1;
		System.out.println("ModuloCounter with limit " + limit + " is created");
	}

	public void incrementCounter(){
		if (counter < limit){
			counter++;
			System.out.println("ModuloCounter value is " + counter);
		}
		else{
			counter = 0;
			System.out.println("ModuloCounter value is " + counter);
		}
	}

	public void decrementCounter(){
		if (counter > 0){
			counter--;
			System.out.println("ModuloCounter value is " + counter);
		}
		else{
			counter = limit;
			System.out.println("ModuloCounter value is " + counter);
		}		
	}

	public void reset(){
		counter = 0;
	}

	public static void getObjectCount(){
		System.out.println("Total number of ModuloCounter objects is " + countOfObjects);
	}

	public void finalize(){
		countOfObjects--;
	}
}