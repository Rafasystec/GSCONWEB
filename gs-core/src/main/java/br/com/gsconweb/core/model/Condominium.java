package br.com.gsconweb.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Condominium extends SuperEntity{
	@Column(length=180)
	private String description = "";
	@Temporal(TemporalType.DATE)
	private Date foundation; 
}
