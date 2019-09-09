package htp.home.task02.main;

public class Fuel {
	
	private int minVolume;
	private int maxVolume;
	private int currentVolume;
	
	
	public Fuel(int maxVolume, int currentVolume, int minVolume) {		
		this.minVolume = minVolume;
		this.maxVolume = maxVolume;
		this.currentVolume = currentVolume;
	}

	public int getMinVolume() {
		return minVolume;
	}

	public void setMinVolume(int minVolume) {
		this.minVolume = minVolume;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public void setMaxVolume(int maxVolume) {
		this.maxVolume = maxVolume;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	@Override
	public String toString() {
		return "Fuel [minVolume: " + minVolume + ", maxVolume: " + maxVolume + ", currentVolume: " + currentVolume + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentVolume;
		result = prime * result + maxVolume;
		result = prime * result + minVolume;
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
		Fuel other = (Fuel) obj;
		if (currentVolume != other.currentVolume)
			return false;
		if (maxVolume != other.maxVolume)
			return false;
		if (minVolume != other.minVolume)
			return false;
		return true;
	}
		
}
