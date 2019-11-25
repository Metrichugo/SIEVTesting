package SIEV.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import SIEV.helpers.Helpers;
import SIEV.test.Tests.Environment;

public class PageEvaluacion {
	private WebDriver driver;
	/* By's for Movimiento */
	private By regionTypeDrop, canalTypeDrop, fuerzaVTypeDrop;
	/* By's for Tipo Movimiento */
	private By movimientoTypeDrop, proyectoTypeDrop;
	/* By's for Evaluacion */
	private By tipoPlazoTypeDrop, formaPagoTypeDrop;
	/* By's for Datos Personales */
	private By lastNameField, secondLastNameField, firstNameField, secondNameField, fecNacField, rfcButton, rfcField,
			fillDomicilioButton;
	/* By's for Domicilio */
	private By contactoField, formDireccion;
	/* By's for Informacion Crediticia */
	private By tarjetaTypeDrop, creditoAutoTypeDrop, creditoBancarioTypeDrop;
	/* By's for Autorizacion Evaluaci�n */
	private By authButtonOne, authButtonTwo, evaluacionButton, firmaFisicaButton, confirmPreEvalButton, documentLink,
			confirmEvalButton, folioSIEVResult;
	/* By for reset form */
	private By resetForm;
	/* By's for Validar Adeudos */
	private By capturaTicketsButton, noValidarButton, razonAdeudo, nuevaValidacion, aceptaEvaluacionButton;
	/* By's for Datos Personales */
	private By lugarNacimientoTypeDrop, lugarNacimientoDiv, sexoTypeDrop, sexoDiv, curpField, tipoIdentTypeDrop,
			tipoIdentDiv, folioIdentField, mailField, mailConfirmField;
	/* By's for Domicilio */
	private By telefonoField, entreCalleAField, entreCalleBField;
	/* By's for Ocupaci�n */
	private By puestoField, telefonoTrabajoField, empresaField, generarSISACTButton;
	/* By's for Referencias */
	private By agregarReferenciaButton, nombreRefField, apellidosRefField, telefonoRefField, telOficinaRefField,
			addRefButton, nombreRefAdded, apellidosRefAdded, telefonoRefAdded;
	/* Others By's*/
	private By authBuroButton,resultBuro,resultEvaluacion,confirmaEvalSinBC,folioSISACT,noNameRefAdded,noApellidosRefAdded,noTelefonoRefAdded;

