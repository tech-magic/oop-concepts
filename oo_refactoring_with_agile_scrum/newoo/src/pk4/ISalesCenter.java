package pk4;


public interface ISalesCenter {
	public String getDescription();
	public String getLocation();
	public String getAddress();
}

class HousingSalesCenter implements ISalesCenter {
	
	private String location;
	private String address;
	
	public HousingSalesCenter(String location, String address) {
		this.location = location;
		this.address = address;
	}

	public String getAddress() { return address; }
	public String getLocation() { return location; }

	public String getDescription() {
		// TODO Implement an attractive description 
		// related to selling houses based on
		// the given location and address
		return null;
	}
}

class CarSalesCenter implements ISalesCenter {
	
	private String location;
	private String address;
	
	public CarSalesCenter(String location, String address) {
		this.location = location;
		this.address = address;
	}

	public String getAddress() { return address; }
	public String getLocation() { return location; }

	public String getDescription() {
		// TODO Implement an attractive description 
		// related to selling cars based on
		// the given location and address 
		return null;
	}
}
