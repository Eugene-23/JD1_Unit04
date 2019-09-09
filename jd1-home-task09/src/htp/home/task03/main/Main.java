package htp.home.task03.main;

import java.util.List;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры.
 */

public class Main {

	public static void main(String[] args) {
		
		City minsk = new City("Minsk", true, true);		
		Region minskiy = new Region();		
		minskiy.setSqure(40);
		minskiy.addCity(minsk);
				
		City grodno = new City("Grodno", true, false);		
		Region grodnenskiy = new Region();		
		grodnenskiy.setSqure(25);
		grodnenskiy.addCity(grodno);
		
		City brest = new City("Brest", true, false);		
		Region brestskiy = new Region();		
		brestskiy.setSqure(33);
		brestskiy.addCity(brest);
		
		City vitebsk = new City("Vitebsk", true, false);		
		Region vitebskiy = new Region();		
		vitebskiy.setSqure(40);
		vitebskiy.addCity(vitebsk);
		
		City gomel = new City("Gomel", true, false);		
		Region gomelskiy = new Region();		
		gomelskiy.setSqure(40);
		gomelskiy.addCity(gomel);
		
		City mogilev = new City("Mogilev", true, false);		
		Region mogilevskiy = new Region();		
		mogilevskiy.setSqure(29);
		mogilevskiy.addCity(mogilev);
		
		Country belarus = new Country();
		belarus.setName("Belarus");		
		belarus.addRegion(minskiy);
		belarus.addRegion(grodnenskiy);		
		belarus.addRegion(brestskiy);
		belarus.addRegion(vitebskiy);
		belarus.addRegion(gomelskiy);
		belarus.addRegion(mogilevskiy);
		
		CountryLogic logic = new CountryLogic();
		
		String s = logic.getCapital(belarus);		
		System.out.println("Столица страны: " + s);
		
		int count = logic.getCountRerions(belarus);
		System.out.println("Количество областей: " + count);
		
		int square = logic.getSquareCountry(belarus);
		System.out.println("Площадь страны: " + square + " тыс.км2");
		
		System.out.println("Областные центры:");
		printRegionCity(belarus);

	}
	
	public static void printRegionCity(Country country) {
		List<Region> region = country.getCountryRegions();
		for (Region rg : region) {
			List<City> city = rg.getRegionsCity();
			for (City ct : city) {
				if (ct.isRegional()) {
					System.out.print(ct.getName() + ", ");
				}
			}
		}
	}

}
