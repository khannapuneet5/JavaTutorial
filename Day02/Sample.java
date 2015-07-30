public class Sample{
	static{
		System.out.println("Static block called");
	}
	public Sample(){
		System.out.println("Sample constructor called");
	}
	public void finalize(){
		System.out.println("Sample finalize called");
	}
	public static void astaticMethod(){
		System.out.println("Sample static method called");
	}
	public void anonStaticMethod(){
		System.out.println("Sample non static method called");
	}
}