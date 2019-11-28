package SIEV.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import SIEV.helpers.Helpers;
import SIEV.test.Tests.Environment;

public class PageHome {

	Environment environment;
	
	private WebDriver driver;
	private By menuButton;
	private By evaluacionButton;
	private By evaluacionActivacionButton;

	private By cerrarSecionB;
	private By evaluacionSiev;
	private By evaluacionActiv;
	private By consultRep;
	private By consultaFolio;
	private By imagenEvaluacionS;
	private By imagenEvaluacion;
	private By apellidoPater;
	private By apellidoMaterno;
	private By primerNombre;
	private By segundoNombre;
	private By fecha;
	private By region;
	private By regionR09;
	private By generarRfcp;
	private By generarRfcFaiure;
	private By valformatoFecha;
	
	private By canalVenta;
	private By canalVentaSelec;
	private By fuerzaDventa;
	private By fuerzaDventaSelect;
	private By movimientosB;
	private By movimientosSelect;
	private By proyectoB;
	private By proyectoSelect;
	private By tipoPlazoB;
	private By tipoPlazoSelect;
	private By formaPagoB;
	private By formaPagoSelect;
	
	private By imagenMenorEdad;
	private By imageDatPer;
	private By RFC;
	
	private By calle;
	private By NumExterir;
	private By NumInte;
	private By ColonPobla;
	private By ciudad;
	private By deleGacioMuni;
	private By estado;
	private By codigoPostal;
	private By NumeroCotact;
	private By NumUno;
	
	private By botonValidarDatos;
	private By botonValidarBuro;
	private By botonPrepararEvalu;
	private By ventanaSEleccDatos;
	
	private By imagenErrorDomPer;
	
	private By numeroContactoCliente;
	private By BotoncreditoAutomotriz;
	private By SelectcreditoAutomotriz;
	private By ultimosDigitos;
	private By BotonCreditoBan;
	private By SelectCreditoBan;
	private By BotonTarjetaCredito;
	private By SelectTarjetaCredito;
	
	private By ImagenModoFirma;
	private By BotonFirmaFisica;
	private By BotonDatosConfirmadosEvaluacion;
	private By BotonDocImpresoClienteEvaluar;
	private By ImagenNoImpresionSolicitud;
	
	private By BotonDescargaDocInvesPersoFisi;
	private By BotonCancelarCambiareDatos;
	
	private By BotonFirmaElectronica;
	private By BotonFrimaElactronicaDatosConfPrepEvalu;
	private By BotonFirmaElectronicaCancelarCambiarDatos;
	
	private By ImagenCapturaTickets;
	private By ImagenRespuestaEvaluacion;
	
