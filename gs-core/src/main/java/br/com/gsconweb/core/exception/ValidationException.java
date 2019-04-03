package br.com.gsconweb.core.exception;

public class ValidationException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3523658073285323914L;
	private final String codeError;
	public ValidationException(String message) {
		super(message);
		codeError="";
	}
	
	public ValidationException(String message,String codeError) {
		
		super(message);
		this.codeError=codeError;
	}
	public String getCodeError() {
		return codeError;
	}
	
	
}
 