package htp.home.task03.main;

public class City {
	
	private String name;	
	private boolean regional;
	private boolean capital;
	
	
	public City(String name, boolean regional, boolean capital) {
		this.name = name;
		this.regional = regional;
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void seName(String name) {
		this.name = name;
	}
	
	public boolean isRegional() {
		return regional;
	}

	public void setRegional(boolean regional) {
		this.regional = regional;
	}	
	
	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "City name: " + name + ", is Regional: " + regional+ ", is Capital: " + capital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capital ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (regional ? 1231 : 1237);
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
		City other = (City) obj;
		if (capital != other.capital)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regional != other.regional)
			return false;
		return true;
	}
	
}
