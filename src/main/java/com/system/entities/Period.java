package com.system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Period")
public class Period {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

	String period;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	
	
	
}