	private By BotonCerrar;
	
	
	public PageHome(WebDriver driver,Environment enviroment) {
		this.driver = driver;
		menuButton = By.id("menuForm:btnMenu");
		evaluacionButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[2]");
		evaluacionActivacionButton = By.xpath("/html/body/div[3]/div/div[1]/ul/li[2]/ul/li");
		
cerrarSecionB = By.xpath("/html/body/div[3]/div/div[1]/ul/li[1]/a");
		
		evaluacionSiev = By.xpath("/html/body/div[3]/div/div[1]/ul/li[2]");
		evaluacionActiv = By.xpath("/html/body/div[3]/div/div[1]/ul/li[2]/ul/li");
		imagenEvaluacionS = By.xpath("/html/body/center[2]/form[1]/div[1]/div[1]/div[1]");
		
		consultRep = By.xpath("/html/body/div[3]/div/div[1]/ul/li[3]");
		consultaFolio = By.xpath("/html/body/div[3]/div/div[1]/ul/li[3]/ul/li");
		
		imagenEvaluacion = By.xpath("/html/body/div[4]/form/div[2]/div/table[1]/thead/tr/th/div");
		
		apellidoPater = By.xpath("/html/body/center[2]/form[1]/div[1]/div[4]/div[2]/div/table/tbody/tr[1]/td[1]/input");
		apellidoMaterno = By.xpath("/html/body/center[2]/form[1]/div[1]/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/input");
		primerNombre = By.xpath("/html/body/center[2]/form[1]/div[1]/div[4]/div[2]/div/table/tbody/tr[2]/td[1]/input");
		segundoNombre = By.xpath("/html/body/center[2]/form[1]/div[1]/div[4]/div[2]/div/table/tbody/tr[2]/td[2]/input");
		fecha = By.xpath("/html/body/center[2]/form[1]/div[1]/div[4]/div[2]/div/table/tbody/tr[3]/td[1]/span/input");
		
		region = By.xpath("/html/body/center[2]/form[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/label");
		regionR09 = By.xpath("/html/body/div[4]/div/ul/li[10]");
		
		generarRfcp = By.id("formSiev:j_id_40");//VALOR CAMBIA  
		generarRfcFaiure = By.xpath("/html/body/center[1]/div");
		valformatoFecha = By.xpath("/html/body/center[1]/div/div/ul/li[8]");
	//	/html/body/center[2]/form[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/span
		////*[@id=\"formSiev:canalVenta\"]/div[3]/span
		 canalVenta = By.xpath("/html/body/center[2]/form[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/label");
		 canalVentaSelec= By.xpath("/html/body/div[13]/div/ul/li[2]");
		 
		fuerzaDventa = By.xpath("//*[@id=\"formSiev:fuerzaVenta\"]/div[3]");
	 fuerzaDventaSelect = By.xpath("//*[@id=\"formSiev:fuerzaVenta_5\"]");
	 movimientosB = By.xpath("/html/body/center[2]/form[1]/div[1]/div[2]/div[2]/div/div[1]/div[3]/span");
	 movimientosSelect = By.xpath("/html/body/div[5]/div/ul/li[2]");
	 proyectoB = By.xpath("/html/body/center[2]/form[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/span");
	 proyectoSelect = By.xpath("/html/body/div[6]/div/ul/li[2]");
	 tipoPlazoB = By.xpath("/html/body/center[2]/form[1]/div[1]/div[3]/div[2]/div/table/tbody/tr/td[1]/div/div[3]/span");
	tipoPlazoSelect = By.xpath("/html/body/div[7]/div/ul/li[3]");
	formaPagoB = By.xpath("/html/body/center[2]/form[1]/div[1]/div[3]/div[2]/div/table/tbody/tr/td[2]/div/div[3]/span");
	formaPagoSelect = By.xpath("/html/body/div[8]/div/ul/li[2]");
	
	imagenMenorEdad = By.xpath("/html/body/center[1]/div");
	imageDatPer = By.xpath("/html/body/center[2]/form[1]/div/div[5]");
	RFC = By.id("formSiev:rfc");
	
	
	 calle = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/table/tbody/tr[1]/td[1]/input");
	 NumExterir = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/table/tbody/tr[1]/td[2]/input");
	NumInte = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/table/tbody/tr[1]/td[3]/input");
	ColonPobla = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/table/tbody/tr[1]/td[4]/input");
	ciudad = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/table/tbody/tr[2]/td[1]/input");
	deleGacioMuni = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/table/tbody/tr[2]/td[2]/input");
	estado = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/label");
	codigoPostal = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/table/tbody/tr[2]/td[4]/input");
	 NumeroCotact = By.xpath("/html/body/center[2]/form[1]/div/div[5]/div[2]/div/table/tbody/tr/td[2]/input");
	 NumUno = By.id("formDlg:tblClientes:0:j_id_cm");//cambio antes ->"formDlg:tblClientes:0:j_idt321"
	 
	 
		botonValidarDatos =By.id("formSiev:blnAuto1") ;
		botonValidarBuro = By.id("formSiev:blnAuto2");
		botonPrepararEvalu = By.id("formSiev:btnEval");
		ventanaSEleccDatos = By.xpath("/html/body/center[2]/form[4]/div[1]/div[1]/a");
		
		
		imagenErrorDomPer = By.id("messagesEncabezado");
		
		numeroContactoCliente = By.id("formSiev:itNumContCli");
		ultimosDigitos = By.id("formSiev:txtUlt4DigTc");
		
		BotoncreditoAutomotriz = By.id("formSiev:creditoAutomotriz_label");
		SelectcreditoAutomotriz = By.xpath("/html/body/div[13]/div/ul/li[2]");
		BotonCreditoBan = By.id("formSiev:creditoBancario_label");
		SelectCreditoBan= By.xpath("/html/body/div[14]/div/ul/li[2]");
		
		BotonTarjetaCredito = By.id("formSiev:cmbTc_label");
		SelectTarjetaCredito = By.xpath("/html/body/div[13]/div/ul/li[2]");
		
		
		ImagenModoFirma = By.id("formDlg:dlgSelFirma");
		
		BotonFirmaFisica = By.id("formDlg:btnFisica");
		BotonDatosConfirmadosEvaluacion = By.id("formDlg:btnSiPreEvalua");
		BotonDocImpresoClienteEvaluar = By.id("formDlg:btnSiEvalua");
		
		ImagenNoImpresionSolicitud = By.id("messagesEncabezado");
		
		BotonDescargaDocInvesPersoFisi = By.xpath("/html/body/center[2]/form[4]/div[6]/div[2]/a");
		
		BotonCancelarCambiareDatos = By.id("formDlg:btnNoPreEvalua");
		
		BotonFirmaElectronica = By.id("formDlg:btnElectronica");
		BotonFrimaElactronicaDatosConfPrepEvalu = By.id("formDlg:btnSiPreEvaluaElectro");
		BotonFirmaElectronicaCancelarCambiarDatos = By.id("formDlg:btnNoPreEvaluaElectro");
		
		ImagenCapturaTickets = By.id("formSiev:resultadoForm:btnTicketsAdeudo");
		ImagenRespuestaEvaluacion = By.id("formSiev:panelEvaluacion1");
		
		
	}
	
