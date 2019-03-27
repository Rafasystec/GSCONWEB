package br.com.gsconweb.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Unit extends SuperEntity {

	@Column(nullable=false)
	private Integer number;
	@Column(nullable=true,length=80)
	private String block;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}

//	private Owner owner;
	
}
