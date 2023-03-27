package com.khadri.hibernate.identifiers.composite.entities;

import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Student2")
@Table(name = "STUDENT_COMPOSITE")
public class Student {

	@EmbeddedId
	private Register id;
	
	@Basic
	private String schoolName;

	public Register getId() {
		return id;
	}

	public void setId(Register id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
}
