package br.com.gsconweb.core.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsconweb.core.model.Condominium;
import br.com.gsconweb.core.repositories.RepoCondominuim;


@Service
public class RuleCondominium implements ISuperRole<Condominium>{

	@Autowired
	private RepoCondominuim repoCondominuim;

	public RepoCondominuim getRepoCondominuim() {
		return repoCondominuim;
	}

	public void setRepoCondominuim(RepoCondominuim repoCondominuim) {
		this.repoCondominuim = repoCondominuim;
	}
	
}
