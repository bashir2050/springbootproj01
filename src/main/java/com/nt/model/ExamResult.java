package com.nt.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.nt.adapter.SqlDateAdapter;

//@Data
@XmlRootElement(name = "ExamResult")
public class ExamResult {
	
	private int id;
	private int semester;
	private Date dob;
	private float percentage;
	
	@XmlElement(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement(name = "sem")
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester =semester;
	}
	
	@XmlElement(name = "dob")
	@XmlJavaTypeAdapter(type = java.sql.Date.class ,value = SqlDateAdapter.class)
	public java.sql.Date getDob() {
		return dob;
	}
	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}
	
	@XmlElement(name = "avg")
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
