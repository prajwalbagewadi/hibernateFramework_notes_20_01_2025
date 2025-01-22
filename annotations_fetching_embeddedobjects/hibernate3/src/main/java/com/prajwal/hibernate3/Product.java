package com.prajwal.hibernate3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
//annotations
@Entity //(name="products_Catalog")
@Table (name="products_table")
public class Product {
	@Id
	private int pid;
	private String pname;
	@Column(name="product_category")
	//embedded objects
	private Product_SubCategory pcat;
	//@Transient
	private double price;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public Product_SubCategory getPcat() {
		return pcat;
	}
	public void setPcat(Product_SubCategory pcat) {
		this.pcat = pcat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	//used to retrieve the database record and convert hash value toString value.
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcat=" + pcat + ", price=" + price + "]";
	}
	
	
}
