public class Person{
	private String name;
	private int age;
	Address address; 
	public Person(String name, int age, String streetName, String cityName, String countryName){
		this.name = name;
		this.age = age;
		address.setStreetName(streetName);
		address.setCityName(cityName);
		address.setCountryName(countryName);
	}	

	public void eat(){
		System.out.println(name + " is eating!");
	}
	public void sleep(){
		System.out.println(name + " is sleeping!");
	}
	public void work(){
		System.out.println(name + " is working!");
	}
	
	public void printAddress(){
		System.out.println(address.getStreetName() + ", " + address.getCityName() + ", " + address.getCountryName());
	}

}
