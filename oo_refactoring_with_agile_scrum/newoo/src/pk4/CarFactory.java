package pk4;

public class CarFactory implements AbstractProductFactory {

	public IProduct createProductByModel(String model) {
		if(model.equals("civic")) { return new CivicCar(); } 
		else if(model.equals("vitz")) { return new VitzCar(); } 
		else { throw new IllegalArgumentException("Invalid Model ...");
		}
	}

	public ISalesCenter[] getAllSalesCenters() {
		return new ISalesCenter[] {
			new CarSalesCenter("malabe", "malabe"),
			new CarSalesCenter("wattala", "wattala")
		};
	}
	
}

