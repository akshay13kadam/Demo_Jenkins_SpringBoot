package com.io.jenkins;

public class Product {

	private int id;
	private String productName;
	private int productQunatity;
	private double productPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQunatity() {
		return productQunatity;
	}
	public void setProductQunatity(int productQunatity) {
		this.productQunatity = productQunatity;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(int id, String productName, int productQunatity, double productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productQunatity = productQunatity;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productQunatity=" + productQunatity
				+ ", productPrice=" + productPrice + "]";
	}
	
	
	
	
	
	
	
}
