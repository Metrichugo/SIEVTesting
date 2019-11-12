package SIEV.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SIEV.helpers.Helpers;

public class PageHome {

	private WebDriver driver;
	private By menuButton;
	private By evaluacionButton;
	private By evaluacionActivacionButton;
	
	
	public PageHome(WebDriver driver) {
		this.driver = driver;
		menuButton = By.id("menuForm:btnMenu");
		evaluacionButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[2]");
		evaluacionActivacionButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[2]/ul/li");
	}
	
	public void openEvaluationMenu() {
		driver.findElement(menuButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(evaluacionButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(evaluacionActivacionButton).click();
	}
}
