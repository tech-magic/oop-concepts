package pk7;

public class House implements IProduct {
	
	private String heading;
	public House(String heading) { this.heading = heading; }
	public String getDescription() {
		return  this.foundation.getFoundationInfo() +
				this.garden.getGardenInfo() +
				this.floor.getFloorInfo() +
				this.roof.getRoofInfo();
	}
	public String getHeading() {
		return this.heading;
	}
	public String getProduct() {
		return 	this.foundation.toString() +
				this.garden.toString() +
				this.floor.toString() +
				this.roof.toString();
	}
	
	private Floor floor;
	private Foundation foundation;
	private Garden garden;
	private Roof roof;
	public void setFoundation(Foundation foundation) { 
		this.foundation = foundation; }
	public Foundation getFoundation() { return this.foundation; }
	public void setGarden(Garden garden) { this.garden = garden; }
	public Garden getGarden() { return this.garden; }
	public void setFloor(Floor floor) { this.floor = floor; }
	public Floor getFloor() { return this.floor; }
	public void setRoof(Roof roof) { this.roof = roof; }
	public Roof getRoof() { return this.roof; }
}

class FoundationManager {
	public static Foundation getFoundationByType(String foundationType) {
		if(foundationType.equals("mixed")) { 
			return new MixedFoundation();
		} else if(foundationType.equals("stones")) {
			return new FullStonesFoundation(); 
		} else {
			throw new IllegalArgumentException("Invalid Foundation Type ...");
		}
	}
}
class GardenManager {
	public static Garden getGardenByType(String gardenType) {
		if(gardenType.equals("pond")) { 
			return new PondGarden();
		} else if(gardenType.equals("plain")) {
			return new PlainGarden(); 
		} else if(gardenType.equals("empty")) {
			return new NoGarden(); 
		} else {
			throw new IllegalArgumentException("Invalid Foundation Type ...");
		}				
	}
}
class FloorManager {
	public static Floor getFloorByType(String floorType) {
		if(floorType.equals("tile")) {
			return new TileFloor();
		} else if(floorType.equals("terrazzo")) {
			return new TerrazzoFloor();
		} else {
			throw new IllegalArgumentException("Invalid Floor Type ...");
		}
	}
}
class RoofManager {
	public static Roof getRoofByType(String roofType) {
		if(roofType.equals("asbestos")) {
			return new AsbestosRoof();			
		} else if(roofType.equals("claytile")) {
			return new ClayTileRoof();			
		} else {
			throw new IllegalArgumentException("Invalid Roof Type ...");
		}
	}
}

interface HouseBuilder {
	public void buildFoundation();
	public void buildGarden();
	public void buildFloor();
	public void buildRoof();
	public House getHouse();
}

class CustomHouseBuilder {
	private House house;
	public CustomHouseBuilder() { this.house = new House("Custom House"); }
	public CustomHouseBuilder buildFoundation(String foundationType) {
		this.house.setFoundation(
			FoundationManager.getFoundationByType(foundationType)
		);
		return this;
	}
	public CustomHouseBuilder buildGarden(String gardenType) {
		this.house.setGarden(
				GardenManager.getGardenByType(gardenType)
			);
		return this;
	}
	public CustomHouseBuilder buildFloor(String floorType) {
		this.house.setFloor(
				FloorManager.getFloorByType(floorType)
			);
		return this;
	}
	public CustomHouseBuilder buildRoof(String roofType) {
		this.house.setRoof(
				RoofManager.getRoofByType(roofType)
			);
		return this;
	}
	public House getHouse() {
		return this.house;
	}
}

class CustomHouseDirector {
	private CustomHouseBuilder houseBuilder;
	public CustomHouseDirector(CustomHouseBuilder customHouseBuilder, 
			String customModelInfo) {
		this.houseBuilder = customHouseBuilder;
		//e.g. Custom House Model => stones:pond:tile:asbestos 
		String foundationType = this.getFoundationType(customModelInfo);
		String gardenType = this.getGardenType(customModelInfo);
		String floorType = this.getFloorType(customModelInfo);
		String roofType = this.getRoofType(customModelInfo);
		
		this.houseBuilder
			.buildFoundation(foundationType)
			.buildGarden(gardenType)
			.buildFloor(floorType)
			.buildRoof(roofType);
	}
	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
	
