package pk1;

import java.util.Map;

public class SiDaConstructionsHomePage extends AbstractHTMLPage {
	
	public void render(Map<String, Object> arguments) {
		
		super.setPageHeader(
			"<title>Sida's MAKABAS House ...</title>");
		
		super.setPageDescription(
			"<p>Mama haduwa wagema umbalatath geyak hadala dennam !!!</p>"
		);
		
		super.setPageBody("<img src='images/sida_house.jpg'>");
		
		super.setPageFooter(
			"<p>We build houses at malabe, kotte and wattala</p>");
	}

}
