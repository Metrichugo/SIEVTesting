package SIEV.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
	
	@Before
	public void init() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty(Constants.driverKey,Constants.driverValue);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		environment = Environment.QA;
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
	}*/
	
	// TCS-58
	/*
	@Test
	public void assertNumericFields() {
		PageLogin pageLogin = new PageLogin(driver,environment);
		pageLogin.Login();
		PageHome pageHome = new PageHome(driver,environment);
		pageHome.openEvaluationMenu();
		PageEvaluacion pageEvaluacion = new PageEvaluacion(driver,environment);
		pageEvaluacion.assertOnlyNumericFields();
	}
	
	@AfterMethod
	public void endTest() {
		driver.close();
	}*/
	
	
	//*********************************************************************************************
	//************************* PRUEBAS************************************************************
	//*********************************************************************************************
	//*********************************************************************************************
	
	//TCS-157 FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void Test() {
				
				PageLogin log = new PageLogin(driver,environment);
				log.Login();
				PageHome siev = new PageHome(driver,environment);
				PageHome siev1 = new PageHome(driver,environment);
				PageHome siev2 = new PageHome(driver,environment);
				siev.validacionDomicilioPer();
				siev1.PreparaEvaluacion();
				siev2.EliminarPdfGenerado();
				
						
		}*/
		//TCS-42 FUNCIONA CORRECTAMENTE 
		/*
		@Test
		public void Test() {
				
				PageLogin log = new PageLogin(driver,environment);
				log.Login();
				PageHome siev = new PageHome(driver,environment);
				PageHome siev1 = new PageHome(driver,environment);
				PageHome siev2 = new PageHome(driver,environment);
				PageHome siev3 = new PageHome(driver,environment);
				siev.validacionDomicilioPer();
				siev1.PreparaEvaluacion();
				siev2.SiFirmaFisicaDoc();
				boolean prueba = siev3.VisualizacionResuestaEvalua();
				
				if(prueba == true) {
					
					System.out.println("Validacion: si se muestra  -> la respuesta de evaluacion");
					
				}else {
					
					System.out.println("validacion: problemas con la pagina");
				}	
						

			}*/
		
		//TCS-56   FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void Test() {
				
				PageLogin log = new PageLogin(driver);
				log.Login();
				PageHome siev = new PageHome(driver,environment);
				PageHome siev1 = new PageHome(driver,environment);
				PageHome siev2 = new PageHome(driver,environment);
				PageHome siev3 = new PageHome(driver,environment);
				siev.validacionDomicilioPer();
				siev1.PreparaEvaluacion();
				siev2.SiFirmaFisicaDoc();
				siev3.ClickBotonCapturarTicket();
				
					

			}*/
		
		//TCS-55   FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void Test() {
				
				PageLogin log = new PageLogin(driver,environment);
				log.Login();
				PageHome siev = new PageHome(driver,environment);
				PageHome siev1 = new PageHome(driver,environment);
				PageHome siev2 = new PageHome(driver,environment);
				PageHome siev3 = new PageHome(driver,environment);
				siev.validacionDomicilioPer();
				siev1.PreparaEvaluacion();
				siev2.SiFirmaFisicaDoc();
				boolean prueba = siev3.BotonBandejaDEPago();
				
				if(prueba == true) {
					
					System.out.println("Validacion: si se muestra  -> Boton Captura de Ticket de adeudo, el adeudo activo mas el adeudo inactivo es mayor a Cero");
					
				}else {
					
					System.out.println("validacion: problemas con la pagina");
				}	

			}*/
		
		
		
		//TCS - 25 A  FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void Test() {
				
				PageLogin log = new PageLogin(driver,environment);
				log.Login();
				PageHome siev = new PageHome(driver,environment);
				PageHome siev1 = new PageHome(driver,environment);
				PageHome siev2 = new PageHome(driver,environment);
				siev.validacionDomicilioPer();
				siev1.PreparaEvaluacion();
				siev2.SifirmaElectronicaCancelarCambiarDatos();
				

			}*/
		
		//TCS - 25  FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void Test() {
				
				PageLogin log = new PageLogin(driver,environment);
				log.Login();
				PageHome siev = new PageHome(driver,environment);
				PageHome siev1 = new PageHome(driver,environment);
				PageHome siev2 = new PageHome(driver,environment);
				siev.validacionDomicilioPer();
				siev1.PreparaEvaluacion();
				siev2.SifirmaElectronica();
				

			}*/
		
		
		//TCS-22 A   FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void Test() {
				
				PageLogin log = new PageLogin(driver,environment);
				log.Login();
				PageHome siev = new PageHome(driver,environment);
				PageHome siev1 = new PageHome(driver,environment);
				PageHome siev2 = new PageHome(driver,environment);
				siev.validacionDomicilioPer();
				siev1.PreparaEvaluacion();
				siev2.SiFirmaFisicaDocCanselarCambiarDatos();
				

			}*/
		
		//TCS-22   FUNCIONA CORRECTAMENTE
		/*
	@Test
	public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			PageHome siev1 = new PageHome(driver,environment);
			PageHome siev2 = new PageHome(driver,environment);
			siev.validacionDomicilioPer();
			siev1.PreparaEvaluacion();
			siev2.SiFirmaFisicaDoc();
			

		}*/
		
		//TCS-23  FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			PageHome siev1 = new PageHome(driver,environment);
			PageHome siev2 = new PageHome(driver,environment);
			siev.validacionDomicilioPer();
			siev1.PreparaEvaluacion();
			boolean prueba = siev2.NoFirmaFisicaDoc();
			
			if(prueba == true) {
				
				System.out.println("Validacion: si se muestra en rojo -> No se ha impreso la solicitud de investigacion");
				
			}else {
				
				System.out.println("validacion: problemas con la pagina");
			}	
		
		
		}*/
		
		
		
		//TCS-21  FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			PageHome siev1 = new PageHome(driver,environment);
			siev.validacionDomicilioPer();
			boolean prueba = siev1.PreparaEvaluacion();
			
			if(prueba == true) {
				
				System.out.println("Validacion: si se muestra la ventana de seleccion Modo de Firma");
				
			}else {
				
				System.out.println("validacion: problemas con la pagina");
			}
		
		
		}*/
		
		
		//TCS-20    FUNCIONA CORRECTAMENTE 
		/*
		@Test
		public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			boolean prueba = siev.segunPantallaValdCamposObli();
			
	if(prueba == true) {
				
				System.out.println("Validacion: Es necesrio llenar los campos del domicilio personal");
				
			}else {
				
				System.out.println("validacion: problemas con la pagina");
			}
			
		}*/
		
		
		//TCS-18  FUNCIONA PERFECTAMENTE
		/*
		@Test
		public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			boolean prueba = siev.validacionDomicilioPer();
			
			
			if(prueba == true) {
				
				System.out.println("Validacion: los campos se llenaron correctamente");
				
			}else {
				
				System.out.println("validacion: los campos no se llenaron");
			}
		}*/
		
		
		//TCS-17   FUNCIONA PERFECTAMENTE
		/*
		@Test
		public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			boolean prueba = siev.Rfc();
			
			
			if(prueba == true) {
				
				System.out.println("Validacion: si se genero el RFC");
				
			}else {
				
				System.out.println("No se genero el RFC");
			}
		}*/
		
		//TCs 19 FUNCIONA PERFECTAMENTE
		/*
		@Test
		 public void WaitCerarSecion()
		{
			PageHome siev = new PageHome(driver,environment);
			siev.waitTime();
			
		
		 }*/
		
		
		//TCS-24  FUNCIONA PERFECTAMENTE
		/*
		@Test
		public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			boolean prueba = siev.ValidacionEdad();
					
	if(prueba == true) {
				
				System.out.println("Validacion: EL ususario es menor de edad");
				
			}else {
				
				System.out.println("problemas con la pagina");
			}
			
		}*/

		//TCS-14  FUNCIONA PERFECTAMENTE
		/*
		@Test
		public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			boolean prueba = siev.fechaFormato();
			
		if(prueba == true) {
				
				System.out.println("Validacion: Formato de fecha no valido");
				
			}else {
				
				System.out.println("problemas con la pagina");
			}
			
			System.out.print("Prueba terminada");
			
		}*/
		
		
		//TCS-15 y //TCS-16
		/*
		Para es prueba es necesario que Roy Coffey nos proporcione un usuario de 
		ldap que posea canal de venta y fuerza de venta asignados
		*/
		 
		 
		 
		//TCS-17X	FUNCIONA CORRECTAMENTE
		
		/*
		@Test
		public void Test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			PageHome siev = new PageHome(driver,environment);
			boolean prueba = siev.generarRfc();
			
			if(prueba == true) {
				
				System.out.println("Validacion es necesario llenar todos los campos");
				
			}else {
				
				System.out.println("problemas con la pagina");
			}
			
			System.out.print("Prueba terminada");
			
			
		}*/
		
		//TCS-11  FUNCIONA CORRECTAMENTE

		/*
		@Test
		public void test() {
			
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			
			PageHome siev = new PageHome(driver,environment);
			boolean prueba = siev.opcionEvaluacionActivaciones();
			
			if(prueba == true) {
				
				System.out.println("si se cargo la pagina Evaluacion SIEV Activacion");
				
			}else {
				
				System.out.println("problemas con la pagina");
			}
			
			System.out.print("Prueba terminada");
			
			
		}*/
		
		//TCS-12   FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void test() {
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			
			PageHome siev = new PageHome(driver,environment);
			boolean prueba = siev.consultsReportes();
			
			if(prueba == true) {
				
				System.out.println("si se cargo la pagina");
				
			}else {
				
				System.out.println("problemas con la pagina");
			}
			
			System.out.print("Prueba terminada");
			
		}*/
		
		
		//TCS-12   FUNCIONA CORRECTAMENTE
		/*
		@Test
		public void CerrarSecion() {
			PageLogin log = new PageLogin(driver,environment);
			log.Login();
			
			PageHome siev = new PageHome(driver,environment);
			siev.CerrarSecion();
			
		}*/
	
	
}