	public PageEvaluacion(WebDriver driver,Environment enviroment) {
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
		rfcField = By.id("formSiev:rfc");
		rfcButton = By.id("formSiev:j_idt107");
		authButtonOne = By.id("formSiev:blnAuto1");
		authButtonTwo = By.id("formSiev:blnAuto2");
		tarjetaTypeDrop = By.id("formSiev:cmbTc_input");
		creditoAutoTypeDrop = By.id("formSiev:creditoAutomotriz_input");
		creditoBancarioTypeDrop = By.id("formSiev:creditoBancario_input");
		formDireccion = By.id("formSiev:direccion");
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
		lugarNacimientoDiv = By.id("datosClienteForm2:cmbLugNac");
		sexoTypeDrop = By.id("datosClienteForm2:cmbSexo_input");
		sexoDiv = By.id("datosClienteForm2:cmbSexo");
		curpField = By.id("datosClienteForm2:txtCurp");
		tipoIdentTypeDrop = By.id("datosClienteForm2:cmbTipIdent_input");
		tipoIdentDiv = By.id("datosClienteForm2:cmbTipIdent");
		folioIdentField = By.id("datosClienteForm2:txtFolIdent");
		mailField = By.id("datosClienteForm2:txtEmail");
		mailConfirmField = By.id("datosClienteForm2:txtEmail2");
		telefonoField = By.id("datosClienteForm2:txtTelDom1");
		entreCalleAField = By.id("datosClienteForm2:txtEntre");
		entreCalleBField = By.id("datosClienteForm2:txtEntreY");
		puestoField = By.id("datosClienteForm2:txtOcupacionPuesto");
		telefonoTrabajoField = By.id("datosClienteForm2:txtDeTelefono");
		empresaField = By.id("datosClienteForm2:txtEmpresa");
		generarSISACTButton = By.id("datosClienteForm2:btnGenFolSisact");
		agregarReferenciaButton = By.id("datosClienteForm2:tblReferencias:j_idt278");
		nombreRefField = By.id("dlgRfrForm:txtNomRfr");
		apellidosRefField = By.id("dlgRfrForm:txtApeRfr");
		telefonoRefField = By.id("dlgRfrForm:txtTelDomRfr");
		telOficinaRefField = By.id("dlgRfrForm:txtTelOfiRfr");
		addRefButton = By.id("dlgRfrForm:btnAddUpdRfr");
		nombreRefAdded = By.id("datosClienteForm2:tblReferencias:0:j_idt280");
		apellidosRefAdded = By.id("datosClienteForm2:tblReferencias:0:j_idt282");
		telefonoRefAdded = By.id("datosClienteForm2:tblReferencias:0:j_idt284");
		resultEvaluacion = By.id("formSiev:REST");
		resultBuro = By.id("formSiev:RESbURO");
		authBuroButton = By.id("formSiev:j_idt142");
		confirmaEvalSinBC = By.id("formDlg:btnSiConfirmaSinBc");
		folioSISACT = By.id("datosClienteForm2:j_idt292");
		noNameRefAdded = By.id("datosClienteForm2:tblReferencias:2:j_idt280");
		noApellidosRefAdded = By.id("datosClienteForm2:tblReferencias:2:j_idt282");
		noTelefonoRefAdded = By.id("datosClienteForm2:tblReferencias:2:j_idt284");
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
		Helpers.threadSleepMillis(900);
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
		Pattern pattern = Pattern.compile(new Helpers().new EvaluacionPageHelpers().getInvoicePattern(),
				Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(driver.findElement(folioSIEVResult).getText());
		Assert.assertTrue(matcher.matches());
		return driver.findElement(folioSIEVResult).getText();
	}

	private void capturarTicketsAdeudo() {
		driver.findElement(capturaTicketsButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(noValidarButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(razonAdeudo).sendKeys(Helpers.EvaluacionPageHelpers.DEFAULT_REASON);
		driver.findElement(nuevaValidacion).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		autorizaEvaluacion();
		driver.findElement(aceptaEvaluacionButton).click();
		Helpers.threadSleep(Helpers.defaultSeconds);
	}

	private void capturaDatosPersonales() {
		Select lugarNacimiento = new Select(driver.findElement(lugarNacimientoTypeDrop));
		lugarNacimiento.selectByVisibleText(Helpers.EvaluacionPageHelpers.LUGAR_NACIMIENTO_VALUE);
		Select sexo = new Select(driver.findElement(sexoTypeDrop));
		sexo.selectByVisibleText(Helpers.EvaluacionPageHelpers.SEXO_VALUE);
		driver.findElement(curpField).sendKeys(Helpers.EvaluacionPageHelpers.CURP_VALUE);
		Select tipoIdent = new Select(driver.findElement(tipoIdentTypeDrop));
		tipoIdent.selectByVisibleText(Helpers.EvaluacionPageHelpers.TIPO_IDENT_VALUE);
		driver.findElement(folioIdentField).sendKeys(Helpers.EvaluacionPageHelpers.FOLIO_IDENT_VALUE);
		driver.findElement(mailField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_MAIL_VALUE);
		driver.findElement(mailConfirmField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_MAIL_VALUE);
		driver.findElement(telefonoField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE);
		driver.findElement(entreCalleAField).sendKeys(Helpers.EvaluacionPageHelpers.ENTRE_CALLEA_VALUE);
		driver.findElement(entreCalleBField).sendKeys(Helpers.EvaluacionPageHelpers.ENTRE_CALLEB_VALUE);
		driver.findElement(puestoField).sendKeys(Helpers.EvaluacionPageHelpers.OCUPACION_VALUE);
		driver.findElement(empresaField).sendKeys(Helpers.EvaluacionPageHelpers.EMPRESA_VALUE);
		driver.findElement(telefonoTrabajoField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE);
	}

	public void capturaDatosReferencia() {
		driver.findElement(nombreRefField).sendKeys(Helpers.EvaluacionPageHelpers.NOMBRE_REF_VALUE);
		driver.findElement(apellidosRefField).sendKeys(Helpers.EvaluacionPageHelpers.APELLIDOS_REF_VALUE);
		driver.findElement(telefonoRefField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE);
		driver.findElement(telOficinaRefField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE);
	}

	public void assertEmptyFields() {
		assertEstructuraFolioSIEV();
		capturarTicketsAdeudo();
		Helpers.threadSleep(Helpers.longSeconds);
		Assert.assertTrue(new Select(driver.findElement(lugarNacimientoTypeDrop)).getFirstSelectedOption().getText()
				.contains(Helpers.EvaluacionPageHelpers.DEFAULT_SELECTION_DROP));
		Assert.assertTrue(new Select(driver.findElement(sexoTypeDrop)).getFirstSelectedOption().getText()
				.contains(Helpers.EvaluacionPageHelpers.DEFAULT_SELECTION_DROP));
		Assert.assertTrue(driver.findElement(curpField).getText().isEmpty());
		Assert.assertTrue(new Select(driver.findElement(tipoIdentTypeDrop)).getFirstSelectedOption().getText()
				.contains(Helpers.EvaluacionPageHelpers.DEFAULT_SELECTION_DROP));
		Assert.assertTrue(driver.findElement(folioIdentField).getText().isEmpty());
		Assert.assertTrue(driver.findElement(mailField).getText().isEmpty());
		Assert.assertTrue(driver.findElement(mailConfirmField).getText().isEmpty());
		Assert.assertTrue(driver.findElement(telefonoField).getText().isEmpty());
		Assert.assertTrue(driver.findElement(entreCalleAField).getText().isEmpty());
		Assert.assertTrue(driver.findElement(entreCalleBField).getText().isEmpty());
		Assert.assertTrue(driver.findElement(puestoField).getText().isEmpty());
		Assert.assertTrue(driver.findElement(telefonoTrabajoField).getText().isEmpty());
		Assert.assertTrue(driver.findElement(empresaField).getText().isEmpty());
		Helpers.threadSleep(Helpers.defaultSeconds);
		driver.findElement(generarSISACTButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		Assert.assertTrue(checkUIStateError(lugarNacimientoDiv));
		Assert.assertTrue(checkUIStateError(sexoDiv));
		Assert.assertTrue(checkUIStateError(curpField));
		Assert.assertTrue(checkUIStateError(tipoIdentDiv));
		Assert.assertTrue(checkUIStateError(folioIdentField));
		Assert.assertTrue(checkUIStateError(mailField));
		Assert.assertTrue(checkUIStateError(mailConfirmField));
		Assert.assertTrue(checkUIStateError(telefonoField));
		Assert.assertTrue(checkUIStateError(entreCalleAField));
		Assert.assertTrue(checkUIStateError(entreCalleBField));
		Assert.assertTrue(checkUIStateError(puestoField));
		Assert.assertTrue(checkUIStateError(telefonoTrabajoField));
		Assert.assertTrue(checkUIStateError(empresaField));
	}

	public void assertValidMail() {
		assertEstructuraFolioSIEV();
		capturarTicketsAdeudo();
		Helpers.threadSleep(Helpers.longSeconds);
		Pattern pattern = Pattern.compile(Helpers.EvaluacionPageHelpers.VALID_MAIL_REGEX);
		driver.findElement(mailField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_MAIL_VALUE);
		Matcher matcher = pattern
				.matcher(driver.findElement(mailField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertTrue(matcher.matches());
		driver.findElement(mailField).clear();
		driver.findElement(mailField).sendKeys(Helpers.EvaluacionPageHelpers.INVALID_MAIL_VALUE);
		matcher = pattern
				.matcher(driver.findElement(mailField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertFalse(matcher.matches());
	}

	public void assertValidPhoneNumber() {
		assertEstructuraFolioSIEV();
		capturarTicketsAdeudo();
		Helpers.threadSleep(Helpers.longSeconds);
		Pattern pattern = Pattern.compile(Helpers.EvaluacionPageHelpers.VALID_PHONE_REGEX, Pattern.MULTILINE);
		driver.findElement(telefonoField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE);
		Matcher matcher = pattern
				.matcher(driver.findElement(telefonoField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertTrue(matcher.matches());
		driver.findElement(telefonoField).clear();
		driver.findElement(telefonoField).sendKeys(Helpers.EvaluacionPageHelpers.INVALID_PHONE_VALUE);
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		matcher = pattern
				.matcher(driver.findElement(telefonoField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertFalse(matcher.matches());
	}

	public void assertValidWorkPhoneNumber() {
		assertEstructuraFolioSIEV();
		capturarTicketsAdeudo();
		Helpers.threadSleep(Helpers.longSeconds);
		Pattern pattern = Pattern.compile(Helpers.EvaluacionPageHelpers.VALID_PHONE_REGEX, Pattern.MULTILINE);
		driver.findElement(telefonoTrabajoField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE);
		Matcher matcher = pattern.matcher(
				driver.findElement(telefonoTrabajoField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertTrue(matcher.matches());
		driver.findElement(telefonoTrabajoField).clear();
		driver.findElement(telefonoTrabajoField).sendKeys(Helpers.EvaluacionPageHelpers.INVALID_PHONE_VALUE);
		Helpers.threadSleep(Helpers.tinySeconds);
		matcher = pattern.matcher(
				driver.findElement(telefonoTrabajoField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertFalse(matcher.matches());
	}

	public void assertValidReferencesPhoneNumber() {
		assertEstructuraFolioSIEV();
		capturarTicketsAdeudo();
		Helpers.threadSleep(Helpers.longSeconds);
		capturaDatosPersonales();
		driver.findElement(agregarReferenciaButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		Pattern pattern = Pattern.compile(Helpers.EvaluacionPageHelpers.VALID_PHONE_REGEX, Pattern.MULTILINE);
		driver.findElement(telefonoRefField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE);
		Matcher matcher = pattern.matcher(
				driver.findElement(telefonoRefField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertTrue(matcher.matches());
		driver.findElement(telefonoRefField).clear();
		driver.findElement(telefonoRefField).sendKeys(Helpers.EvaluacionPageHelpers.INVALID_PHONE_VALUE);
		Helpers.threadSleep(Helpers.tinySeconds);
		matcher = pattern.matcher(
				driver.findElement(telefonoRefField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertFalse(matcher.matches());
	}

	public void assertAddReferences() {
		assertEstructuraFolioSIEV();
		capturarTicketsAdeudo();
		Helpers.threadSleep(Helpers.longSeconds);
		capturaDatosPersonales();
		driver.findElement(agregarReferenciaButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		capturaDatosReferencia();
		driver.findElement(addRefButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(agregarReferenciaButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		capturaDatosReferencia();
		driver.findElement(addRefButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		Assert.assertTrue(driver.findElement(nombreRefAdded).getText().contains(Helpers.EvaluacionPageHelpers.NOMBRE_REF_VALUE));
		Assert.assertTrue(driver.findElement(apellidosRefAdded).getText().contains(Helpers.EvaluacionPageHelpers.APELLIDOS_REF_VALUE));
		Assert.assertTrue(driver.findElement(telefonoRefAdded).getText().contains(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE));
	}

	public void assertGenerarFolioSISACT() {
		assertAddReferences();
		driver.findElement(generarSISACTButton).click();
		Helpers.threadSleep(Helpers.mediumSeconds);
		System.out.println(driver.findElement(folioSISACT).getText());
		System.out.println(driver.findElement(noNameRefAdded).getText());
		Assert.assertTrue(driver.findElement(folioSISACT).getText().contains(Helpers.EvaluacionPageHelpers.ERROR_FOLIO_SISACT));
		Assert.assertTrue(driver.findElement(noNameRefAdded).getText().contains(Helpers.EvaluacionPageHelpers.NO_APLICA_VALUE));
		Assert.assertTrue(driver.findElement(noApellidosRefAdded).getText().contains(Helpers.EvaluacionPageHelpers.NO_APLICA_VALUE));
	}

	public void assertClearScreen() {
		assertAddReferences();
		resetForm();
		Assert.assertTrue(compareSelectedOption(regionTypeDrop));
		Assert.assertTrue(compareSelectedOption(canalTypeDrop));
		Assert.assertTrue(compareSelectedOption(fuerzaVTypeDrop));
		Assert.assertTrue(compareSelectedOption(movimientoTypeDrop));
		Assert.assertTrue(compareSelectedOption(proyectoTypeDrop));
		Assert.assertTrue(compareSelectedOption(tipoPlazoTypeDrop));
		Assert.assertTrue(compareSelectedOption(formaPagoTypeDrop));
		Assert.assertTrue(isFieldEmpty(lastNameField));
		Assert.assertTrue(isFieldEmpty(firstNameField));
		Assert.assertTrue(isFieldEmpty(fecNacField));
		Assert.assertTrue(isFieldEmpty(rfcField));
		Assert.assertTrue(driver.findElements(formDireccion).isEmpty());
	}
	
	public void assertBuroCredito() {
		assertEstructuraFolioSIEV();
		Helpers.threadSleep(Helpers.longSeconds);
		Assert.assertTrue(driver.findElement(resultEvaluacion).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.EXITO_VALUE));
		Assert.assertTrue(driver.findElement(resultBuro).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.RESULTADO_BURO_VALUE));
	}
	
	public void assertDenyBuroCredito() {
		setMovimiento();
		setTipoMovimiento();
		setEvaluacion();
		setDatosPersonales();
		setDomicilio();
		driver.findElement(authBuroButton).click();
		setInformacionCrediticia();
		preAutroizaEvaluacion();
		driver.findElement(confirmaEvalSinBC).click();
		Helpers.threadSleep(Helpers.longSeconds);
		Assert.assertTrue(driver.findElement(resultEvaluacion).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.EXITO_VALUE));
		Assert.assertTrue(driver.findElement(resultBuro).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.RESULTADO_BURO_VALUE));
	}
	
	public void assertProyectoCanalVenta() {
		Select region = new Select(driver.findElement(regionTypeDrop));
		region.selectByVisibleText(Helpers.EvaluacionPageHelpers.REGION_VALUE);
		Helpers.threadSleep(2);
		Select canal = new Select(driver.findElement(canalTypeDrop));
		canal.selectByVisibleText(Helpers.EvaluacionPageHelpers.CANAL_VENTAS_TEL_VALUE);
		Helpers.threadSleep(Helpers.tinySeconds);
		Select fuerzaVenta = new Select(driver.findElement(fuerzaVTypeDrop));
		fuerzaVenta.selectByVisibleText(Helpers.EvaluacionPageHelpers.FUERZA_VENTA_VENTAS_VALUE);
		setTipoMovimiento();
		setEvaluacion();
		setDatosPersonales();
		setDomicilio();
		Assert.assertTrue(driver.findElements(authBuroButton).isEmpty());
		setInformacionCrediticia();
		preAutroizaEvaluacion();
		driver.findElement(confirmaEvalSinBC).click();
		Helpers.threadSleep(Helpers.longSeconds);
		Assert.assertTrue(driver.findElement(resultEvaluacion).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.EXITO_VALUE));
		Assert.assertTrue(driver.findElement(resultBuro).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.RESULTADO_BURO_VALUE));
	}
	
	public void assertPreventDoubleClick() {
		Actions actions = new Actions(driver);
		setMovimiento();
		setTipoMovimiento();
		setEvaluacion();
		driver.findElement(lastNameField).sendKeys(Helpers.EvaluacionPageHelpers.LASTNAME_VALUE);
		driver.findElement(secondLastNameField).clear();
		driver.findElement(secondLastNameField).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_LASTNAME_VALUE);
		driver.findElement(firstNameField).sendKeys(Helpers.EvaluacionPageHelpers.FIRST_NAME_VALUE);
		driver.findElement(secondNameField).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_NAME_VALUE);
		driver.findElement(fecNacField).sendKeys(Helpers.EvaluacionPageHelpers.FEC_NAC_VALUE);
		actions.doubleClick(driver.findElement(rfcButton)).perform();
		Assert.assertTrue(driver.findElement(rfcButton).getAttribute(Helpers.EvaluacionPageHelpers.CLASS_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.DISABLED_STATE));
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(fillDomicilioButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		setDomicilio();
		setInformacionCrediticia();
		preAutroizaEvaluacion();
		driver.findElement(firmaFisicaButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(confirmPreEvalButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		driver.findElement(documentLink).click();
		Helpers.threadSleep(Helpers.mediumSeconds);
		actions.doubleClick(driver.findElement(confirmEvalButton)).perform();
		Assert.assertTrue(driver.findElement(confirmEvalButton).getAttribute(Helpers.EvaluacionPageHelpers.CLASS_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.DISABLED_STATE));		
		Helpers.threadSleep(Helpers.longSeconds);
		capturarTicketsAdeudo();
		Helpers.threadSleep(Helpers.longSeconds);
		capturaDatosPersonales();
		driver.findElement(agregarReferenciaButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		capturaDatosReferencia();
		driver.findElement(addRefButton).click();
		Helpers.threadSleep(Helpers.tinySeconds);
		actions.doubleClick(driver.findElement(generarSISACTButton)).perform();
		Assert.assertTrue(driver.findElement(generarSISACTButton).getAttribute(Helpers.EvaluacionPageHelpers.CLASS_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.DISABLED_STATE));
		// TODO: Falta el bot�n del CURP porque el servicio no es funcional
	}
	
	public void assertOnlyNumericFields() {
		assertEstructuraFolioSIEV();
		capturarTicketsAdeudo();
		Helpers.threadSleep(Helpers.longSeconds);
		Pattern pattern = Pattern.compile(Helpers.EvaluacionPageHelpers.VALID_PHONE_REGEX, Pattern.MULTILINE);
		driver.findElement(telefonoField).sendKeys(Helpers.EvaluacionPageHelpers.VALID_PHONE_VALUE);
		Matcher matcher = pattern
				.matcher(driver.findElement(telefonoField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertTrue(matcher.matches());
		driver.findElement(telefonoField).clear();
		driver.findElement(telefonoField).sendKeys(Helpers.EvaluacionPageHelpers.INVALID_PHONE_VALUE);
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		matcher = pattern
				.matcher(driver.findElement(telefonoField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE));
		Assert.assertFalse(matcher.matches());
	}

	private boolean isFieldEmpty(By byField) {
		return driver.findElement(byField).getAttribute(Helpers.EvaluacionPageHelpers.VALUE_ATTRIBUTE).isEmpty();
	}

	private boolean compareSelectedOption(By bySelect) {
		return new Select(driver.findElement(bySelect)).getFirstSelectedOption().getText().contains(Helpers.EvaluacionPageHelpers.SELECTION_DROP_CUST);
	}

	private boolean checkUIStateError(By byCondition) {
		return driver.findElement(byCondition).getAttribute(Helpers.EvaluacionPageHelpers.CLASS_ATTRIBUTE).contains(Helpers.EvaluacionPageHelpers.ERROR_STATE);
	}

}
