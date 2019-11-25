package SIEV.pages;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import SIEV.common.EConstants;
import SIEV.helpers.Helpers;
import SIEV.test.Tests.Environment;

public class PageLogin {
	private WebDriver driver;
	private By userNameField;
	private By userPassField;
	private By regionDrop;
	private By userTypeDrop;
	private By loginButton;
	private By invalidLoginAlert;
	private By userLoged;
	

	public PageLogin(@Nonnull WebDriver driver,Environment enviroment) {
		this.driver = driver;
		userNameField = By.id(enviroment==Environment.PRODUCTION?EConstants.USER_NAME_FIELD.getProd():EConstants.USER_NAME_FIELD.getQA());
		userPassField = By.id(enviroment==Environment.PRODUCTION?EConstants.USER_PASSWORD_FIELD.getProd():EConstants.USER_PASSWORD_FIELD.getQA());
		regionDrop = By.id(enviroment==Environment.PRODUCTION?EConstants.REGION_DROP.getProd():EConstants.REGION_DROP.getQA());
		userTypeDrop = By.id(enviroment==Environment.PRODUCTION?EConstants.USER_TYPE.getProd():EConstants.USER_TYPE.getQA());
		loginButton = By.id(enviroment==Environment.PRODUCTION?EConstants.LOGIN_BUTTON.getProd():EConstants.LOGIN_BUTTON.getQA());
		invalidLoginAlert = By.xpath(enviroment==Environment.PRODUCTION?EConstants.INVALID_LOGIN_ALERT.getProd():EConstants.INVALID_LOGIN_ALERT.getQA());
		userLoged = By.id(enviroment==Environment.PRODUCTION?EConstants.USER_LOGED.getProd():EConstants.USER_LOGED.getQA());
	}
	
	public void Login(String user,String password) {
		driver.findElement(userNameField).sendKeys(user);
		driver.findElement(userPassField).sendKeys(password);
		Select region = new Select(driver.findElement(regionDrop));
		region.selectByVisibleText(Helpers.LoginPageHelpers.REGION_VALUE);
		Select userType = new Select(driver.findElement(userTypeDrop));
		userType.selectByVisibleText(Helpers.LoginPageHelpers.USER_TYPE_VALUE);
	}
	
	public void Login(String user,String password, String region, String userType) {
		driver.findElement(userNameField).sendKeys(user);
		driver.findElement(userPassField).sendKeys(password);
		Select regionElement = new Select(driver.findElement(regionDrop));
		regionElement.selectByVisibleText(region);
		Select userTypeElement = new Select(driver.findElement(userTypeDrop));
		userTypeElement.selectByVisibleText(userType);
	}
	
	public void assertWrongLogin() {
		Assert.assertTrue(!driver.findElement(userNameField).getAttribute("value").isEmpty());
		Assert.assertTrue(!driver.findElement(userPassField).getAttribute("value").isEmpty());
		driver.findElement(loginButton).click();
		Helpers.threadSleep(3);
		Assert.assertTrue(driver.findElement(invalidLoginAlert).getText().contains("invalido"));
	}
	
	public void assertLogin() {
		driver.findElement(loginButton).click();
		Assert.assertTrue(driver.findElement(userLoged).getText().contains(Helpers.LoginPageHelpers.USER_VALUE));
	}
	
	
	public void Login() {
		driver.findElement(userNameField).sendKeys(Helpers.LoginPageHelpers.USER_VALUE);
		driver.findElement(userPassField).sendKeys(Helpers.LoginPageHelpers.PASS_VALUE);
		Select regionElement = new Select(driver.findElement(regionDrop));
		regionElement.selectByVisibleText(Helpers.LoginPageHelpers.REGION_VALUE);
		Select userTypeElement = new Select(driver.findElement(userTypeDrop));
		userTypeElement.selectByVisibleText(Helpers.LoginPageHelpers.USER_TYPE_VALUE);
		driver.findElement(loginButton).click();
		Helpers.threadSleep(2);
	}
}
