package htp.home.task02.main;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("BMW", new Engine(3.6, "Petrol"), new Wheel("AllSeason", 19), new Fuel(50, 5, 10));
		System.out.println(car1);
		
		car1.setWhell(new Wheel("Whinter", 19));
		System.out.println(car1);
		
		System.out.println(car1.drive());		
		car1.setFuel(new Fuel(50, 40, 10));
		System.out.println(car1.drive());
		
		System.out.println(car1.getModel());
	}

}
