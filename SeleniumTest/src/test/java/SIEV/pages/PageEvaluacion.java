package SIEV.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import SIEV.helpers.Helpers;

public class PageEvaluacion {
	private WebDriver driver;
	private By regionTypeDrop;
	private By canalTypeDrop;
	private By fuerzaVTypeDrop;
	private By movimientoTypeDrop;
	private By proyectoTypeDrop;
	private By tipoPlazoTypeDrop;
	private By formaPagoTypeDrop;
	private By lastNameField;
	private By secondLastNameField;
	private By firstNameField;
	private By secondNameField;
	private By calendarField;
	private By rfcButton;
	
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
		calendarField = By.id("formSiev:fechaNacimiento_input");
		rfcButton = By.id("formSiev:j_idt107");
	}

	
	public void assertEstructuraFolioSIEV() {
		driver.findElement(firstNameField).sendKeys(Helpers.EvaluacionPageHelpers.FIRST_NAME_VALUE);
		driver.findElement(secondNameField).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_NAME_VALUE);
		driver.findElement(lastNameField).sendKeys(Helpers.EvaluacionPageHelpers.LASTNAME_VALUE);
		driver.findElement(secondLastNameField).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_LASTNAME_VALUE);
		Select region = new Select(driver.findElement(regionTypeDrop));
		region.selectByVisibleText(Helpers.EvaluacionPageHelpers.REGION_VALUE);
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		Select canal = new Select(driver.findElement(canalTypeDrop));
		canal.selectByVisibleText(Helpers.EvaluacionPageHelpers.CANAL_VALUE);
		/*Select fuerzaVenta = new Select(driver.findElement(fuerzaVTypeDrop));
		fuerzaVenta.selectByVisibleText(Helpers.EvaluacionPageHelpers.FUERZA_VENTA_VALUE);
		Select movimiento = new Select(driver.findElement(movimientoTypeDrop));
		movimiento.selectByVisibleText(Helpers.EvaluacionPageHelpers.MOVIMIENTO_VALUE);
		Select proyecto = new Select(driver.findElement(proyectoTypeDrop));
		proyecto.selectByVisibleText(Helpers.EvaluacionPageHelpers.PROYECTO_VALUE);
		Select tipoPlazo = new Select(driver.findElement(tipoPlazoTypeDrop));
		tipoPlazo.selectByVisibleText(Helpers.EvaluacionPageHelpers.TIPO_PLAZO_VALUE);
		Select formaPago = new Select(driver.findElement(formaPagoTypeDrop));
		formaPago.selectByVisibleText(Helpers.EvaluacionPageHelpers.FORMA_PAGO_VALUE);*/
		driver.findElement(rfcButton).click();
	}
}
