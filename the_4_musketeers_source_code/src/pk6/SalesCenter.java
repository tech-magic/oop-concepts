package pk6;


public abstract class SalesCenter {
	private String location;
	private String address;
	public SalesCenter(String location, String address) {
		this.location = location;
		this.address = address;
	}
	public String getAddress() { return address; }
	public String getLocation() { return location; }
	
	public abstract String getDescription();
}

class HousingSalesCenter extends SalesCenter {
	
	public HousingSalesCenter(String location, String address) {
		super(location, address);
	}
	public String getDescription() {
		// TODO Implement an attractive description 
		// related to selling houses based on
		// the given location and address
		return null;
	}
}

class CarSalesCenter extends SalesCenter {
	
	public CarSalesCenter(String location, String address) {
		super(location, address);
	}
	public String getDescription() {
		// TODO Implement an attractive description 
		// related to selling cars based on
		// the given location and address 
		return null;
	}
}
