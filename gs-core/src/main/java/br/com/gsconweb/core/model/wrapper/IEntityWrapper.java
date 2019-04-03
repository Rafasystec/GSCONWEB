package br.com.gsconweb.core.model.wrapper;

import java.util.List;

public interface IEntityWrapper<T> {

	public List<T> getList();
	public T get();
	public void setList(List<T> list);
	public void set(T entity);
}
