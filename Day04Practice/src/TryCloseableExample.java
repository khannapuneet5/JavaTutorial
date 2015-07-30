import java.io.Closeable;
import java.io.IOException;

public class TryCloseableExample implements Closeable{

	public void close() throws IOException {
		System.out.println("Closing sample try");
	}

	public void play() {
		System.out.println("Playing with try");
		
	}
	
}
