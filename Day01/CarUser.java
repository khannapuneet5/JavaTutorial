public class CarUser{
	public static void main(String[] args){
		Car car1 = new Car();
		car1.model = "Santro";
		car1.color = "Black";
		car1.yearOfMake = 2008;
		car1.numberOfKms = 1000;
		car1.drive();

		Car car2 = new Car();
		car2.model = "BMW";
		car2.color = "Maroon";
		car2.yearOfMake = 2010;
		car2.numberOfKms = 10000;
		car2.drive();

	}
}