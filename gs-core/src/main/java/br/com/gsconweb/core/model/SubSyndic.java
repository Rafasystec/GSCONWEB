package br.com.gsconweb.core.model;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class SubSyndic extends SuperEntity {
	
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
