package pk4;

public class HomeFactory implements AbstractProductFactory {
	
	public IProduct createProductByModel(String model) {
		if(model.equals("bunglow")) { return new Bunglow();
		} else if(model.equals("office")) { return new OfficeBuilding();
		} else { throw new IllegalArgumentException("Invalid Model ...");
		}
	}

	public ISalesCenter[] getAllSalesCenters() {
		return new ISalesCenter[] {
			new HousingSalesCenter("malabe", "malabe"),
			new HousingSalesCenter("kotte", "kotte")
		};
	}
	
}
