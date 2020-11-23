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
    private String localId;
    private String groupId;
    private String firstName;
    private String lastName;
    private String email;
    private String site;

    public User() {
    	
    }

	public User(String localId, String groupId, String fisrtName, String lastName, String email, String site) {
		super();
		this.localId = localId;
		this.groupId = groupId;
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.email = email;
		this.site = site;
	}
	
    
    public String getLocalId() {
		return localId;
	}


	public void setLocalId(String localId) {
		this.localId = localId;
	}


	public String getGroupId() {
		return groupId;
	}


	public void setGroupId(String groupId) {
		this.groupId = groupId;
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

