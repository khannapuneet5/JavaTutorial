public class SampleUser{
	public static void main(String[] args){
		Sample sample = new Sample();
		sample.anonStaticMethod();
		sample = null;
		System.gc();
		sample.astaticMethod();  // NOT RECOMMENDED but will work since compiler resolves it at compile time
		Sample.astaticMethod();
	}
}