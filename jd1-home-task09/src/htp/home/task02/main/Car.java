package htp.home.task02.main;

public class Car {
	
	private String model;
	private Engine engine;
	private Wheel whell;	
	private Fuel fuel;
	
	
	public Car(String model, Engine engine, Wheel whell, Fuel fuel) {		
		this.model = model;
		this.engine = engine;
		this.whell = whell;	
		this.fuel = fuel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWhell() {
		return whell;
	}

	public void setWhell(Wheel whell) {
		this.whell = whell;
	}
	
	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public boolean drive() {
		if(fuel.getCurrentVolume() > fuel.getMinVolume()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Car model: " + model + ", whell: " + whell + ", engine: " + engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((whell == null) ? 0 : whell.hashCode());
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
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (fuel == null) {
			if (other.fuel != null)
				return false;
		} else if (!fuel.equals(other.fuel))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (whell == null) {
			if (other.whell != null)
				return false;
		} else if (!whell.equals(other.whell))
			return false;
		return true;
	}
	
}
