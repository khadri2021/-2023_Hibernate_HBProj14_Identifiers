package com.khadri.hibernate.identifiers.composite.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Register implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int registerNo;

	private String registerName;

	public int getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}

	public String getRegisterName() {
		return registerName;
	}

	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		Register register = (Register) obj;

		return Objects.equals(register.getRegisterNo(), this.registerNo)
				&& Objects.equals(register.getRegisterName(), this.registerName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.registerNo, this.registerName);
	}

}
