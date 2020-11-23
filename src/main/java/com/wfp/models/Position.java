package com.wfp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Position {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String entryDate;
	private String reference;
	private String status;
	private String contract;
	private String site;
	private String region;
	private String primaryPl;
	private String controlling;
	private String title;
	private String cl;
	private String exitDate;
	private String exitReason;
	private String note;
	@ManyToOne
	private User user;

	public Position(String entryDate, String reference, String status, String contract, String site, String region,
			String primaryPl, String controlling, String title, String cl, String exitDate, String exitReason,
			String note, User user) {
		super();
		this.entryDate = entryDate;
		this.reference = reference;
		this.status = status;
		this.contract = contract;
		this.site = site;
		this.region = region;
		this.primaryPl = primaryPl;
		this.controlling = controlling;
		this.title = title;
		this.cl = cl;
		this.exitDate = exitDate;
		this.exitReason = exitReason;
		this.note = note;
		this.user = user;
	}

	public Position() {
		super();
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPrimaryPl() {
		return primaryPl;
	}

	public void setPrimaryPl(String primaryPl) {
		this.primaryPl = primaryPl;
	}

	public String getControlling() {
		return controlling;
	}

	public void setControlling(String controlling) {
		this.controlling = controlling;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCl() {
		return cl;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

	public String getExitDate() {
		return exitDate;
	}

	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}

	public String getExitReason() {
		return exitReason;
	}

	public void setExitReason(String exitReason) {
		this.exitReason = exitReason;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}
	
	
	

}
