package br.com.gsconweb.core.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import br.com.gsconweb.core.model.vars.Vars;

@Entity
public class SyndicManagement extends SuperEntity{

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtInitial;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtFinal;
	@OneToOne
	@MapsId(value="OWNER_SYND_ID")
	private Owner syndic;
	@OneToOne
	@MapsId(value="OWNER_SUBSYND_ID")
	private Owner subSyndic;
	@OneToMany
    @Fetch(FetchMode.JOIN)
    @JoinTable(
    		name = "MANAGE_MENTORS",
    		joinColumns = @JoinColumn(
    				name = "MANAGE_ID",
    				referencedColumnName = Vars.ID
    				),
    		inverseJoinColumns = @JoinColumn(
    				name = "MENTOR_ID",
    				referencedColumnName = Vars.ID
    				)
    )
    @JsonIgnore
	private List<Owner>  mentors;
	public Date getDtInitial() {
		return dtInitial;
	}
	public void setDtInitial(Date dtInitial) {
		this.dtInitial = dtInitial;
	}
	public Date getDtFinal() {
		return dtFinal;
	}
	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}
	
	public static final String ROOT = "syndicmanagement";
	@Override
	public String getRootURL() {
		return ROOT;
	}
}
