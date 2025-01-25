package com.prajwal.Hibernate3;

//import jakarta.persistence.Embeddable;
//import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmpDeptJoin")
public class EmpDeptJoin {
	@Id
	private int edj_id;
	private int e_did;
	private int d_did;
	
	public int getEdj_id() {
		return edj_id;
	}
	public void setEdj_id(int edj_id) {
		this.edj_id = edj_id;
	}
	public int getE_did() {
		return e_did;
	}
	public void setE_did(int e_did) {
		this.e_did = e_did;
	}
	public int getD_did() {
		return d_did;
	}
	public void setD_did(int d_did) {
		this.d_did = d_did;
	}
	@Override
	public String toString() {
		return "EmpDeptJoin [edj_id=" + edj_id + ", e_did=" + e_did + ", d_did=" + d_did + "]";
	}
	
}
