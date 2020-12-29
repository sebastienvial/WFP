package com.wfp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private String firstName;
    private String lastName;
    private String email;
	private String site;
	private String imageUrl;
	private String primaryPl;
	private String title;
	private String role;
	private String expertise;
	private String cl;

    public User() {
    	
    }

	public User(String primaryPl, String imageUrl, String fisrtName, String lastName, String email, String site, String title) {
		super();
		this.primaryPl = primaryPl;
		this.imageUrl = imageUrl;
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.email = email;
		this.site = site;
		this.title = title;
	}
	
    
    public Integer getId() {
		 return id;
	}

	public String getCl() {
		return cl;
	}

	public String getRole() {
		return role;
	}

	public String getTitle() {
		return title;
	}

	public String getExpertise() {
		return expertise;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrimaryPl() {
		return primaryPl;
	}


	public void setPrimaryPl(String primaryPl) {
		this.primaryPl = primaryPl;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSite() {
		return site;
	}
	
	public void setSite(String site) {
		this.site = site;
	}

}

