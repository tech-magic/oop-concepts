package pk6;

public interface Foundation {
	public String getFoundationInfo();
}
class FullStonesFoundation implements Foundation {
	public String getFoundationInfo() {
		return "Full Stones Foundation";
	}
}
class MixedFoundation implements Foundation {
	public String getFoundationInfo() {
		return "Full Stones with Cement Blocks Foundation";
	}
}

interface Garden {
	public String getGardenInfo();
}
class PondGarden implements Garden {
	public String getGardenInfo() {
		return "Garden with Pond";
	}
}
class PlainGarden implements Garden {
	public String getGardenInfo() {
		return "Plain Garden";
	}
}
class NoGarden implements Garden {
	public String getGardenInfo() {
		return "Empty Garden";
	}
}

interface Floor {
	public String getFloorInfo();
}
class TerrazzoFloor implements Floor {
	public String getFloorInfo() {
		return "Terrazzo Floor";
	}
}
class TileFloor implements Floor {
	public String getFloorInfo() {
		return "Floor Tiles";
	}
}

interface Roof {
	public String getRoofInfo();
}
class AsbestosRoof implements Roof {
	public String getRoofInfo() {
		return "Asbestos Roof";
	}
}
class ClayTileRoof implements Roof {
	public String getRoofInfo() {
		return "Roof with Clay Tiles";
	}
}

