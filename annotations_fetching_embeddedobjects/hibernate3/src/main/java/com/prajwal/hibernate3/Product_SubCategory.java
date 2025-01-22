package com.prajwal.hibernate3;

import jakarta.persistence.Embeddable;

@Embeddable
public class Product_SubCategory {
	private String pcat;
	private String p_subcat;
	public String getPcat() {
		return pcat;
	}
	public void setPcat(String pcat) {
		this.pcat = pcat;
	}
	public String getP_subcat() {
		return p_subcat;
	}
	public void setP_subcat(String p_subcat) {
		this.p_subcat = p_subcat;
	}
	@Override
	public String toString() {
		return "Product_SubCategory [pcat=" + pcat + ", p_subcat=" + p_subcat + "]";
	}

	
}
