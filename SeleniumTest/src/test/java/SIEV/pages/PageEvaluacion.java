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
	/*By for reset form*/
	private By resetForm;
	/*By's for Validar Adeudos*/
	private By capturaTicketsButton,noValidarButton,razonAdeudo,nuevaValidacion,firmaFButton,aceptaEvaluacionButton;
	/*By's for Datos Personales*/
	private By lugarNacimientoTypeDrop,sexoTypeDrop,curpField,tipoIdentTypeDrop;
	
	
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
		resetForm = By.id("formSiev:cleanBtn");
		capturaTicketsButton = By.id("formSiev:resultadoForm:btnTicketsAdeudo");
		noValidarButton = By.id("ticketsForm:j_idt308");
		razonAdeudo = By.id("ticketsForm:txtRAzonAdeudo");
		nuevaValidacion = By.id("ticketsForm:j_idt313");
		aceptaEvaluacionButton = By.id("formSiev:resultadoForm:aceptaEval");
		lugarNacimientoTypeDrop = By.id("datosClienteForm2:cmbLugNac_input");
		sexoTypeDrop = By.id("datosClienteForm2:cmbSexo_input");
		curpField = By.id("datosClienteForm2:txtCurp");
		tipoIdentTypeDrop = By.id("datosClienteForm2:cmbTipIdent_input");
	}

	
	public String assertEstructuraFolioSIEV() {
		setMovimiento();
		setTipoMovimiento();
		setEvaluacion();
		setDatosPersonales();
		setDomicilio();
		setInformacionCrediticia();
		preAutroizaEvaluacion();
		return autorizaEvaluacion();
	}
	
	public void resetForm() {
		driver.findElement(resetForm).click();
		Helpers.threadSleep(Helpers.tinySeconds);
	}
	
	public void assertFoliosPorRegion(String folioA, String folioB) {
		Assert.assertTrue(Integer.parseInt(folioA.substring(Helpers.EvaluacionPageHelpers.INVOICE_BEGIN_INDEX)) < Integer.parseInt(folioB.substring(Helpers.EvaluacionPageHelpers.INVOICE_BEGIN_INDEX)));
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
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(fillDomicilioButton).click();	
		Helpers.threadSleep(Helpers.defaultSeconds);
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
	
	private void preAutroizaEvaluacion() {
		driver.findElement(authButtonOne).click();
		driver.findElement(authButtonTwo).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(evaluacionButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
	}
	
	private String autorizaEvaluacion() {
		driver.findElement(firmaFisicaButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(confirmPreEvalButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(documentLink).click();
		Helpers.threadSleep(Helpers.mediumSeconds);
		driver.findElement(confirmEvalButton).click();
		Helpers.threadSleep(Helpers.longSeconds);
		Pattern pattern = Pattern.compile(new Helpers().new EvaluacionPageHelpers().getInvoicePattern(), Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(driver.findElement(folioSIEVResult).getText());		
		Assert.assertTrue(matcher.matches());
		return driver.findElement(folioSIEVResult).getText();
	}
	
	private void capturarTicketsAdeudo(){
		driver.findElement(capturaTicketsButton).click();
		Helpers.threadSleep(Helpers.defaultSeconds);
		driver.findElement(noValidarButton).click();
		Helpers.threadSleep(Helpers.defaultSeconds);
		driver.findElement(razonAdeudo).sendKeys(Helpers.EvaluacionPageHelpers.DEFAULT_REASON);
		driver.findElement(nuevaValidacion).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		autorizaEvaluacion();
		driver.findElement(aceptaEvaluacionButton).click();
		Helpers.threadSleep(Helpers.defaultSeconds);
		
	}
}
