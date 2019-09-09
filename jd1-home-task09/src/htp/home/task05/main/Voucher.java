package htp.home.task05.main;

public class Voucher {
	
	private VoucherType type;
	private String country;
	private String transport;
	private String nutrition;
	private int amountOfDays;
		
	public Voucher() {		
		type = VoucherType.EXCURSION;
		country = new String();
		transport = new String();
		nutrition = new String();
		amountOfDays = 0;
	}

	public Voucher(VoucherType type, String country, String transport, String nutrition, int amountOfDays) {		
		this.type = type;
		this.country = country;
		this.transport = transport;
		this.nutrition = nutrition;
		this.amountOfDays = amountOfDays;
	}

	public VoucherType getType() {
		return type;
	}

	public void setType(VoucherType type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public int getAmountOfDays() {
		return amountOfDays;
	}

	public void setAmountOfDays(int amountOfDays) {
		this.amountOfDays = amountOfDays;
	}

	@Override
	public String toString() {
		return "Voucher [type=" + type + ", country=" + country + ", transport=" + transport + ", nutrition="
				+ nutrition + ", amountOfDays=" + amountOfDays + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amountOfDays;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((nutrition == null) ? 0 : nutrition.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Voucher other = (Voucher) obj;
		if (amountOfDays != other.amountOfDays)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (nutrition == null) {
			if (other.nutrition != null)
				return false;
		} else if (!nutrition.equals(other.nutrition))
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
				
}
