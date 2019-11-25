package SIEV.common;

public enum EConstants {

	// PROD --> QA
	END_POINT("https://10.119.249.162:8181/SIEV/","http://www.telceltest85.telcel.com:19500/SIEV/"),
	USER_NAME_FIELD("loginForm:txtUsr","loginForm:txtUsr"),
	USER_PASSWORD_FIELD("loginForm:txtPwd","loginForm:txtPwd"),
	REGION_DROP("loginForm:cmbRegion_input","loginForm:cmbRegion_input"),
	USER_TYPE("loginForm:j_idt52_input","loginForm:j_id_21_input"),
	LOGIN_BUTTON("loginForm:btnLog","loginForm:btnLog"),
	INVALID_LOGIN_ALERT("/html/body/center[1]/div/div/ul/li","/html/body/center[1]/div/div/ul/li"),
	USER_LOGED("encabezadoForm:j_idt21","encabezadoForm:j_idt21");
	;
	
	private String prod;
	private String QA;
	
	private EConstants(String prod, String QA) {
		this.prod = prod;
		this.QA = QA;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public String getQA() {
		return QA;
	}

	public void setQA(String qA) {
		QA = qA;
	}
	
	
	
}
