package br.com.gsconweb.core.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Condominium extends SuperEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5113623658065014059L;
	public static final String ROOT = "condominium";
	@Override
	public String getRootURL() {
		return ROOT;
	}
	@Column(length=180)
	private String name = "";
	@Temporal(TemporalType.DATE)
	private Date foundation; 
	@OneToMany(mappedBy="condominium")
	private List<Owner> oners;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getFoundation() {
		return foundation;
	}
	public void setFoundation(Date foundation) {
		this.foundation = foundation;
	}
	public List<Owner> getOners() {
		return oners;
	}
	public void setOners(List<Owner> oners) {
		this.oners = oners;
	}
	
}
