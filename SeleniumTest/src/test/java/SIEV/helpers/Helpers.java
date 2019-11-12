package SIEV.helpers;

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
		public static final String FIRST_NAME_VALUE = "FABIANA";
		public static final String SECOND_NAME_VALUE = "";
		public static final String LASTNAME_VALUE = "MORALES";
		public static final String SECOND_LASTNAME_VALUE = "DOMINGO";
		public static final String REGION_VALUE = "R09";
		public static final String CANAL_VALUE = "CACS";
		public static final String FUERZA_VENTA_VALUE = "DISTRIBUIDOR DE PRUEBAS - PRUEBAS";
		public static final String MOVIMIENTO_VALUE = "ACTIVACION";
		public static final String PROYECTO_VALUE = "CLIENTE NACIONAL";
		public static final String TIPO_PLAZO_VALUE = "LIBRE";
		public static final String FORMA_PAGO_VALUE = "DOMICILIACION";
	}
}
