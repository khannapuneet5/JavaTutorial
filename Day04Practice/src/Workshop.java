import java.util.ArrayList;
import java.util.List;

public class Workshop {
	private String name;
	private int duration;
	private List<Person> attendees;
	
	public Workshop(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
		this.attendees = new ArrayList<Person>();
		WorkshopFactory.advertise(this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Person> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Person> attendees) {
		this.attendees = attendees;
	}

		
	public void register(Person person){
		if (!attendees.contains(person)){
			attendees.add(person);
		}
	}

	}
