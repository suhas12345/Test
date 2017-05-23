package com.suhas.TestException;

public class Items {
	
	private String name;
	
	private float price;
	
	public Items(String name, float price) {
		this.name = name;
		this.price =price;
		}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	

}
