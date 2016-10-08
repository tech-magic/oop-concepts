package pk7;

public interface AbstractProductFactory {
	public IProduct createProductByModel(String model);
	public SalesCenter[] getAllSalesCenters();
}

