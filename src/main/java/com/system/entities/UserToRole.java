package com.system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class UserToRole {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
    private long user_id;
	
	private long role_id;

	public long getUserId() {
		return user_id;
	}

	public void setUserId(long user_id) {
		this.user_id = user_id;
	}

	public long getRoleId() {
		return role_id;
	}

	public void setRoleId(long role_id) {
		this.role_id = role_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
