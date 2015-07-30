
public class TVUser {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.increaseVolume();
		tv.decreaseVolume();
		TV.Remote remote = tv.new Remote();
		remote.increaseVolume();
		
		}
}


