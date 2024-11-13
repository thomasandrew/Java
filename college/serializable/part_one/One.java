package model;

import java.io.Serializable;

public class One implements Serializable {
	private String name;
	private Double price;
	private static final long serialVersionID = 1l;
	
	public One() {};
	
	public One(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
}