	public void openEvaluationMenu() {
		driver.findElement(menuButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(evaluacionButton).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(evaluacionActivacionButton).click();
	}
	
	//TCS - 10
	
		public void CerrarSecion() {
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(cerrarSecionB).click();
				
		}
		
		//TCS - 11
		
		public boolean opcionEvaluacionActivaciones() {
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionSiev).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionActiv).click();
			
			if(driver.findElement(imagenEvaluacionS).isDisplayed()) {
				
				return true;
				
			}else {
				
				return false;
			}

			
		}
		
		//TCS - 12
		
		public boolean consultsReportes() {
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);	
			driver.findElement(consultRep).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(consultaFolio).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			if(driver.findElement(imagenEvaluacion).isDisplayed()) {
				
				return true;
				
			}else {
				
				return false;
			}
			
		}
		
		
		public void waitTime() {
			
			PageLogin login = new PageLogin(driver,environment);
			login.Login();
			
		}
		
		public void DatosPersonales() {
			
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionSiev).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionActiv).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(region).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(regionR09).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(apellidoPater).sendKeys("Alberto");
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(apellidoMaterno).sendKeys("Alberto");
			driver.findElement(primerNombre).sendKeys("Alberto");
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(segundoNombre).sendKeys("Oscar");
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fecha).sendKeys("25/09/2019");
				
		}
		
		
		//TCS - 13
		public boolean generarRfc() {
			
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionSiev).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionActiv).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(generarRfcp).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(BotonCerrar).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			
			if(driver.findElement(generarRfcFaiure).isDisplayed()) {
			
			return true;
			
		}else {
			
		return false;
		}
		}
		
		//TCS - 14
		public boolean fechaFormato() {
			
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionSiev).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionActiv).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(fecha).sendKeys("25-09-2019");
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(generarRfcp).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(BotonCerrar).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			if(driver.findElement(valformatoFecha).isDisplayed()) {
				
				return true;
			}else {
				
				return false;
			}
				
		}
		
		//TCS - 15
		
		//TCS - 16 
		
		//TCS - 24
		public boolean ValidacionEdad() {
			
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionSiev).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionActiv).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(region).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(regionR09).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(canalVenta).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(canalVentaSelec).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
		
			driver.findElement(fuerzaDventa).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fuerzaDventaSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(movimientosB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(movimientosSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(proyectoB).click();		
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(proyectoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(tipoPlazoB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(tipoPlazoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(formaPagoB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(formaPagoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(apellidoPater).sendKeys(Helpers.EvaluacionPageHelpers.LASTNAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(primerNombre).sendKeys(Helpers.EvaluacionPageHelpers.FIRST_NAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(segundoNombre).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_LASTNAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fecha).sendKeys("25/09/2010");
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(generarRfcp).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(BotonCerrar).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			
			
			if(driver.findElement(imagenMenorEdad).isDisplayed()) {
				return true;
			}else {
				
				return false;
			}
		
			
		}
		
		// TCS - 17 
		
		public boolean Rfc () {
			
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionSiev).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionActiv).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(region).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(regionR09).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(canalVenta).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(canalVentaSelec).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(fuerzaDventa).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fuerzaDventaSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(movimientosB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(movimientosSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(proyectoB).click();		
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(proyectoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(tipoPlazoB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(tipoPlazoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(formaPagoB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(formaPagoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(apellidoPater).sendKeys(Helpers.EvaluacionPageHelpers.LASTNAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(apellidoMaterno).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_NAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(primerNombre).sendKeys(Helpers.EvaluacionPageHelpers.FIRST_NAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(segundoNombre).sendKeys(Helpers.EvaluacionPageHelpers.SECOND_LASTNAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fecha).sendKeys(Helpers.EvaluacionPageHelpers.FECHA_NACIMIENTO);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(generarRfcp).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(BotonCerrar).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			if((driver.findElement(RFC))!= null) {
				
				return true;
			}else {
				
				return false;
				
			}
			
			
		}
		
		//TCS-18
		public boolean validacionDomicilioPer() {
			
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionSiev).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionActiv).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(region).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(regionR09).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(canalVenta).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(canalVentaSelec).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(fuerzaDventa).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fuerzaDventaSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(movimientosB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(movimientosSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(proyectoB).click();		
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(proyectoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(tipoPlazoB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(tipoPlazoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(formaPagoB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(formaPagoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(apellidoPater).sendKeys(Helpers.EvaluacionPageHelpers.LASTNAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(apellidoMaterno).clear();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(apellidoMaterno).sendKeys("DOMINGO");;
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(primerNombre).sendKeys(Helpers.EvaluacionPageHelpers.FIRST_NAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(segundoNombre).clear();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fecha).sendKeys(Helpers.EvaluacionPageHelpers.FECHA_NACIMIENTO);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(generarRfcp).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(NumUno).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			
			 if(driver.findElement(calle)!=null&&driver.findElement(NumExterir)!=null
					 &&driver.findElement(ColonPobla)!=null&&driver.findElement(ciudad)!=null
					 &&driver.findElement(deleGacioMuni)!=null&&driver.findElement(codigoPostal)!=null
					 &&driver.findElement(NumeroCotact)!=null&&driver.findElement(estado).getText()!="SELECT") {
				 
				 return true;
			 }else {
				 
				 return false;
			 }
			
			
		}
		
		
		//TCS-20
		public boolean segunPantallaValdCamposObli() {
			
			driver.findElement(menuButton).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionSiev).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(evaluacionActiv).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(region).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(regionR09).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(canalVenta).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(canalVentaSelec).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(fuerzaDventa).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fuerzaDventaSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(movimientosB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(movimientosSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(proyectoB).click();		
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(proyectoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(tipoPlazoB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(tipoPlazoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(formaPagoB).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(formaPagoSelect).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			
			driver.findElement(apellidoPater).sendKeys(Helpers.EvaluacionPageHelpers.LASTNAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(apellidoMaterno).clear();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(apellidoMaterno).sendKeys("DOMINGO");;
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(primerNombre).sendKeys(Helpers.EvaluacionPageHelpers.FIRST_NAME_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(segundoNombre).clear();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(fecha).sendKeys(Helpers.EvaluacionPageHelpers.FECHA_NACIMIENTO);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(generarRfcp).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(ventanaSEleccDatos).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(botonValidarDatos).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(botonValidarBuro).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(botonPrepararEvalu).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			
			if(driver.findElement(imagenErrorDomPer).isDisplayed()) {
				
				return true;
				
			}else {
				
				return false;
				
			}
					
		}
		
		//TCS-21
		
		public boolean PreparaEvaluacion() {
			
			
			driver.findElement(numeroContactoCliente).sendKeys(Helpers.EvaluacionPageHelpers.CONTACTO_VALUE);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(BotonTarjetaCredito).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(SelectTarjetaCredito).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(BotoncreditoAutomotriz).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(SelectcreditoAutomotriz).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(BotonCreditoBan).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(SelectCreditoBan).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			
			driver.findElement(botonValidarDatos).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(botonValidarBuro).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(botonPrepararEvalu).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			if(driver.findElement(ImagenModoFirma).isDisplayed()) {
				
				return true;
				
			}else {
				
				return false;
			}
			
			
		}
		
		//TCS-23
		
		public boolean NoFirmaFisicaDoc() {
			
			driver.findElement(BotonFirmaFisica).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(BotonDatosConfirmadosEvaluacion).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(BotonDocImpresoClienteEvaluar).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			if(driver.findElement(ImagenNoImpresionSolicitud).isDisplayed()) {
			
				return true;
				
			}else {
				
				return false;
			}
			
			
		}
		
		//TCS-22
		public void SiFirmaFisicaDoc() {
			
			driver.findElement(BotonFirmaFisica).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			driver.findElement(BotonDatosConfirmadosEvaluacion).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(BotonDescargaDocInvesPersoFisi).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			
			driver.findElement(BotonDocImpresoClienteEvaluar).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
				
		}
		
		//TCS-22 A
	public void SiFirmaFisicaDocCanselarCambiarDatos() {
			
			driver.findElement(BotonFirmaFisica).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
			driver.findElement(BotonCancelarCambiareDatos).click();
			Helpers.threadSleepMillis(Helpers.defaultMillis);
			
				
		}

	//TCS-25
	public void SifirmaElectronica() {
		
		driver.findElement(BotonFirmaElectronica).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		
		driver.findElement(BotonFrimaElactronicaDatosConfPrepEvalu).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		
		
	}

	//TCS-25 A
	public void SifirmaElectronicaCancelarCambiarDatos() {
		
		driver.findElement(BotonFirmaElectronica).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		
		driver.findElement(BotonFirmaElectronicaCancelarCambiarDatos).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		
		
	}

	//TCS - 55

	public boolean BotonBandejaDEPago() {
		
		Helpers.threadSleepMillis(Helpers.defaultMillis1);
		
		
		if(driver.findElement(ImagenCapturaTickets).isDisplayed()) {
			
			return true;
			
		}else {
			
			return false;
			
		}
			
	}

	//TCS-56

	public void ClickBotonCapturarTicket() {
		
		Helpers.threadSleepMillis(Helpers.defaultMillis1);
		
		driver.findElement(ImagenCapturaTickets).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		
	}

	//TCS-42
	public boolean VisualizacionResuestaEvalua() {
		
		Helpers.threadSleepMillis(Helpers.defaultMillis1);
		
		if(driver.findElement(ImagenRespuestaEvaluacion).isDisplayed()) {
			
			return true;
		}else {
			
			return false;
		}
		
		
	}

	//TCS-62

	public void AceptoRechazoEvaluacion() {
		
		PageHome siev = new PageHome(driver,environment);
		siev.SiFirmaFisicaDoc();
		
	}

	//TCS-157 y 58

	public void EliminarPdfGenerado() {
		
		driver.findElement(BotonFirmaFisica).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		driver.findElement(BotonDatosConfirmadosEvaluacion).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		
		driver.findElement(BotonDescargaDocInvesPersoFisi).click();
		Helpers.threadSleepMillis(Helpers.defaultMillis);
		Helpers.threadSleepMillis(Helpers.defaultMillis);
			
	}
	
	
}
