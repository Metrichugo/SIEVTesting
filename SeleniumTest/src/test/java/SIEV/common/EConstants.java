package SIEV.common;

public enum EConstants {

	// PROD --> QA
	END_POINT("https://10.119.249.162:8181/SIEV/","http://www.telceltest85.telcel.com:19500/SIEV/"),
	USER_TYPE("loginForm:j_idt52_input","loginForm:j_id_21_input"),
	USER_LOGED("encabezadoForm:j_idt21","encabezadoForm:j_id_t"),
	RFC_BUTTON("formSiev:j_idt107","formSiev:j_id_40"),
	FILL_DOMICILIO_BUTTON("formDlg:tblClientes:0:j_idt321","formDlg:tblClientes:0:j_id_cm"),
	FOLIO_SIEV_RESULT("formSiev:resultadoForm:j_idt199","formSiev:resultadoForm:j_id_7o"),
	NOVALIDAR_BUTTON("ticketsForm:j_idt308","ticketsForm:j_id_by"),
	NUEVA_VALIDACION("ticketsForm:j_idt313","ticketsForm:j_id_c8"),
	AGREGAR_REFERENCIA_BUTTON("datosClienteForm2:tblReferencias:j_idt278","datosClienteForm2:tblReferencias:j_id_an"),
	NOMBRE_REF_ADDED("datosClienteForm2:tblReferencias:0:j_idt280","datosClienteForm2:tblReferencias:0:j_id_ap"),
	APELLIDOS_REF_ADDED("datosClienteForm2:tblReferencias:0:j_idt282","datosClienteForm2:tblReferencias:0:j_id_ar"),
	TELEFONO_REF_ADDED("datosClienteForm2:tblReferencias:0:j_idt284","datosClienteForm2:tblReferencias:0:j_id_at"),
	NONAME_REF_ADDED("datosClienteForm2:tblReferencias:2:j_idt280","datosClienteForm2:tblReferencias:2:j_id_ap"),
	NOAPELLIDOS_REF_ADDED("datosClienteForm2:tblReferencias:2:j_idt282","datosClienteForm2:tblReferencias:2:j_id_ar"),
	NOTELEFONO_REF_ADDE("datosClienteForm2:tblReferencias:2:j_idt284","datosClienteForm2:tblReferencias:2:j_id_at"),
	FOLIO_SISACT("datosClienteForm2:j_idt292","datosClienteForm2:j_id_b3"),
	AUTH_BURO_BUTTON("formSiev:j_idt142","formSiev:j_id_5e")
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
