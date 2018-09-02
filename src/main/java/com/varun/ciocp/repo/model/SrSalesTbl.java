package com.varun.ciocp.repo.model;
// Generated 30 Aug, 2018 10:46:00 PM by Hibernate Tools 5.3.1.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * SrSalesTbl generated by hbm2java
 */
public class SrSalesTbl implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID") 
	private Integer id;
	private String srId;
	private String productName;
	private String department;
	private Date inDate;
	private Date outDate;
	private Integer count;
	private Double unitPrice;

	public SrSalesTbl() {
	}

	public SrSalesTbl(String srId, String productName, String department, Date inDate, Date outDate, Integer count,
			Double unitPrice) {
		this.srId = srId;
		this.productName = productName;
		this.department = department;
		this.inDate = inDate;
		this.outDate = outDate;
		this.count = count;
		this.unitPrice = unitPrice;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSrId() {
		return this.srId;
	}

	public void setSrId(String srId) {
		this.srId = srId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getInDate() {
		return this.inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	public Date getOutDate() {
		return this.outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

}