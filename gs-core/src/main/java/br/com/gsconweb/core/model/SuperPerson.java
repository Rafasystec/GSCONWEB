package br.com.gsconweb.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class SuperPerson extends SuperEntity{

	@Column(length=180,nullable=false)
	private String name = "";
	private String cpf;
	private Date birth;
}
