package br.com.gsconweb.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Unit extends SuperEntity {

	@Column(nullable=false)
	private Integer number;
	@Column(nullable=true,length=80)
	private String block;
	
}
