package br.com.gsconweb.core.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class SyndicManagement extends SuperEntity{

	private Date dtInitial;
	private Date dtFinal;
	private Owner syndic;
	private Owner subSyndic;
	private List<Owner>  mentors;
	
	
}
