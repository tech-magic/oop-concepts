package pk2;

import java.util.Map;
public class SandRGroupHomePage extends AbstractHTMLPage {
	public void render(Map<String, Object> arguments) {
		if(arguments.get("category").equals("houses")) {
			super.setPageHeader("<title>Sida's Stunning House ...</title>");
			super.setPageDescription(
				"<p>Mama haduwa wagema umbalatath geyak hadala dennam !!!</p>"
			);
			super.setPageBody("<img src='images/sida_house.jpg'>");
		} else if(arguments.get("category").equals("cars")) {
			super.setPageHeader("<title>Rasiya's Civic Car ...</title>");
			super.setPageDescription(
				"<p>Sidagen ahala nam apahu gewal hadanna epo !!!</p>"
			);
			super.setPageBody("<img src='images/rasith_car.jpg'>");
		} else {
			throw new RuntimeException("Product Category not supported !!!!");
		}
		super.setPageFooter(
			"<p>Contact our sales centers at malabe, kotte and nawala</p>");
	}
}
