package br.com.gsconweb.core.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsconweb.core.repositories.IRepoCondominium;

@Service
public class RuleCondominium {

	@Autowired
	private IRepoCondominium repoCondominium;
}
