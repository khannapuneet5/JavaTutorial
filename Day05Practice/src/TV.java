
public class TV {
	private int volume;
	public void increaseVolume(){
		volume++;
	}
	public void decreaseVolume(){
		volume--;
	}
	public class Remote{
		public void increaseVolume(){
			volume++;
		}
		public void decreaseVolume(){
			volume--;
		}
	}
}
