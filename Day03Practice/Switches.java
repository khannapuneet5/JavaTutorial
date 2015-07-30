public class Switches {
	private String position;
		
	public void turnOn() throws SwitchAlreadyOnException{
		if ("on".equals(position)){
			throw new SwitchAlreadyOnException("You are trying to turn on swtich that is already ON");
		}
		position = "on";
	}

	public void turnOff() throws SwitchAlreadyOffException{
		if ("off".equals(position)){
			throw new SwitchAlreadyOffException("You are trying to turn on swtich that is already ON");
		}
		position = "off";
	}

	public String display(){
		return position;
	}
}