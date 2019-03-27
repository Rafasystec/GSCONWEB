package br.com.gsconweb.core.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.gsconweb.core.model.User;

public interface RepoUser extends CrudRepository<User, Long>{

}
