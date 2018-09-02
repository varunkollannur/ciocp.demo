package com.varun.ciocp.repo.model;


public class Sales implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int Id;
	private String SrId;
	private String ProductName;
	private String Department;
	private String InTime;
	private String OutTime;
	private int Count;
	private double UntiPrice;

	public Sales() {
	}

	public Sales(String SrId, String ProductName, String Department, String InTime, String OutTime, int Count,
			double UntiPrice) {
		this.SrId=SrId;
		this.ProductName=ProductName;
		this.Department=Department;
		this.InTime=InTime;
		this.OutTime=OutTime;
		this.Count=Count;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getSrId() {
		return SrId;
	}

	public void setSrId(String srId) {
		SrId = srId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getInTime() {
		return InTime;
	}

	public void setInTime(String inTime) {
		InTime = inTime;
	}

	public String getOutTime() {
		return OutTime;
	}

	public void setOutTime(String outTime) {
		OutTime = outTime;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

	public double getUntiPrice() {
		return UntiPrice;
	}

	public void setUntiPrice(double untiPrice) {
		UntiPrice = untiPrice;
	}

}
