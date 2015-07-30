import java.util.List;

public class Person {
	private String name;
	private int age;
	private Person parent;
	private Person spouse;
	private List<Person> children;
	
	public Person(){
		
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person getParent() {
		return parent;
	}
	public void setParent(Person parent) {
		this.parent = parent;
	}
	public Person getSpouse() {
		return spouse;
	}
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}
	public List<Person> getChildren() {
		return children;
	}
	public void setChildren(List<Person> children) {
		this.children = children;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void registerToWorkshop(){
		Workshop aolWorkshop = WorkshopFactory.getWorkshop("ArtOfLiving");
		aolWorkshop.register(this);
	}
	
}
