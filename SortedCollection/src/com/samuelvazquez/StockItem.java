package com.samuelvazquez;

import java.util.Objects;


public class StockItem implements Comparable<StockItem>{
	private final String name;
	private double price;
	private int quantityStock = 0;

	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantityStock = 0;
	}

	public StockItem(String name, double price, int quantityStock) {
		this.name = name;
		this.price = price;
		this.quantityStock = quantityStock;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int quantityInStock() {
		return quantityStock;
	}

	public void setPrice(double price) {
		if(price > 0.0) {
			this.price = price;
		}
	}

	public void adjustStock(int quantity) {
		int newQuantity = this.quantityStock + quantity;
		if(newQuantity >= 0) {
			this.quantityStock = newQuantity;
		}
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Entering StockItem.equals");
		//First we will do a test to see whether we actually testing against
		//the same object in memory
		if(this == obj) {
			//return true because its actually the same object, same instance of the object
			return true;
		}
		//if obj is null or the class of obj is different to my class we can't compare them. So returns false
		if((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}
		//I'm comparing the name of our current object I'm running in, versus the object that's been passed this method
		String objName = ((StockItem) obj).getName();
		return this.name.equals(objName);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + 31;
	}

	@Override
	public int compareTo(StockItem o) {
		System.out.println("Entering StockItem.compareTo");
		if(this == o) {
			return 0;
		}
		if(o!=null) {
			return this.name.compareTo(o.getName());
		}
		throw new NullPointerException();
	}

	@Override
	public String toString() {
		return this.name + " : price + " + this.price;
	}

	//	@Override
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (o == null || getClass() != o.getClass())
//			return false;
//		StockItem stockItem = (StockItem) o;
//		return name.equals(stockItem.name);
//	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
}
