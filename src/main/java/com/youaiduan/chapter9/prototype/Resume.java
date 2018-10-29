package com.youaiduan.chapter9.prototype;

public class Resume implements Cloneable{
	private String name;
	private String sex;
	private int age;
	private String timeArea;
	private String company;
	private WorkExperience workExperience;
	
	
	
	public Resume() {
		super();
		this.workExperience = new WorkExperience();
	}

	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String timeArea, String company) {
		this.workExperience.setCompany(company);
		this.workExperience.setWorkDate(timeArea);
	}

	public void dispaly() {
		System.out.println(String.format("%s %s %d", name, sex, age));
		System.out.println(String.format("工作经历：%s %s", timeArea, company));
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTimeArea() {
		return timeArea;
	}
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume newValue = (Resume) super.clone();
		newValue.workExperience = (WorkExperience) workExperience.clone();
		return newValue;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume();
		resume.setSex("男");
		resume.setAge(29);
		resume.setName("大鸟");
		resume.setWorkExperience("1998-2000", "金蝶");
//		resume.setTimeArea("1998-2000");
//		resume.setCompany("金蝶软件");
		
		Resume resume2 = (Resume) resume.clone();
		resume.setWorkExperience("2000-2008", "百度");
//		resume2.setTimeArea("1998-2006");
//		resume2.setCompany("百度");
		
		System.out.println(resume);
		System.out.println(resume2);
	}

	@Override
	public String toString() {
		return "Resume [name=" + name + ", sex=" + sex + ", age=" + age + ", workExperience=" + workExperience + "]";
	}


	
	
}
