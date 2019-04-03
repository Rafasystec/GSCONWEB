package br.com.gsconweb.core.model.wrapper;

import java.util.List;

import br.com.gsconweb.core.model.User;

public class UserWrapper extends SuperWrapper<User> {
	private List<User> list;
	private User user;
	@Override
	public List<User> getList() {
		return this.list;
	}

	@Override
	public User get() {
		return user;
	}

	@Override
	public void setList(List<User> list) {
		this.list = list;
		
	}

	@Override
	public void set(User entity) {
		this.user = entity;
		
	}

}
