package br.com.gsconweb.core.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import br.com.gsconweb.core.enums.EnumTypeOwner;
@Entity
public class Owner extends SuperEntity{
	
	@Enumerated(EnumType.STRING)
	private EnumTypeOwner type;
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId(value="CONDOMINIUM")
	private Condominium condominium;
	public EnumTypeOwner getType() {
		return type;
	}
	public void setType(EnumTypeOwner type) {
		this.type = type;
	}
	public Condominium getCondominium() {
		return condominium;
	}
	public void setCondominium(Condominium condominium) {
		this.condominium = condominium;
	}
	
	

}
