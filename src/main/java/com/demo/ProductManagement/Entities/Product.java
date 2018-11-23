package com.demo.ProductManagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="Product")
//By Named NativeQuery
//@NamedNativeQueries(value = { @NamedNativeQuery(name = "Product", query = "select * from product where product_name=?1 and product_price=?2",resultClass=Product.class) })
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productid;
	
	private String productName;
	private int productPrice;
	public Product() {
		super();
	}
	public Product(int productid, String productName, int productPrice) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
}
