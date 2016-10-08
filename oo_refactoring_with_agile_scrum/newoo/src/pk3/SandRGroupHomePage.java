package pk3;

import java.util.Map;

public class SandRGroupHomePage extends AbstractHTMLPage {
	
	public void render(Map<String, Object> arguments) {
		String category = (String)arguments.get("category");
		IProduct product = this.getProductByCategory(category);
		super.setPageHeader("<title>" + product.getHeading() + "</title>");
		super.setPageDescription("<p>" + product.getDescription() + "</p>");
		super.setPageBody("<img src='" + product.getProduct() + "'/>");
			
		// they sell both of these product categories
		super.setPageFooter(
			"<p>Contact our sales centers at malabe, kotte and wattala</p>");
	}
	
	private IProduct getProductByCategory(String category) {
		if(category.equals("houses")) {
			return new Bunglow();
		} else if(category.equals("cars")) {
			return new CivicCar();
		} else {
			throw new RuntimeException("Unsupported Product Category ...");
		}
		
	}

}
