package SIEV.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import SIEV.helpers.Helpers;

public class PageEvaluacion {
	private WebDriver driver;
	/*By's for Movimiento*/
	private By regionTypeDrop,canalTypeDrop,fuerzaVTypeDrop;
	/*By's for Tipo Movimiento*/
	private By movimientoTypeDrop,proyectoTypeDrop;
	/*By's for Evaluacion*/
	private By tipoPlazoTypeDrop,formaPagoTypeDrop;
	/*By's for Datos Personales*/
	private By lastNameField,secondLastNameField,firstNameField,secondNameField,fecNacField,rfcButton,fillDomicilioButton;
	/*By's for Domicilio*/
	private By contactoField;
	/*By's for Informacion Crediticia*/
	private By tarjetaTypeDrop,creditoAutoTypeDrop,creditoBancarioTypeDrop;
	/*By's for Autorizacion Evaluación*/
	private By authButtonOne,authButtonTwo,evaluacionButton,firmaFisicaButton,confirmPreEvalButton,documentLink,confirmEvalButton,folioSIEVResult;
	
	public PageEvaluacion (WebDriver driver) {
		this.driver = driver;
		regionTypeDrop = By.id("formSiev:region_input");
		canalTypeDrop = By.id("formSiev:canalVenta_input");
		fuerzaVTypeDrop = By.id("formSiev:fuerzaVenta_input");
		movimientoTypeDrop = By.id("formSiev:movimiento_input");
		proyectoTypeDrop = By.id("formSiev:proyecto_input");
		tipoPlazoTypeDrop = By.id("formSiev:tipoPlazo_input");
		formaPagoTypeDrop = By.id("formSiev:formaPago2_input");
		lastNameField = By.id("formSiev:apellidoPaterno");
		secondLastNameField = By.id("formSiev:apellidoMaterno");
		firstNameField = By.id("formSiev:Pnombre");
		secondNameField = By.id("formSiev:Snombre");
		fecNacField = By.id("formSiev:fechaNacimiento_input");
		rfcButton = By.id("formSiev:j_idt107");
		authButtonOne = By.id("formSiev:blnAuto1");
		authButtonTwo = By.id("formSiev:blnAuto2");
		tarjetaTypeDrop = By.id("formSiev:cmbTc_input");
		creditoAutoTypeDrop = By.id("formSiev:creditoAutomotriz_input");
		creditoBancarioTypeDrop = By.id("formSiev:creditoBancario_input");
		contactoField = By.id("formSiev:itNumContCli");
		evaluacionButton = By.id("formSiev:btnEval");
		fillDomicilioButton = By.id("formDlg:tblClientes:0:j_idt321");
		firmaFisicaButton = By.id("formDlg:btnFisica");
		confirmPreEvalButton = By.id("formDlg:btnSiPreEvalua");
		documentLink = By.xpath("/html/body/center[2]/form[4]/div[6]/div[2]/a");
		confirmEvalButton = By.id("formDlg:btnSiEvalua");
		folioSIEVResult = By.id("formSiev:resultadoForm:j_idt199");
	}

	
	public void assertEstructuraFolioSIEV() {
		setMovimiento();
		setTipoMovimiento();
		setEvaluacion();
		setDatosPersonales();
		setDomicilio();
		setInformacionCrediticia();
		autorizaEvaluacion();
	}
	
	private void setMovimiento() {
		Select region = new Select(driver.findElement(regionTypeDrop));
		region.selectByVisibleText(Helpers.EvaluacionPageHelpers.REGION_VALUE);
		Helpers.threadSleep(2);
		Select canal = new Select(driver.findElement(canalTypeDrop));
		canal.selectByVisibleText(Helpers.EvaluacionPageHelpers.CANAL_VALUE);
		Helpers.threadSleepMillis(800);
		Select fuerzaVenta = new Select(driver.findElement(fuerzaVTypeDrop));
		fuerzaVenta.selectByVisibleText(Helpers.EvaluacionPageHelpers.FUERZA_VENTA_VALUE);
	}
	
	private void setTipoMovimiento() {
		Select movimiento = new Select(driver.findElement(movimientoTypeDrop));
		movimiento.selectByVisibleText(Helpers.EvaluacionPageHelpers.MOVIMIENTO_VALUE);
		Select proyecto = new Select(driver.findElement(proyectoTypeDrop));
		proyecto.selectByVisibleText(Helpers.EvaluacionPageHelpers.PROYECTO_VALUE);
	}
	
	private void setEvaluacion() {
		Select tipoPlazo = new Select(driver.findElement(tipoPlazoTypeDrop));
		tipoPlazo.selectByVisibleText(Helpers.EvaluacionPageHelpers.TIPO_PLAZO_VALUE);
		Select formaPago = new Select(driver.findElement(formaPagoTypeDrop));
		formaPago.selectByVisibleText(Helpers.EvaluacionPageHelpers.FORMA_PAGO_VALUE);
	}
	
	private void setDatosPersonales() {
		driver.findElement(lastNameField).sendKeys(Helpers.EvaluacionPageHelpers.LASTNAME_VALUE);
		driver.findElement(secondLastNameField).clear();
		driver.findElement(secondLastNameField).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_LASTNAME_VALUE);
		driver.findElement(firstNameField).sendKeys(Helpers.EvaluacionPageHelpers.FIRST_NAME_VALUE);
		driver.findElement(secondNameField).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_NAME_VALUE);
		driver.findElement(fecNacField).sendKeys(Helpers.EvaluacionPageHelpers.FEC_NAC_VALUE);
		driver.findElement(rfcButton).click();
		Helpers.threadSleep(2);
		driver.findElement(fillDomicilioButton).click();	
		Helpers.threadSleep(1);
	}
	
	private void setDomicilio() {
		driver.findElement(contactoField).sendKeys(Helpers.EvaluacionPageHelpers.CONTACTO_VALUE);
	}
	
	private void setInformacionCrediticia() {
		Select tarjeta = new Select(driver.findElement(tarjetaTypeDrop));
		tarjeta.selectByVisibleText(Helpers.EvaluacionPageHelpers.TARJETA_VALUE);
		Select creditoAuto = new Select(driver.findElement(creditoAutoTypeDrop));
		creditoAuto.selectByVisibleText(Helpers.EvaluacionPageHelpers.CREDITO_AUTO);
		Select creditoBanco = new Select(driver.findElement(creditoBancarioTypeDrop));
		creditoBanco.selectByVisibleText(Helpers.EvaluacionPageHelpers.CREDITO_BANCO);
	}
	
	private void autorizaEvaluacion() {
		driver.findElement(authButtonOne).click();
		driver.findElement(authButtonTwo).click();
		Helpers.threadSleep(3);
		driver.findElement(evaluacionButton).click();
		Helpers.threadSleep(3);
		driver.findElement(firmaFisicaButton).click();
		Helpers.threadSleep(2);
		driver.findElement(confirmPreEvalButton).click();
		Helpers.threadSleep(2);
		driver.findElement(documentLink).click();
		Helpers.threadSleep(8);
		driver.findElement(confirmEvalButton).click();
		Helpers.threadSleep(10);
		Pattern pattern = Pattern.compile(new Helpers().new EvaluacionPageHelpers().getInvoicePattern(), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(driver.findElement(folioSIEVResult).getText());		
		Assert.assertTrue(matcher.matches());
	}
}