	private String getFoundationType(String customModelInfo) {
		// TODO: Implement some String logic here
		return null;
	}
	private String getGardenType(String customModelInfo) {
		// TODO: Implement some String logic here
		return null;
	}
	private String getFloorType(String customModelInfo) {
		// TODO: Implement some String logic here
		return null;
	}
	private String getRoofType(String customModelInfo) {
		// TODO: Implement some String logic here
		return null;
	}
}

class HouseDirector {
	private HouseBuilder houseBuilder;
	public HouseDirector(HouseBuilder builder) { this.houseBuilder = builder; }
	public void constructHouse() {
		this.houseBuilder.buildFoundation();
		this.houseBuilder.buildGarden();
		this.houseBuilder.buildFloor();
		this.houseBuilder.buildRoof();
	}
	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
}

class BungalowBuilder implements HouseBuilder {
	private House house;
	public BungalowBuilder() { this.house = new House("Bungalow Model"); }
	public void buildFoundation() { 
		this.house.setFoundation(new FullStonesFoundation()); }
	public void buildGarden() { this.house.setGarden(new PondGarden()); }
	public void buildFloor() { this.house.setFloor(new TileFloor()); }
	public void buildRoof() { this.house.setRoof(new AsbestosRoof()); }
	public House getHouse() { return this.house; }
}

class KingfisherBuilder implements HouseBuilder {
	private House house;
	public KingfisherBuilder() { this.house = new House("Kingfisher Model"); }
	public void buildFoundation() { this.house.setFoundation(new MixedFoundation()); }
	public void buildGarden() { this.house.setGarden(new PlainGarden()); }
	public void buildFloor() { this.house.setFloor(new TerrazzoFloor()); }
	public void buildRoof() { this.house.setRoof(new ClayTileRoof()); }
	public House getHouse() { return this.house; }
}

class NestBuilder implements HouseBuilder {
	private House house;
	public NestBuilder() { this.house = new House("Nest Model"); }
	public void buildFoundation() { 
		this.house.setFoundation(new FullStonesFoundation()); }
	public void buildGarden() { this.house.setGarden(new PondGarden()); }
	public void buildFloor() { this.house.setFloor(new TileFloor()); }
	public void buildRoof() { this.house.setRoof(new AsbestosRoof()); }
	public House getHouse() { return this.house; }
}

class IglooBuilder implements HouseBuilder {
	private House house;
	public IglooBuilder() { this.house = new House("Igloo Model"); }
	public void buildFoundation() { 
		this.house.setFoundation(new FullStonesFoundation()); }
	public void buildGarden() { this.house.setGarden(new PlainGarden()); }
	public void buildFloor() { this.house.setFloor(new TerrazzoFloor()); }
	public void buildRoof() { this.house.setRoof(new AsbestosRoof()); }
	public House getHouse() { return this.house; }
}

class OfficeBuilder implements HouseBuilder {
	private House house;
	public OfficeBuilder() { this.house = new House("Office Model"); }
	public void buildFoundation() { 
		this.house.setFoundation(new FullStonesFoundation()); }
	public void buildGarden() { this.house.setGarden(new NoGarden()); }
	public void buildFloor() { this.house.setFloor(new TileFloor()); }
	public void buildRoof() { this.house.setRoof(new ClayTileRoof()); }
	public House getHouse() { return this.house; }
}

class SampleUse {
	public House getHouseByModel(String model) {
		
		HouseDirector director = null;
		if(model.equals("bunglow")) {
			director = new HouseDirector(new BungalowBuilder());
		} else if(model.equals("kingfisher")) {
			director = new HouseDirector(new KingfisherBuilder());
		} else if(model.equals("nest")) {
			director = new HouseDirector(new NestBuilder());
		} else if(model.equals("igloo")) {
			director = new HouseDirector(new IglooBuilder());
		} else {
			director = new HouseDirector(new OfficeBuilder());
		}
		
		director.constructHouse();
		return director.getHouse();
	}
}

