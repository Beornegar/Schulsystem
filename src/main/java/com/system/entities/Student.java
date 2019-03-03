package com.system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private long userId;
	
	private int schoolclassId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public int getSchoolclassId() {
		return schoolclassId;
	}

	public void setSchoolclassId(int schoolclassId) {
		this.schoolclassId = schoolclassId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
