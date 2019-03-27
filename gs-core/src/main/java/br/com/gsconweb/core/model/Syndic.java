package br.com.gsconweb.core.model;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Syndic extends SuperEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5114767171285682613L;
	@OneToOne
	@MapsId
	private Owner person;

	public Owner getPerson() {
		return person;
	}

	public void setPerson(Owner person) {
		this.person = person;
	}
	
}
