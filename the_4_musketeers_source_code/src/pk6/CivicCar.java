package pk6;

public class CivicCar implements IProduct {

	public String getDescription() {
		return "Honda civic is the best !!!!";
	}
	public String getHeading() {
		return "Honda Civic Car ...";
	}
	public String getProduct() {
		//put all logic to get product features of a honda civic car here ...
		return "images/rasith_car.jpg";
	}

}

class VitzCar implements IProduct {

	public String getDescription() {
		return "Vitz is the best !!!!";
	}
	public String getHeading() {
		return "Vitz Car ...";
	}
	public String getProduct() {
		//put all logic to get product features of a vitz car here ...
		return "images/vitz_car.jpg";
	}

}
