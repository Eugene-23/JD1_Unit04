package htp.home.task03.main;

import java.util.ArrayList;
import java.util.List;

public class Country {
	
	private String name;
	private List<Region> countryRegions;
	
	
	public Country() {
		countryRegions = new ArrayList<Region>();
	}

	public Country(String name, List<Region> countryRegions) {		
		this.name = name;		
		this.countryRegions = countryRegions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Region> getCountryRegions() {
		return countryRegions;
	}

	public void setCountryRegions(List<Region> countryRegions) {
		this.countryRegions = countryRegions;
	}

	public void addRegion(Region newRegion) {		
		countryRegions.add(newRegion);		
	}

	@Override
	public String toString() {
		return "Country name: " + name + "Country Regions: " + countryRegions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryRegions == null) ? 0 : countryRegions.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (countryRegions == null) {
			if (other.countryRegions != null)
				return false;
		} else if (!countryRegions.equals(other.countryRegions))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
}
