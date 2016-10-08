package pk6;

import java.util.Map;

class ProductManager {
	public static AbstractProductFactory getProductFactoryByCategory(String productCategory) {
		AbstractProductFactory factory;
		// NOTE: You can use an xml/property file instead of if-else statements
		if(productCategory.equals("houses")) {
			factory = new HomeFactory();
		} else if(productCategory.equals("cars")) {
			factory = new CarFactory();
		} else {
			throw new RuntimeException("Unsupported Product Category ...");
		}
		return factory;
	}
}

public class SandRGroupHomePage extends AbstractHTMLPage {
	
	public void render(Map<String, Object> arguments) {
		String category = (String)arguments.get("category");
		String model = (String)arguments.get("model");
		
		AbstractProductFactory productFactory = ProductManager.getProductFactoryByCategory(category);
		IProduct product = productFactory.createProductByModel(model);
		
		super.setPageHeader("<title>" + product.getHeading() + "</title>");
		super.setPageDescription("<p>" + product.getDescription() + "</p>");
		super.setPageBody("<img src='" + product.getProduct() + "'/>");
		
		SalesCenter[] salesCenters = productFactory.getAllSalesCenters();
		String footerInfo = "<p>Contact our sales centers at: ";
		for (SalesCenter salesCenter : salesCenters) {
			footerInfo += salesCenter.getDescription();
		}
		footerInfo += "</p>"; 
		super.setPageFooter(footerInfo);
	}
}
