package com.prajwal.Hibernate3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dept {
	@Id
	private int did;
	private String dname;
	private String dloc;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	
}
