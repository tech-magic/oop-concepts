package pk7;

public class HomeFactory implements AbstractProductFactory {
	
	public IProduct createProductByModel(String model) {
		
		boolean isACustomHouseModel = false;
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
			isACustomHouseModel = true;
		}
		
		if(!isACustomHouseModel) {
			director.constructHouse();
			return director.getHouse();
		} else {
			//e.g. Custom House Model => stones:pond:tile:asbestos
			CustomHouseDirector customDirector = 
				new CustomHouseDirector(new CustomHouseBuilder(), model);
			return customDirector.getHouse();
		}
	}

	public SalesCenter[] getAllSalesCenters() {
		return new SalesCenter[] {
			new HousingSalesCenter("malabe", "malabe"),
			new HousingSalesCenter("kotte", "kotte")
		};
	}
	
}
