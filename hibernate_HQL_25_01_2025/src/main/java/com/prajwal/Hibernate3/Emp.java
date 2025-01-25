package com.prajwal.Hibernate3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import java.time.LocalDate;
//annotations
@Entity
@Table(name="Employee")
public class Emp { //POJO class
	@Id
	private int eid;
	//embedded object
	private EmpName ename;
	//@Transient
	private String desg;
	//@Column(name="dept_id")
	private int did;
	@ManyToOne
	@JoinColumn(name="dept_id",referencedColumnName = "did")
	private Dept dept;
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
	public EmpName getEname() {
		return ename;
	}
	public void setEname(EmpName ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", desg=" + desg + ", did=" + did + ", dept=" + dept + ", Sal="
				+ Sal + ", login=" + login + "]";
	}
	
	
}
