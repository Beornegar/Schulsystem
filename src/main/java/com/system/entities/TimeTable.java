package com.system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TimeTable")
public class TimeTable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long periodId;
	
	private long dayOfWeekId;
	
	private long userId;
	
	private long schoolyear;
	
	private long subjectId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(long periodId) {
		this.periodId = periodId;
	}

	public long getDayOfWeekId() {
		return dayOfWeekId;
	}

	public void setDayOfWeekId(long dayOfWeekId) {
		this.dayOfWeekId = dayOfWeekId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getSchoolyear() {
		return schoolyear;
	}

	public void setSchoolyear(long schoolyear) {
		this.schoolyear = schoolyear;
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	
}
