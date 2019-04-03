package br.com.gsconweb.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="USERS",
	indexes={@Index(columnList="email",name="USERS_EMAIL",unique=true)}
)
public class User extends SuperEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4862267639960250548L;

	@Column(length=120,nullable=false)
	@NotBlank(message = "Name is mandatory")
    private String name;
     
    @NotBlank(message = "Email is mandatory")
    @Column(length=80,nullable=false)
    private String email;
    
    @NotBlank(message = "PassWord is mandatory")
    @Column(length=80,nullable=false)
    private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
	
	public static final String ROOT = "user";
	@Override
	public String getRootURL() {
		return ROOT;
	}
    

}
