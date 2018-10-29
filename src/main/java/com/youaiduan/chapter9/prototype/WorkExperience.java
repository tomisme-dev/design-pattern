package com.youaiduan.chapter9.prototype;

public class WorkExperience implements Cloneable{
	private String workDate;
	private String company;
	
	
	public WorkExperience(String workDate, String company) {
		super();
		this.workDate = workDate;
		this.company = company;
	}

	

	public WorkExperience() {
		super();
	}



	public String getWorkDate() {
		return workDate;
	}


	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}



	@Override
	public String toString() {
		return "WorkExperience [workDate=" + workDate + ", company=" + company + "]";
	}
	
	
	
}
