package br.com.gsconweb.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
/**
 * @deprecated use the Entity User instead.
 * @author Rafael Rocha
 *
 */
@Deprecated
@MappedSuperclass
public abstract class SuperPerson extends SuperEntity{

	@Column(length=180,nullable=false)
	private String name = "";
	private String cpf;
	private Date birth;
}
