package pages1;

import cucumber.api.java.en.*;
import wrappers1.LeafTapsWrappers;
public class HomePage extends LeafTapsWrappers {
	
	
	@When("Click CRMSFA")
	public void clickCreateLead(){
		clickByLink("CRM/SFA");
	}
	
	


}
