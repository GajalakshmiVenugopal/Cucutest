package pages1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wrappers1.LeafTapsWrappers;

public class DayForecastShow extends LeafTapsWrappers{

	
	
	@Given("Select a day")
	public void selectDay() {
		clickByXpath("(//span[@class='name'])[1]");
	
	}
	
	@And("Get the number of forecast displayed")
	public void getForecast() {
		
		
		List <WebElement> rows=getDriver().findElements(By.xpath("(//span[@class='name'])[1]/following::div[@class='detail']"));
		System.out.println(rows.size());	
		
	}
	
	@And("Verify 3 hourly forecast is displayed")
	public void validateForecast() {
		
		
		
	}
	
}
