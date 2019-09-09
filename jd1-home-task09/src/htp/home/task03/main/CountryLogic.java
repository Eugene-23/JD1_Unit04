package htp.home.task03.main;

import java.util.List;

public class CountryLogic {

	public String getCapital(Country country) {
		String s = "No capital";
		List<Region> region = country.getCountryRegions();
		for (Region rg : region) {
			List<City> city = rg.getRegionsCity();
			for (City ct : city) {
				if (ct.isCapital()) {
					s = ct.getName();
				}
			}
		}
		return s;
	}

	public int getCountRerions(Country country) {
		int count = 0;
		List<Region> region = country.getCountryRegions();
		for (Region rg : region) {
			List<City> city = rg.getRegionsCity();
			for (City ct : city) {
				if (ct.isRegional()) {
					count++;
				}
			}
		}
		return count;
	}

	public int getSquareCountry(Country country) {
		int square = 0;
		List<Region> region = country.getCountryRegions();
		for (Region rg : region) {
			square += rg.getSqure();			
		}
		return square;
	}

}
