package com.flipkart.entity;



	import java.util.List;

	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.OneToMany;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="Order_details")
	public class OrderEnity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int orderid;
		private String city;
		private int pincode;
		public int getOrderid() {
			return orderid;
		}
		public void setOrderid(int orderid) {
			this.orderid = orderid;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		@OneToMany(targetEntity=ProductEntity.class,cascade=CascadeType.ALL)
		@JoinColumn(name="order_fkey",referencedColumnName="OrderId")
		private List<ProductEntity>products;
		
		public List<ProductEntity> getProducts() {
			return products;
		}
		public void setProducts(List<ProductEntity> products) {
			this.products = products;
		}
		@Override
		public String toString() {
			return "OrderEnity [orderid=" + orderid + ", city=" + city + ", pincode=" + pincode + ", products=" + products
					+ "]";
		}

}
