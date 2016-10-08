package pk1;

import java.util.Map;

public abstract class AbstractHTMLPage {
	
	public void setPageHeader(String title) {
		
	}
	
	public void setPageDescription(String title) {
		
	}
	
	public void setPageBody(String bodyHTML) {
		
	}
	
	public void setPageFooter(String bodyHTML) {
		
	}
	
	public abstract void render(Map<String, Object> arguments);

}
