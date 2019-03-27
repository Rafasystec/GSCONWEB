package br.com.gsconweb.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import br.com.gsconweb.core.model.vars.Vars;

@MappedSuperclass
public abstract class SuperEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8535860641291662663L;

	public SuperEntity() {

	}

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name=Vars.ID, nullable=false)
	private Long id;
	@Column(name="REGISTRATION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date registration = new Date();

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getRegistration() {
		return registration;
	}
	public void setRegistration(Date registration) {
		this.registration = registration;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuperEntity other = (SuperEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
