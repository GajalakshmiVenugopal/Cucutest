package pages1;

import cucumber.api.java.en.*;
import wrappers1.LeafTapsWrappers;
public class MyHomePage extends LeafTapsWrappers {
	
	
	@When("Click Leads")
	public void clickLead(){
		clickByLink("Leads");
	}
	
	


}
