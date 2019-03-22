package br.com.gsconweb.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.gsconweb.core.enums.EnumTypeOwner;
@Entity
public class Owner extends SuperPerson{
	
	
	private EnumTypeOwner type;

}
