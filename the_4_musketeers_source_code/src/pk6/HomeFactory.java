package pk6;

public class HomeFactory implements AbstractProductFactory {
	
	public IProduct createProductByModel(String model) {
		
		HouseDirector director = null;
		if(model.equals("bunglow")) { 
			director = new HouseDirector(new BungalowBuilder());
		} else if(model.equals("kingfisher")) { 
			director = new HouseDirector(new KingfisherBuilder());
		} else if(model.equals("nest")) { 
			director = new HouseDirector(new NestBuilder());
		} else if(model.equals("igloo")) { 
			director = new HouseDirector(new IglooBuilder());
		} else if(model.equals("office")) { 
			director = new HouseDirector(new OfficeBuilder());
		} else {
			throw new IllegalArgumentException("Invalid house model ...");
		}
		
		director.constructHouse();
		return director.getHouse();
	}

	public SalesCenter[] getAllSalesCenters() {
		return new SalesCenter[] {
			new HousingSalesCenter("malabe", "malabe"),
			new HousingSalesCenter("kotte", "kotte")
		};
	}
	
}
