package com.system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "Schoolclass")
public class Schoolclass {

	  
		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private long id;
		
		private String name;
		
		private long teacherId;
		
		
		public Schoolclass() {
			
		}
		
		public Schoolclass(String name, long teacherId) {
			this.name = name;
			this.teacherId = teacherId;
		}
		
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getTeacherId() {
			return teacherId;
		}

		public void setTeacherId(long teacherId) {
			this.teacherId = teacherId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
}
