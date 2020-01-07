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
import SIEV.common.EConstants;
import SIEV.helpers.Helpers;
import SIEV.pages.PageEvaluacion;
import SIEV.pages.PageHome;
import SIEV.pages.PageLogin;

public class Tests {
	
	private WebDriver driver;
	Environment environment;
	
	public enum Environment{
		QA,PRODUCTION
	}
	
	@BeforeMethod
	public void init() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty(Constants.driverKey,Constants.driverValue);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		environment = Environment.QA; // Change to the environment you want to use 
		driver.navigate().to(EConstants.END_POINT.getQA()); //Change to the environment you want to use
		Helpers.threadSleep(2);
	}
	
	// TCS-6
	/*@Test
	public void LoginFailTest() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login(Helpers.LoginPageHelpers.WRONG_USER_VALUE, Helpers.LoginPageHelpers.WRONG_PASS_VALUE);
		pageLogin.assertWrongLogin();
	}
	
	// TCS-1
	@Test
	public void LoginOkTest() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login(Helpers.LoginPageHelpers.USER_VALUE, Helpers.LoginPageHelpers.PASS_VALUE);
		pageLogin.assertLogin();
	}
	
	// TCS-8
	@Test
	public void LoginWrongRegionTest() {
		PageLogin pageLogin =  new PageLogin(driver,environment);
		pageLogin.Login(Helpers.LoginPageHelpers.USER_VALUE, Helpers.LoginPageHelpers.PASS_VALUE,Helpers.LoginPageHelpers.WRONG_REGION_VALUE,Helpers.LoginPageHelpers.USER_TYPE_VALUE);
		pageLogin.assertWrongLogin();
	}
	
	// TCS-9
	@Test
	public void LoginWrongUserTypeTest() {
		PageLogin pageLogin =  new PageLogin(driver,environment);
		pageLogin.Login(Helpers.LoginPageHelpers.USER_VALUE, Helpers.LoginPageHelpers.PASS_VALUE,Helpers.LoginPageHelpers.REGION_VALUE,Helpers.LoginPageHelpers.WRONG_USER_TYPE_VALUE);		
		pageLogin.assertWrongLogin(environment);
	}
	
	// TCS-27
	@Test
	public void InvoiceStructureSIEVTest() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertEstructuraFolioSIEV();
	}
	
	// TCS-44
	@Test
	public void InvoicePerRegionSIEVTest() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion =  new PageEvaluacion(driver,environment);
		String folioA = pageEvaluacion.assertEstructuraFolioSIEV();
		pageEvaluacion.resetForm();
		String folioB = pageEvaluacion.assertEstructuraFolioSIEV();
		pageEvaluacion.assertFoliosPorRegion(folioA,folioB);
	}
	
	// TCS-28
	@Test
	public void assertMandatoryDataTest() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertEmptyFields();
	}
	
	// TCS-31
	@Test
	public void assertValidMail() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertValidMail();
	}
	
	// TCS-32
	@Test
	public void assertValidPhoneNumber() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertValidPhoneNumber();
	}
	
	// TCS-33
	@Test
	public void assertValidWorkPhoneNumber() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertValidWorkPhoneNumber();
	}
	
	// TCS-34
	@Test
	public void assertValidReferencePhoneNumber() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertValidReferencesPhoneNumber();
	}
	
	// TCS-35
	@Test
	public void assertAltaReferencias() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertAddReferences();
	}
	
	// TCS-36
	@Test
	public void assertFolioSISACT() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertGenerarFolioSISACT();
	}
	
	// TCS-37
	@Test
	public void assertClearScreen() {
		PageLogin pageLogin =  new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertClearScreen();
	}
	
	// TCS-39
	@Test
	public void assertBuroCredito() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertBuroCredito();
	}
	
	// TCS-40
	@Test
	public void assertDenyBuroCredito() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertDenyBuroCredito();
	}
	
	// TCS-41
	@Test
	public void assertCanalVenta() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertProyectoCanalVenta();
	}
	
	// TCS-61
	@Test
	public void assertPreventDoubleClick() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertPreventDoubleClick();
	}
	
	// TCS-58
	@Test
	public void assertNumericFields() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertOnlyNumericFields();
	}*/
	
	
	/** Integración Pruebas Alberto**/
	//TODO: TEST IF IT WORKS (VPN STOP WORKING)
	
	// TCS-42
	/*@Test
	public void assertRespuestaEvaluacion() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertRespuestaEvaluacion();
	}*/
	
	
	///// Faltan validar, se necesita VPN
	
	// TCS-18
	/*@Test
	public void assertDomicilioPersonal() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertDomicilioPersonal();
	}*/
	
	// TCS-10
	/*@Test
	public void assertCerrarSesion() {
		PageLogin pageLogin = new PageLogin(driver, environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver, environment);
		pageHome.assertLogout();
	}*/
	
	// TCS-11
	/*@Test
	public void assertDisplayActivaciones() {
		PageLogin pageLogin = new PageLogin(driver, environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.assertDisplayActivaciones();
	}*/
	
	// TCS-12
	/*@Test
	public void assertDisplayConsultas() {
		PageLogin pageLogin = new PageLogin(driver, environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver, environment);
		pageHome.assertDisplayConsultas();
	}*/
	
	// TCS-19
	/*@Test
	public void assertSessionExpired() {
		PageLogin pageLogin = new PageLogin(driver, environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver, environment);
		pageHome.assertSessionExpired();
	}*/
	
	// TCS-13
	/*@Test
	public void assertMandatoryPersonalFields() {
		PageLogin pageLogin = new PageLogin(driver, environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver, environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver, environment);
		pageEvaluacion.assertMandatoryPersonalFields();
	}*/
	
	// TCS-14
	/*@Test
	public void assertDateFormat() {
		PageLogin pageLogin = new PageLogin(driver, environment);
		pageLogin.Login();
		PageHome pageHome =  new PageHome(driver, environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver, environment);
		pageEvaluacion.assertDateFormat();
	}*/
	
	// TCS-17
	/*@Test
	public void assertGeneracionRFC() {
		PageLogin pageLogin = new PageLogin(driver, environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver, environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver, environment);
		pageEvaluacion.assertGeneracionRFC();
	}*/
	
	
	// TCS-20
	@Test
	public void assertInformacionCrediticia() {
		PageLogin pageLogin = new PageLogin(driver, environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver, environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver, environment);
		pageEvaluacion.assertInformacionCrediticia();
	}
	
	
	//TCS-56   FUNCIONA CORRECTAMENTE
	/*@Test
	public void Test() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver, environment);
		
		PageHome siev1 = new PageHome(driver,environment);
		PageHome siev2 = new PageHome(driver,environment);
		PageHome siev3 = new PageHome(driver,environment);
		siev.validacionDomicilioPer();
		siev1.PreparaEvaluacion();
		siev2.SiFirmaFisicaDoc();
		siev3.ClickBotonCapturarTicket();
	}*/
	
	
	
	// TCS-157
	/*@Test
	public void Test() {
			PageLogin pageLogin = new PageLogin(driver,environment);
			pageLogin.Login();
			PageHome pageHome = new PageHome(driver,environment);
			pageHome.openEvaluationMenu();
			PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
			pageEvaluacion.assertDomicilioPersonal();
			/*PageHome siev1 = new PageHome(driver,environment);
			PageHome siev2 = new PageHome(driver,environment);
			siev.validacionDomicilioPer();
			siev1.PreparaEvaluacion();
			siev2.EliminarPdfGenerado();			
	}*/
	
	
	@AfterMethod
	public void endTest() {
		driver.close();
	}
	
}
