package br.com.gsconweb.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="USERS")
public class User extends SuperEntity{

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
    
    

}
