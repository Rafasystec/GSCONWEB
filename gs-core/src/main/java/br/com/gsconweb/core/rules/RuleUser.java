package br.com.gsconweb.core.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsconweb.core.repositories.RepoUser;

@Service
public class RuleUser {
	@Autowired
	private RepoUser repoUser;

	public RepoUser getRepoUser() {
		return repoUser;
	}

	public void setRepoUser(RepoUser repoUser) {
		this.repoUser = repoUser;
	}

}
