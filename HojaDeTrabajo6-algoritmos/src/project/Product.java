package project;

import java.util.Random;

public class Product {
	private String name;
	private int cuantity;
	private int InWarehouse;
	Random rn = new Random();
		
	public Product(String name, int cuantity) {
		this.name = name;
		this.cuantity = cuantity;
		this.InWarehouse = rn.nextInt(150-15)+15;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCuantity() {
		return cuantity;
	}
	public void setCuantity(int cuantity) {
		this.cuantity = cuantity;
	}
	@Override
	public String toString() {
		String r = "" + this.name + " : " + this.cuantity + " unidades";
		return r;
	}
}
