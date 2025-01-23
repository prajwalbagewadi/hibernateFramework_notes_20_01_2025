package com.prajwal.Hibernate3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import java.time.LocalDate;

@Entity
@Table(name="Employee")
public class Emp { //POJO class
	@Id
	private int eid;
	private String ename;
	@Transient
	private String desg;
	@Column(name="deptname")
	private String dname;
	private double Sal;
	@Temporal(value=TemporalType.DATE)
	private LocalDate login;
	public LocalDate getLogin() {
		return login;
	}
	public void setLogin(LocalDate login) {
		this.login = login;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", desg=" + desg + ", dname=" + dname + ", Sal=" + Sal
				+ ", login=" + login + "]";
	}
	
	
	
}
