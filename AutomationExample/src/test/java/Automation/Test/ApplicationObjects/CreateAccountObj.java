package Automation.Test.ApplicationObjects;

public interface CreateAccountObj {
	
	public final String TXT_NOMBRE="//*[@id=\"FirstName\"]";
	public final String TXT_APELLIDO="//*[@id=\"LastName\"]";
	public final String TXT_CORREO="//*[@id=\"GmailAddress\"]";
	public final String TXT_PASSWORD="//*[@id=\"Passwd\"]";
	public final String TXT_PASSWORDCONF="//*[@id=\"PasswdAgain\"]";
	public final String TXT_DIA="//*[@id=\"BirthDay\"]";
	public final String TXT_MES="//*[@id=\"BirthMonth\"]/div[1]";
	public final String TXT_ANIO="//*[@id=\"BirthYear\"]";
	public final String TXT_GENERO="//*[@id=\"Gender\"]/div[1]";
	public final String TXT_CELULAR="//*[@id=\"RecoveryPhoneNumber\"]";
	public final String TXT_CORREOALT="//*[@id=\"RecoveryEmailAddress\"]";

}
