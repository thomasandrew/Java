package model;

import java.io.Serializable;

public class Three implements Serializable {
	private transient Two product;
	private Double total;
	
	public Three() {
		
	}
	
	public Three(Two product, Double total) {
		this.product = product;
		this.total = total;
	}

	public Two getProduct() {
		return product;
	}

	public void setProduct(Two product) {
		this.product = product;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
