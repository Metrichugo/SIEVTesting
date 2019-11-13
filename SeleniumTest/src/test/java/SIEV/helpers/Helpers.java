package SIEV.helpers;

import java.util.Calendar;
import java.util.Date;

public class Helpers {

	public static final int defaultMillis = 500;
	
	public static void threadSleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void threadSleepMillis(int millis) {
		try {
			Thread.sleep(millis);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public class LoginPageHelpers {
		public static final String USER_VALUE = "64625";
		public static final String WRONG_USER_VALUE = "user";
		public static final String PASS_VALUE = "gold8686";
		public static final String WRONG_PASS_VALUE = "password";
		public static final String REGION_VALUE = "Region 9";
		public static final String USER_TYPE_VALUE = "EMPLEADOS DEUR";
		public static final String WRONG_REGION_VALUE = "Region 2";
		public static final String WRONG_USER_TYPE_VALUE = "PROMOTORES";
	}
	
	public class EvaluacionPageHelpers{
		/*Movimiento*/
		public static final String REGION_VALUE = "R08";
		public static final String CANAL_VALUE = "CACS";
		public static final String FUERZA_VENTA_VALUE = "CAC CAD  TAPACHULA I PZA CRISTAL - RACD115";
		/*Tipo Movimiento*/
		public static final String MOVIMIENTO_VALUE = "ACTIVACION";
		public static final String PROYECTO_VALUE = "CLIENTE NACIONAL";
		/*Tipo Evaluacion*/
		public static final String TIPO_PLAZO_VALUE = "LIBRE";
		public static final String FORMA_PAGO_VALUE = "DOMICILIACION";
		/*Datos Personales*/
		public static final String LASTNAME_VALUE = "MORALES";
		public static final String SECOND_LASTNAME_VALUE = "DOMINGO";
		public static final String FIRST_NAME_VALUE = "FABIANA";
		public static final String SECOND_NAME_VALUE = "";
		public static final String FEC_NAC_VALUE = "20/12/1985";
		/*Domicilio Personal*/
		public static final String CONTACTO_VALUE = "5512345678";
		/*Informaci�n Crediticia*/
		public static final String TARJETA_VALUE = "NO";
		public static final String CREDITO_AUTO = "No tiene cuenta automotriz";
		public static final String CREDITO_BANCO = "No tiene cuenta bancaria";
	
		
		/*Helper Methods*/
		public String getInvoicePattern() {
			return "FIEV" + getYear() + REGION_VALUE.substring(2,3) + "[0-9]{6,7}".trim();
		}
		
		public String getYear() {
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return Integer.toString(calendar.get(Calendar.YEAR));
		}
	}
}
