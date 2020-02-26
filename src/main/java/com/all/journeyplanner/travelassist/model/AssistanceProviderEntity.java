package com.all.journeyplanner.travelassist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * Address is persistence Entity - database used apache derby
 * 
 * @author Shruti Mahapatra
 *
 */


@Entity
@Table(name="Assisstance_Provider_Entity")	
public class AssistanceProviderEntity {
	
	/**
	 * @param Id
	 * @param postCode
	 * @param suburb
	 */
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	private String fromDate;
    private String toDate;
    private String source;
    private String destination;
    private String serviceType;
    private String userType;
	
	public AssistanceProviderEntity(int id,String fromDate, String toDate,String source,String destination,String serviceType,String userType, String Provider, String CHarges) {
		super();
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.source = source;
		this.destination = destination;
		this.serviceType = serviceType;
		this.userType = userType;
		
	}

	public AssistanceProviderEntity() {
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getdestination() {
		return destination;
	}
	public void setdestination(String destination) {
		this.destination = destination;
	}
	public String getserviceType() {
		return serviceType;
	}
	public void setserviceType(String serviceType) {
		this.serviceType= serviceType;
	}
	public String getuserType() {
		return userType;
	}
	public void setuserType(String userType) {
		this.userType = userType;
	}
	public String getfromDate() {
		return fromDate;
	}
	public void setfromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String gettoDate() {
		return toDate;
	}
	public void settoDate(String toDate) {
		this.toDate = toDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
}