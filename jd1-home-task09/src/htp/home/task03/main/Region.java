package htp.home.task03.main;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private String name;
	private int regionSquare;			
	private List<City> regionsCity;
		
	
	public Region(String name, int regionSquare, List<City> regionsCity) {		
		this.name = name;
		this.regionSquare = regionSquare;
		this.regionsCity = regionsCity;
	}

	public Region() {		
		regionsCity = new ArrayList<City>();
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getRegionsCity() {
		return regionsCity;
	}

	public void setRegionsCity(List<City> regionsCity) {
		this.regionsCity = regionsCity;
	}

	public int getSqure() {
		return regionSquare;
	}

	public void setSqure(int regionSquare) {
		this.regionSquare = regionSquare;
	}
	
	public void addCity(City newCity) {		
		regionsCity.add(newCity);		
	}

	@Override
	public String toString() {
		return "Region name: " + name + ", regionSquare: " + regionSquare + ", regionsCity: " + regionsCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + regionSquare;
		result = prime * result + ((regionsCity == null) ? 0 : regionsCity.hashCode());
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
		Region other = (Region) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionSquare != other.regionSquare)
			return false;
		if (regionsCity == null) {
			if (other.regionsCity != null)
				return false;
		} else if (!regionsCity.equals(other.regionsCity))
			return false;
		return true;
	}
	
}
