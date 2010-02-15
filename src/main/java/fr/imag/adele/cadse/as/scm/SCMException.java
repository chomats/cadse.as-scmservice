package fr.imag.adele.cadse.as.scm;

public class SCMException extends Exception {

	private static final long serialVersionUID = 5842122846790831903L;

	public SCMException(String message) {
		super(message);
	}
	
	public SCMException(String message, Throwable cause) {
        super(message, cause);
    }
}
