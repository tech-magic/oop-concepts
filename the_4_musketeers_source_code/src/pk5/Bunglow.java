package pk5;

public class Bunglow implements IProduct {
	public String getDescription() {
		return "Sidath Bunglows !!!";
	}
	public String getHeading() {
		return "Sida Model Bunglow ...";
	}
	public String getProduct() {
		// put logic to get all features of a bunglow here
		return "images/sida_house.jpg";
	}
}

class OfficeBuilding implements IProduct {
	public String getDescription() {
		return "Office Buildings !!!";
	}
	public String getHeading() {
		return "Office Building Model ...";
	}
	public String getProduct() {
		// put logic to get all features of an office building here
		return "images/office_buildings.jpg";
	}
}
