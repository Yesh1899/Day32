package com.java.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agent")
public class Agent implements Serializable{
	@Id
	@Column(name="agentId")
	private int agentId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="city")
	private String city;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="maritalStatus")
	private int maritalStatus;
	
	@Column(name="premium")
	private double premium;

	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", maritalStatus=" + maritalStatus + ", premium=" + premium + "]";
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}

}