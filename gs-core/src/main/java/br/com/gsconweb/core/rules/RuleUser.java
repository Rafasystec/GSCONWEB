package br.com.gsconweb.core.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsconweb.core.exception.ValidationException;
import br.com.gsconweb.core.model.User;
import br.com.gsconweb.core.repositories.RepoUser;

@Service
public class RuleUser extends SuperRule {
	@Autowired
	private RepoUser repoUser;

	public User save(User user) throws ValidationException {
		validate(user);
		return repoUser.save(user);
	}
	
	public void validate(User user) throws ValidationException{
		User findByEmail = repoUser.findByEmail(user.getEmail());
		if(findByEmail != null){
			throwValidation("Já existe esse email");
		}
	}

}
