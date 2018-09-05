package pages1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wrappers1.LeafTapsWrappers;

public class GetWeatherForecast extends LeafTapsWrappers{
	
	/*@Given("Launch the Browser")
	public void launchBrowser() {
		
		
	}
	
	
	@And("Load the URL")
	public void loadURL() {
		driver.get("http://192.168.1.27:3000/");
	}
	
	@And("Maximize the window")
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	@And("set Timeouts")
	public void setTimeouts() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}*/
	
	
	@When("Enter City name as (.*)")
	public void enterCompanyName(String cname){
		enterById("city", cname);
	}
	
	@And("Click Enter")
	public void clickEnter() {
		clickById("city");
	}
	
	@And("verify 5 days weather forecast are displayed")
	public void verifyForecast()
	{
		verifyTextContainsByXpath("(//span[@class='name'])[1]","Tue");
		verifyTextContainsByXpath("(//span[@class='name'])[2]","Wed");
		verifyTextContainsByXpath("(//span[@class='name'])[3]","Thu");
		verifyTextContainsByXpath("(//span[@class='name'])[4]","Fri");
		verifyTextContainsByXpath("(//span[@class='name'])[5]","Sat");
	}
	
	
	
	@When("Enter Invalid City name as (.*)")
	public void invalidCity(String cname1) {
		enterById("city", cname1);
	
	}
	
	@And("Click the Invalid city")
	public void clickEnterCity() {
		clickById("city");
	}
	
	
	
	@And("verify the error message display")
	public void verifyErrorMessage() {
		verifyTextByXpath("//div[text()='Error retrieving the forecast']","Error retrieving the forecast" );
		
	}

}
