package br.com.gsconweb.core.rules;

import br.com.gsconweb.core.exception.ValidationException;

public abstract class SuperRule {
	
	protected void throwValidation(String message) throws ValidationException {
		throw new ValidationException(message);
	}

}
