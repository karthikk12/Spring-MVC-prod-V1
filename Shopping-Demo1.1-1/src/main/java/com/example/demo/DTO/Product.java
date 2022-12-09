package com.example.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	//prodId, Laptops, Mobiles, custId, productId, cid
	
	@Id
	@Column(name = "prodId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;

	@Column(name = "Laptops")
	private String laptops;

	@Column(name = "Mobiles")
	private String mobiles;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer customer;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getLaptops() {
		return laptops;
	}

	public void setLaptops(String laptops) {
		this.laptops = laptops;
	}

	public String getMobiles() {
		return mobiles;
	}

	public void setMobiles(String mobiles) {
		this.mobiles = mobiles;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

	
	

}
