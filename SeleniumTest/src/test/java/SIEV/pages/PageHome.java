package SIEV.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import SIEV.common.EConstants;
import SIEV.helpers.Helpers;
import SIEV.test.Tests.Environment;

public class PageHome {

	private WebDriver driver;
	private By menuButton;
	private By evaluacionButton;
	private By evaluacionActivacionButton;
	private By logoutButton;
	private By reportesButton; 
	private By consultaFolioButton;
	private By consultaLabel;
	private Environment environment;
	
	public PageHome(WebDriver driver,Environment environment) {
		this.driver = driver;
		this.environment = environment;
		menuButton = By.id("menuForm:btnMenu");
		evaluacionButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[2]");
		evaluacionActivacionButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[2]/ul/li");
		logoutButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[1]/a");
		reportesButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[3]");
		consultaFolioButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[3]/ul/li");
		consultaLabel = By.id("consultaFolioForm:j_id_1p");
	}
	
	public void openEvaluationMenu() {
		driver.findElement(menuButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(evaluacionButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(evaluacionActivacionButton).click();
	}
	
	public void assertLogout() {
		driver.findElement(menuButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(logoutButton).click();
		Helpers.threadSleep(Helpers.defaultSeconds);
		Assert.assertEquals(driver.getCurrentUrl(), environment==Environment.PRODUCTION?EConstants.LOGIN_URL.getProd():EConstants.LOGIN_URL.getQA());
	}
	
	public void assertDisplayActivaciones() {
		openEvaluationMenu();
		Helpers.threadSleep(Helpers.defaultSeconds);
		Assert.assertEquals(driver.getCurrentUrl(),environment==Environment.PRODUCTION?EConstants.ACTIVACIONES_URL.getProd():EConstants.ACTIVACIONES_URL.getQA());
	}
	
	public void assertDisplayConsultas() {
		driver.findElement(menuButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(reportesButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(consultaFolioButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		Assert.assertFalse(driver.findElements(consultaLabel).isEmpty());
	}
	
	public void assertSessionExpired() {
		Helpers.threadSleep(Helpers.sessionTime);
		driver.findElement(menuButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		Assert.assertEquals(driver.getCurrentUrl(),environment==Environment.PRODUCTION?EConstants.LOGIN_URL.getProd():EConstants.LOGIN_URL.getQA());
	}
	
}
