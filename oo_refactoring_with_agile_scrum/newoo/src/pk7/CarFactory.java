package pk7;

public class CarFactory implements AbstractProductFactory {

	public IProduct createProductByModel(String model) {
		if(model.equals("civic")) { return new CivicCar(); } 
		else if(model.equals("vitz")) { return new VitzCar(); } 
		else { throw new IllegalArgumentException("Invalid Model ...");
		}
	}

	public SalesCenter[] getAllSalesCenters() {
		return new SalesCenter[] {
			new CarSalesCenter("malabe", "malabe"),
			new CarSalesCenter("wattala", "wattala")
		};
	}
	
}

