package pk5;

public interface AbstractProductFactory {
	public IProduct createProductByModel(String model);
	public SalesCenter[] getAllSalesCenters();
}

