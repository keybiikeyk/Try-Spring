public class OOP {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setMake("tesla");
		
		System.out.println("make = = " + car.getMake());
		System.out.println("model = " +car.getModel());
		car.describeCar();

	}

}
