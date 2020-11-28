package com.cg.blogging.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name="Admin")
public class Admin extends User
{
	
	@Id
	@Column(name = "user_id")
	private int userId;

	@Column(name = "admin_name")
	private String adminName;

	@Column(name = "admin_contact")
	private String adminContact;
	
// Constructor
	public Admin(int userId, String adminName, String adminContact) {
		super();
		this.userId = userId;
		this.adminName = adminName;
		this.adminContact = adminContact;
	}
	
//	Getters and Setters methods

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

//	To String method
	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", adminName=" + adminName + ", adminContact=" + adminContact + "]";
	}
	
//	HashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		return result;
	}
	
//	Equals method

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (userId != other.userId)
			return false;
		return true;
	}
	

	
	
	
}
