package SIEV.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SIEV.common.Constants;
import SIEV.helpers.Helpers;
import SIEV.pages.PageEvaluacion;
import SIEV.pages.PageHome;
import SIEV.pages.PageLogin;

public class Tests {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void init() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty(Constants.driverKey,Constants.driverValue);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(Constants.endPoint);
		Helpers.threadSleep(2);
	}
	
	// TCS-6
	/*@Test
	public void LoginFailTest() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login(Helpers.LoginPageHelpers.WRONG_USER_VALUE, Helpers.LoginPageHelpers.WRONG_PASS_VALUE);
		pageLogin.assertWrongLogin();
	}
	
	// TCS-1
	@Test
	public void LoginOkTest() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login(Helpers.LoginPageHelpers.USER_VALUE, Helpers.LoginPageHelpers.PASS_VALUE);
		pageLogin.assertLogin();
	}
	
	// TCS-8
	@Test
	public void LoginWrongRegionTest() {
		PageLogin pageLogin =  new PageLogin(driver);
		pageLogin.Login(Helpers.LoginPageHelpers.USER_VALUE, Helpers.LoginPageHelpers.PASS_VALUE,Helpers.LoginPageHelpers.WRONG_REGION_VALUE,Helpers.LoginPageHelpers.USER_TYPE_VALUE);
		pageLogin.assertWrongLogin();
	}
	
	// TCS-9
	@Test
	public void LoginWrongUserTypeTest() {
		PageLogin pageLogin =  new PageLogin(driver);
		pageLogin.Login(Helpers.LoginPageHelpers.USER_VALUE, Helpers.LoginPageHelpers.PASS_VALUE,Helpers.LoginPageHelpers.REGION_VALUE,Helpers.LoginPageHelpers.WRONG_USER_TYPE_VALUE);		
		pageLogin.assertWrongLogin();
	}*/
	
	// TCS-27
	/*@Test
	public void InvoiceStructureSIEVTest() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertEstructuraFolioSIEV();
	}
	
	// TCS-44
	@Test
	public void InvoicePerRegionSIEVTest() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion =  new PageEvaluacion(driver);
		String folioA = pageEvaluacion.assertEstructuraFolioSIEV();
		pageEvaluacion.resetForm();
		String folioB = pageEvaluacion.assertEstructuraFolioSIEV();
		pageEvaluacion.assertFoliosPorRegion(folioA,folioB);
	}*/
	
	// TCS-28
	/*@Test
	public void assertMandatoryDataTest() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertEmptyFields();
	}
	
	// TCS-31
	@Test
	public void assertValidMail() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertValidMail();
	}
	
	// TCS-32
	@Test
	public void assertValidPhoneNumber() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertValidPhoneNumber();
	}
	
	// TCS-33
	@Test
	public void assertValidWorkPhoneNumber() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertValidWorkPhoneNumber();
	}*/
	
	// TCS-34
	@Test
	public void assertValidReferencePhoneNumber() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertValidReferencesPhoneNumber();
	}
	
	// TCS-35
	/*@Test
	public void assertAltaReferencias() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertAddReferences();
	}*/
	
	// TCS-36
	/*@Test
	public void assertFolioSISACT() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertGenerarFolioSISACT();
	}*/
	
	// TCS-37
	/*@Test
	public void assertClearScreen() {
		PageLogin pageLogin =  new PageLogin(driver);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver);
		pageEvaluacion.assertClearScreen();
	}*/
	
	@AfterMethod
	public void endTest() {
		driver.close();
	}
	
}
