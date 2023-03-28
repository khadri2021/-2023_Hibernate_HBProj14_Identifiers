package com.khadri.hibernate.identifiers.composite.idclass.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity(name = "Student2")
@Table(name = "STUDENT_COMPOSITE_IDCLASS")
@IdClass(Register.class)
public class Student {

	@Id
	private int registerNo;

	@Id
	private String registerName;

	@Basic
	private String schoolName;

	public void setId(int registerNo, String registerName) {
		this.registerNo = registerNo;
		this.registerName = registerName;
	}
	
	public Register getId() {
		return new Register(registerNo,registerName);
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
