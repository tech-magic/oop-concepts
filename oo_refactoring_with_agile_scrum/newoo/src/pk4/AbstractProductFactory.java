package pk4;

public interface AbstractProductFactory {
	public IProduct createProductByModel(String model);
	public ISalesCenter[] getAllSalesCenters();
}

